package com.ScioConsulting.BackendTesting.services;

import com.ScioConsulting.BackendTesting.dto.HealthUnitDTO;
import com.ScioConsulting.BackendTesting.entities.HealthUnitEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class HealthUnitService {

    @Autowired
    private RestTemplate client;

    public List<HealthUnitDTO> getHealthUnits(){
        String uri = "https://www.healthit.gov/data/open-api?source=Meaningful-Use-Acceleration-Scorecard.csv";
        return List.of(client.getForObject(uri, HealthUnitEntity[].class))
                .stream()
                .filter((element)-> element.getRegion() != null && element.getPeriod().equals("2014"))
                .sorted(Comparator.comparing(HealthUnitEntity::getRegion))
                //It should be posible to use a MapperClass here but instead i'm using a map.
                .map((element) -> new HealthUnitDTO(element.getRegion(), element.getPeriod(), element.getPct_hospitals_mu()))
                .collect(Collectors.toList());
    }

}
