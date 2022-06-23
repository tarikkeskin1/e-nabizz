package com.pandora.enabiz.repository;

import com.pandora.enabiz.model.Clinic;

import com.pandora.enabiz.model.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClinicRepo extends JpaRepository<Clinic,Long> {
    List<Clinic> getClinicsByHospitalId(Long hospitalId);
}
