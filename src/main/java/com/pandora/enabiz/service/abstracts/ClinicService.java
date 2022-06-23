package com.pandora.enabiz.service.abstracts;

import com.pandora.enabiz.model.Clinic;
import com.pandora.enabiz.model.Hospital;

import java.util.List;

public interface ClinicService {

    List<Clinic> getAllClinics();

    Clinic save(Clinic clinic);

    List<Clinic> getClinicsByHospitalId(Long hospitalId);
}
