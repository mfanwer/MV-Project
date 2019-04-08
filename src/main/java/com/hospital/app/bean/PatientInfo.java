package com.hospital.app.bean;


import java.util.List;

public class PatientInfo {


    private List<HealthParameters> healthParameters;


    public List<HealthParameters> getHealthParameters() {
        return healthParameters;
    }

    public void setHealthParameters(List<HealthParameters> healthParameters) {
        this.healthParameters = healthParameters;
    }
}
