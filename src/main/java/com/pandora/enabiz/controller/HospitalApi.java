package com.pandora.enabiz.controller;

import com.pandora.enabiz.model.Hospital;
import com.pandora.enabiz.service.abstracts.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class HospitalApi {


    private final HospitalService hospitalService;

    public HospitalApi(HospitalService hospitalService) {

        this.hospitalService = hospitalService;
    }

    @GetMapping("/hospitals")
    public List<Hospital> getAllHospitals(){
        return hospitalService.getAllHospitals();

    }

    @GetMapping("/hospitals/{cityId}")
    public List<Hospital> getHospitalsByCityId(@PathVariable(name = "cityId") Long cityId){
        return hospitalService.getHospitalsByCityId(cityId);
    }


    @PostMapping("/hospital")
    public Hospital createHospital(@RequestBody Hospital hospital) {
      return hospitalService.save(hospital);
    }



}
