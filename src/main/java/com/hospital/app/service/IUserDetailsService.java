package com.hospital.app.service;

import com.hospital.app.bean.PatientDetails;

public interface IUserDetailsService {

    public void onboardPatient(PatientDetails patientDetails);

    public Long getRegisteredUsersId(Long hospitalId);
}
