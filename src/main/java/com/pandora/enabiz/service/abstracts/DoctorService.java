package com.pandora.enabiz.service.abstracts;

import com.pandora.enabiz.model.Doctor;

import java.util.List;

public interface DoctorService {
    List<Doctor> getAllDoctors();

    List<Doctor> getDoctorsByClinicId(Long clinicId);


    Doctor save(Doctor doctor);
}
