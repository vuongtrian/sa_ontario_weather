package miu.edu.PresentationService.domain;

import java.util.ArrayList;
import java.util.Collection;

public class Data {
    private Collection<OntarioEnergyData> data = new ArrayList<>();

    public Data() {
    }

    public Data(Collection<OntarioEnergyData> data) {
        this.data = data;
    }

    public Collection<OntarioEnergyData> getData() {
        return data;
    }

    public void setData(Collection<OntarioEnergyData> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Data{" +
                "data=" + data +
                '}';
    }
}
