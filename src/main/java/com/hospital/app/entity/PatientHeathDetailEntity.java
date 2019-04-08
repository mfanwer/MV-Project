package com.hospital.app.entity;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table(name ="health_params")
public class PatientHeathDetailEntity {
    @Id
    @Column(name="ID")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;



    @Column(name="RESPIRATORY_RATE")
    private Integer respiratoryRate;

    @Column(name="HEART_RATE")
    private Integer heartRate;

    @Column(name="IMV")
    private Integer imv;

    @Column(name="SPONBREATH")
    private Integer sponBreath;

    @Column(name="PACO2")
    private Integer paCo2;

    @Column(name="HCO3")
    private Integer hCo3;

    @Column(name="SPO2")
    private Integer spO2;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public PatientInfoEntity getPatientInfo() {
        return patientInfo;
    }

    public void setPatientInfo(PatientInfoEntity patientInfo) {
        this.patientInfo = patientInfo;
    }

    public Integer getRespiratoryRate() {
        return respiratoryRate;
    }

    public void setRespiratoryRate(Integer respiratoryRate) {
        this.respiratoryRate = respiratoryRate;
    }

    public Integer getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(Integer heartRate) {
        this.heartRate = heartRate;
    }

    public Integer getImv() {
        return imv;
    }

    public void setImv(Integer imv) {
        this.imv = imv;
    }

    public Integer getSponBreath() {
        return sponBreath;
    }

    public void setSponBreath(Integer sponBreath) {
        this.sponBreath = sponBreath;
    }

    public Integer getPaCo2() {
        return paCo2;
    }

    public void setPaCo2(Integer paCo2) {
        this.paCo2 = paCo2;
    }

    public Integer gethCo3() {
        return hCo3;
    }

    public void sethCo3(Integer hCo3) {
        this.hCo3 = hCo3;
    }

    public Integer getSpO2() {
        return spO2;
    }

    public void setSpO2(Integer spO2) {
        this.spO2 = spO2;
    }

    public Integer getSaO2() {
        return saO2;
    }

    public void setSaO2(Integer saO2) {
        this.saO2 = saO2;
    }

    public BigInteger getTime() {
        return time;
    }

    public void setTime(BigInteger time) {
        this.time = time;
    }

//    public PatientInfoEntity getPatientInfo() {
//        return patientInfo;
//    }
//
//    public void setPatientInfo(PatientInfoEntity patientInfo) {
//        this.patientInfo = patientInfo;
//    }

    @Column(name="SAO2")
    private Integer saO2;

    @Column(name="TIME")
    private BigInteger time;

    @ManyToOne
    @JoinColumn(name="HOS_ID", referencedColumnName = "HOS_ID")
    private PatientInfoEntity patientInfo;
}
