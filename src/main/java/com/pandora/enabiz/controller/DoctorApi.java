package com.pandora.enabiz.controller;

import com.pandora.enabiz.model.Doctor;
import com.pandora.enabiz.service.abstracts.DoctorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class DoctorApi {


    private final DoctorService doctorService;

    public DoctorApi(DoctorService doctorService) {

        this.doctorService = doctorService;
    }

    @GetMapping("/doctors")
    public List<Doctor> getAllDoctors(){
        return doctorService.getAllDoctors();

    }

    @GetMapping("/doctors/{clinicId}")
    public List<Doctor> getDoctorsByClinicId(@PathVariable(name = "clinicId") Long clinicId){
        return doctorService.getDoctorsByClinicId(clinicId);
    }


    @PostMapping("/doctor")
    public Doctor createDoctor(@RequestBody Doctor doctor) {
      return doctorService.save(doctor);
    }



}
