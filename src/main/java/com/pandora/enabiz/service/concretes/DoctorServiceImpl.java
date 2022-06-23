package com.pandora.enabiz.service.concretes;

import com.pandora.enabiz.model.Doctor;
import com.pandora.enabiz.repository.DoctorRepo;
import com.pandora.enabiz.service.abstracts.DoctorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorServiceImpl implements DoctorService {

    private final DoctorRepo doctorRepo;

    public DoctorServiceImpl(DoctorRepo doctorRepo) {
        this.doctorRepo = doctorRepo;
    }

    @Override
    public List<Doctor> getAllDoctors() {
        return doctorRepo.findAll();
    }

    @Override
    public List<Doctor> getDoctorsByClinicId(Long clinicId) {
        return doctorRepo.getDoctorsByClinicId(clinicId);
    }

    @Override
    public Doctor save(Doctor doctor) {
        return doctorRepo.save(doctor);
    }
}
