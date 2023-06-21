package miu.edu.PresentationService.controller;

import jakarta.servlet.http.HttpServletResponse;
import miu.edu.PresentationService.domain.Data;
import miu.edu.PresentationService.domain.OntarioEnergyData;
import miu.edu.PresentationService.service.IOntarioEnergyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.supercsv.io.CsvBeanWriter;
import org.supercsv.io.ICsvBeanWriter;
import org.supercsv.prefs.CsvPreference;

import java.io.IOException;
import java.util.List;

@RestController
public class OntarioEnergyController {

    @Autowired
    private IOntarioEnergyService service;

//    @GetMapping("/api/ontario-energy")
//    public ResponseEntity<?> findAll () {
//        Data data = new Data(service.findTop2());
//        return new ResponseEntity<Data>(data, HttpStatus.OK);
//    }

    @GetMapping("/export")
    public void exportToCSV (HttpServletResponse response) throws IOException {
        response.setContentType("text/csv");
        String fileName = "ontario-energy.csv";
        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename=" + fileName;
        response.setHeader(headerKey, headerValue);

        Data data = new Data(service.findAll());
        ICsvBeanWriter csvWriter = new CsvBeanWriter(response.getWriter(), CsvPreference.STANDARD_PREFERENCE);

        String[] csvHeader = {"Date & Time", "Time Of Reading", "Power Generated",
                "Ontario Demand", "Total Co2e", "Co2e Intensity", "Nuclear Percentage",
                "Nuclear Output", "Hydro Percentage", "Hydro Output", "Gas Percentage",
                "Gas Output", "Wind Percentage", "Wind Output", "Biofuel Percentage",
                "Biofuel Output", "Solar Percentage", "Solar Output", "Imports", "Exports", "Net Import Exports"};
        String[] nameMapping = {"date", "ontarioEnergy.timeOfReading", "ontarioEnergy.powerGenerated",
                "ontarioEnergy.ontarioDemand", "ontarioEnergy.totalCo2e", "ontarioEnergy.co2eIntensity",
                "ontarioEnergy.nuclearPercentage", "ontarioEnergy.nuclearOutput", "ontarioEnergy.hydroPercentage",
                "ontarioEnergy.hydroOutput", "ontarioEnergy.gasPercentage", "ontarioEnergy.gasOutput",
                "ontarioEnergy.windPercentage", "ontarioEnergy.windOutput", "ontarioEnergy.biofuelPercentage",
                "ontarioEnergy.biofuelOutput", "ontarioEnergy.solarPercentage", "ontarioEnergy.solarOutput",
                "ontarioEnergy.imports", "ontarioEnergy.exports", "ontarioEnergy.netImportExports"};

        csvWriter.writeHeader(csvHeader);
        for (OntarioEnergyData d: data.getData()) {
            csvWriter.write(d, nameMapping);
        }
        csvWriter.close();
    }
}
