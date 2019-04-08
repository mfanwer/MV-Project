package com.hospital.app.service;

import com.hospital.app.bean.HealthParameters;
import com.hospital.app.bean.PatientInfo;
import java.util.List;


public interface IHealthParameterService {



    public PatientInfo getPatientDetailsById(Long id);


    public void persistHeathDetails(List<HealthParameters> healthParametersList);
}
