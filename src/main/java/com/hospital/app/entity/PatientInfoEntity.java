package com.hospital.app.entity;

import javax.persistence.*;

@Entity
@Table( name ="patient_info")
public class PatientInfoEntity {
    @Id
    @GeneratedValue
    @Column(name ="HOS_ID",unique = true)
    private Long hospitalId;

    @Column(name="PATIENT_NAME")
    private String patientName;

    public Long getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(Long hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Column(name="AGE")
    private Integer age;
}
