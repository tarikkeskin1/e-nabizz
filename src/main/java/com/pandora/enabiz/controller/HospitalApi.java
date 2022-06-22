package com.pandora.enabiz.controller;

import com.pandora.enabiz.model.Hospital;
import com.pandora.enabiz.service.abstracts.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class HospitalApi {

    @Autowired
    private final HospitalService hospitalService;

    public HospitalApi(HospitalService hospitalService) {
        this.hospitalService = hospitalService;
    }

    @GetMapping("/hospital")
    public List<Hospital> getAllHospitals(){
        return hospitalService.getAllHospitals();

    }

    @GetMapping("/hospital/{cityId}")
    public List<Hospital> getHospitalsByCityId(@PathVariable(name = "cityId") Long cityId){
        return hospitalService.getHospitalsByCityId(cityId);
    }
}
