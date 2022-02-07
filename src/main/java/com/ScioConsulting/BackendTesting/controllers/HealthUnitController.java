package com.ScioConsulting.BackendTesting.controllers;


import com.ScioConsulting.BackendTesting.dto.HealthUnitDTO;
import com.ScioConsulting.BackendTesting.services.HealthUnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/health-unit")
public class HealthUnitController {

    @Autowired
    private HealthUnitService healthUnitService;

    @GetMapping
    public ResponseEntity<List<HealthUnitDTO>> getHealthUnits(){
        return new ResponseEntity<>(healthUnitService.getHealthUnits(), HttpStatus.OK);
    }

}
