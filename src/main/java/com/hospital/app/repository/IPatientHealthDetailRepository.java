package com.hospital.app.repository;

import com.hospital.app.entity.PatientHeathDetailEntity;
import org.hibernate.sql.Select;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface IPatientHealthDetailRepository extends JpaRepository<PatientHeathDetailEntity, Integer> {

    @Query("SELECT p FROM PatientHeathDetailEntity p WHERE p.patientInfo.hospitalId = :hospitalId")
    public List<PatientHeathDetailEntity> findByHospitalId(@Param("hospitalId") Long id);

}
