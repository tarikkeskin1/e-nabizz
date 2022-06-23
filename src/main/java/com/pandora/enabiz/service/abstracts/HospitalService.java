package com.pandora.enabiz.service.abstracts;

import com.pandora.enabiz.model.Hospital;

import java.util.List;

public interface HospitalService {
    List<Hospital> getAllHospitals();

    List<Hospital> getHospitalsByCityId(Long cityId);


    Hospital save(Hospital hospital);
}
