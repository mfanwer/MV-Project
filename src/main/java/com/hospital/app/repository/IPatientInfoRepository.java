package com.hospital.app.repository;

import com.hospital.app.entity.PatientInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface IPatientInfoRepository extends JpaRepository<PatientInfoEntity,Long> {
}
