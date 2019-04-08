package com.hospital.app.service;

import com.hospital.app.bean.HealthParameters;

import com.hospital.app.bean.PatientInfo;
import com.hospital.app.entity.PatientHeathDetailEntity;
import com.hospital.app.repository.IPatientHealthDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service("healthParameterService")
public class HealthParameterService implements IHealthParameterService {

    @Autowired
    public IPatientHealthDetailRepository iPatientHealthDetailRepository;

    @Autowired
    public MapperService mapperService;

    public PatientInfo getPatientDetailsById(Long id) {

        List<PatientHeathDetailEntity> patientHeathDetailEntities = null;
        List<HealthParameters> healthParametersList = new ArrayList<HealthParameters>();
        PatientInfo patientInfo = new PatientInfo();

        patientHeathDetailEntities = iPatientHealthDetailRepository.findByHospitalId(id);

        for (PatientHeathDetailEntity patientHeathDetailEntity : patientHeathDetailEntities) {

            HealthParameters healthParameters = mapperService.mapHealthParameterEntitytoBean(patientHeathDetailEntity);
            healthParametersList.add(healthParameters);

        }

        patientInfo.setHealthParameters(healthParametersList);

        return patientInfo;
    }

    public void persistHeathDetails(List<HealthParameters> healthParametersList) {

        for (HealthParameters healthParameters : healthParametersList) {

            PatientHeathDetailEntity patientHeathDetailEntity = mapperService.mapHealthParameterBeantoEntity(healthParameters);
            iPatientHealthDetailRepository.save(patientHeathDetailEntity);

        }


    }
}



