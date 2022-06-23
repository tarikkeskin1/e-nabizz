package com.pandora.enabiz.repository;

import com.pandora.enabiz.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DoctorRepo extends JpaRepository<Doctor,Long> {
    List<Doctor> getDoctorsByClinicId(Long clinicId);
}
