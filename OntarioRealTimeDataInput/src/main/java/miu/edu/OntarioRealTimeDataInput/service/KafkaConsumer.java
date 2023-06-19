package miu.edu.OntarioRealTimeDataInput.service;

import org.apache.kafka.common.serialization.Serde;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.KeyValue;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.kstream.*;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.support.serializer.JsonDeserializer;
import org.springframework.kafka.support.serializer.JsonSerializer;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.util.ArrayList;

@Component
public class KafkaConsumer {
    @Bean
    public KStream<String, String> kStream(StreamsBuilder kStreamBuilder) {
        KStream<String, String> stream = kStreamBuilder.stream("stream-input", Consumed.with(Serdes.String(), Serdes.String()));
        Duration windowSize = Duration.ofSeconds(10);
        Duration gracePeriod = Duration.ofSeconds(5);
        SessionWindows sessionWindow = SessionWindows.ofInactivityGapAndGrace(windowSize, gracePeriod);

        stream.groupByKey(Grouped.with(Serdes.String(), Serdes.String()))
                .windowedBy(sessionWindow)
                .aggregate(ArrayList<String>::new,
                        (key, value, aggregateFirst) -> { aggregateFirst.add(value); return aggregateFirst; },
                        (key, aggregateFirst, aggregateSecond) -> { aggregateSecond.addAll(aggregateSecond); return aggregateFirst; },
                        Materialized.with(Serdes.String(), this.messageList()))
                .toStream()
                .map((key, value) -> new KeyValue<>(key.key(), value))
                .to("stream-output", Produced.with(Serdes.String(), this.messageList()));

        return stream;
    }

    public Serde<ArrayList> messageList() {
        JsonSerializer<ArrayList> serializer = new JsonSerializer<>();
        JsonDeserializer<ArrayList> deserializer = new JsonDeserializer<>(ArrayList.class);
        return Serdes.serdeFrom(serializer, deserializer);
    }
}
