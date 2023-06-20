package miu.edu.PresentationService.controller;

import miu.edu.PresentationService.domain.Data;
import miu.edu.PresentationService.domain.OntarioEnergyData;
import miu.edu.PresentationService.service.IOntarioEnergyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OntarioEnergyController {

    @Autowired
    private IOntarioEnergyService service;

    @GetMapping("/ontario-energy")
    public ResponseEntity<?> findAll () {
        Data data = new Data(service.findTop2());
        return new ResponseEntity<Data>(data, HttpStatus.OK);
    }
}
