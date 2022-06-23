package com.pandora.enabiz.service.concretes;

import com.pandora.enabiz.model.Hospital;
import com.pandora.enabiz.repository.HospitalRepo;
import com.pandora.enabiz.service.abstracts.HospitalService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HospitalServiceImpl implements HospitalService {

    private final HospitalRepo hospitalRepo;

    public HospitalServiceImpl(HospitalRepo hospitalRepo) {
        this.hospitalRepo = hospitalRepo;
    }

    @Override
    public List<Hospital> getAllHospitals() {
        return hospitalRepo.findAll();
    }

    @Override
    public List<Hospital> getHospitalsByCityId(Long cityId) {
        return hospitalRepo.getHospitalsByCityId(cityId);
    }

    @Override
    public Hospital save(Hospital hospital) {
        return hospitalRepo.save(hospital);
    }
}
