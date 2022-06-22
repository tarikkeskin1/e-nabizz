package com.pandora.enabiz.repository;

import com.pandora.enabiz.model.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HospitalRepo extends JpaRepository<Hospital,Long> {
    List<Hospital> getHospitalsByCityId(Long cityId);
}
