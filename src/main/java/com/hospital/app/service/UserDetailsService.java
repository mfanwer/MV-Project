package com.hospital.app.service;

import com.hospital.app.bean.PatientDetails;
import com.hospital.app.entity.PatientInfoEntity;
import com.hospital.app.repository.IPatientInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service("userDetailsService")
public class UserDetailsService  implements  IUserDetailsService{

    @Autowired
    private IPatientInfoRepository iPatientInfoRepository;

    @Autowired
    private MapperService mapperService;

    public void onboardPatient(PatientDetails patientDetails){

        PatientInfoEntity patientInfoEntity = mapperService.mapPatientInfoBeanToEntity(patientDetails);
        iPatientInfoRepository.save(patientInfoEntity);

    }

    public Long getRegisteredUsersId(Long hospitalId){

        Optional<PatientInfoEntity> patientInfoEntityOptional = iPatientInfoRepository.findById(hospitalId);
        if (patientInfoEntityOptional.isPresent())
        {
            PatientInfoEntity patientInfoEntity = patientInfoEntityOptional.get();
            return patientInfoEntity.getHospitalId();
        }
        return null ;
    }
}
