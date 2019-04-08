package com.hospital.app.service;

import com.hospital.app.bean.HealthParameters;
import com.hospital.app.bean.PatientDetails;
import com.hospital.app.entity.PatientHeathDetailEntity;
import com.hospital.app.entity.PatientInfoEntity;
import com.hospital.app.repository.IPatientInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;

@Service
public class MapperService {

    @Autowired
    private IPatientInfoRepository iPatientInfoRepository;

    public HealthParameters mapHealthParameterEntitytoBean(PatientHeathDetailEntity patientHeathDetailEntity)
    {
        HealthParameters healthParameters = new HealthParameters();
        healthParameters.setHospitalId(patientHeathDetailEntity.getPatientInfo().getHospitalId());
        healthParameters.sethCo3(patientHeathDetailEntity.gethCo3());
        healthParameters.setRespiratoryRate(patientHeathDetailEntity.getRespiratoryRate());
        healthParameters.setHeartRate(patientHeathDetailEntity.getHeartRate());
        healthParameters.setImv(patientHeathDetailEntity.getImv());
        healthParameters.setSponBreath(patientHeathDetailEntity.getSponBreath());
        healthParameters.setPaCo2(patientHeathDetailEntity.getPaCo2());
        healthParameters.setSaO2(patientHeathDetailEntity.getSaO2());
        healthParameters.setSpO2(patientHeathDetailEntity.getSpO2());
        healthParameters.setTime(patientHeathDetailEntity.getTime().toString());
        return healthParameters;
    }

    public PatientHeathDetailEntity mapHealthParameterBeantoEntity(HealthParameters healthParameters) {
        PatientHeathDetailEntity patientHeathDetailEntity = new PatientHeathDetailEntity();
        PatientInfoEntity patientInfoEntity = null;
        if (null != healthParameters.getHospitalId()){
            patientInfoEntity = iPatientInfoRepository.findById(healthParameters.getHospitalId()).get();
        }
        patientHeathDetailEntity.setPatientInfo(patientInfoEntity);
        patientHeathDetailEntity.setRespiratoryRate(healthParameters.getRespiratoryRate());
        patientHeathDetailEntity.sethCo3(healthParameters.gethCo3());
        patientHeathDetailEntity.setHeartRate(healthParameters.getHeartRate());
        patientHeathDetailEntity.setImv(healthParameters.getImv());
        patientHeathDetailEntity.setSponBreath(healthParameters.getSponBreath());
        patientHeathDetailEntity.setPaCo2(healthParameters.getPaCo2());
        patientHeathDetailEntity.setSaO2(healthParameters.getSaO2());
        patientHeathDetailEntity.setSpO2(healthParameters.getSpO2());
        patientHeathDetailEntity.setTime(new BigInteger(healthParameters.getTime()));
        return patientHeathDetailEntity;

    }

    public PatientInfoEntity mapPatientInfoBeanToEntity(PatientDetails patientDetails)
    {
        PatientInfoEntity patientInfoEntity = new PatientInfoEntity();
        patientInfoEntity.setPatientName(patientDetails.getPatientName());
        patientInfoEntity.setAge(patientDetails.getAge());
        return  patientInfoEntity;
    }

    public PatientDetails mapPatientInfoEntityToBean(PatientInfoEntity patientInfoEntity)
    {
        PatientDetails patientDetails = new PatientDetails();
        patientDetails.setHospitalId(patientInfoEntity.getHospitalId());
        patientDetails.setPatientName(patientInfoEntity.getPatientName());
        patientDetails.setAge(patientInfoEntity.getAge());
        return patientDetails;
    }

}
