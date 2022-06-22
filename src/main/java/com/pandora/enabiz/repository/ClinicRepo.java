package com.pandora.enabiz.repository;

import com.pandora.enabiz.model.Clinic;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClinicRepo extends JpaRepository<Clinic,Long> {
}
