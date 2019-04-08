package com.hospital.app.bean;

public class HealthParameters {
    private Long hospitalId;

    public Long getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(Long hospitalId) {
        this.hospitalId = hospitalId;
    }

    private Integer respiratoryRate;

    private Integer heartRate;

    private Integer imv;

    private Integer sponBreath;

    private Integer paCo2;

    private Integer hCo3;

    private Integer spO2;

    private Integer saO2;

    private String time;

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

    public Integer getSponBreath()  {
        return sponBreath;
    }

    public void setSponBreath(Integer sponBreath){
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

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
