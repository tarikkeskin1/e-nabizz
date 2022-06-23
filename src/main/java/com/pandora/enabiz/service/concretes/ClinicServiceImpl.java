package com.pandora.enabiz.service.concretes;

import com.pandora.enabiz.model.Clinic;
import com.pandora.enabiz.model.Hospital;
import com.pandora.enabiz.repository.ClinicRepo;
import com.pandora.enabiz.service.abstracts.ClinicService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClinicServiceImpl implements ClinicService {

    private final ClinicRepo clinicRepo;


    public ClinicServiceImpl(ClinicRepo clinicRepo) {
        this.clinicRepo = clinicRepo;
    }


    @Override
    public List<Clinic> getAllClinics() {
        return clinicRepo.findAll();
    }

    @Override
    public Clinic save(Clinic clinic) {
        return clinicRepo.save(clinic);
    }

    @Override
    public List<Clinic> getClinicsByHospitalId(Long hospitalId) {
        return clinicRepo.getClinicsByHospitalId(hospitalId);
    }
}
