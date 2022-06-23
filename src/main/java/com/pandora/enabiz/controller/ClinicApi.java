package com.pandora.enabiz.controller;

import com.pandora.enabiz.model.Clinic;
import com.pandora.enabiz.model.Hospital;
import com.pandora.enabiz.service.abstracts.ClinicService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin

@RestController
@RequestMapping("/api")
public class ClinicApi {
    private final ClinicService clinicService;

    public ClinicApi(ClinicService clinicService) {
        this.clinicService = clinicService;
    }

    @GetMapping("/clinics")
    public List<Clinic> getAllClinics() {
        return clinicService.getAllClinics();
    }

    @GetMapping("/clinics/{hospitalId}")
    public List<Clinic> getClinicsByHospitalId(@PathVariable(name = "hospitalId") Long hospitalId){
        return clinicService.getClinicsByHospitalId(hospitalId);
    }



    @PostMapping("/clinic")
    public Clinic createClinic(@RequestBody Clinic clinic) {
        return clinicService.save(clinic);
    }
}
