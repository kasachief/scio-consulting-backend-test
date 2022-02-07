package com.ScioConsulting.BackendTesting.dto;

import java.io.Serializable;

public class HealthUnitDTO implements Serializable {


    private static final long serialVersionUID = -7165345082534684625L;

    private String region;
    private String period;
    private String percentageHospitalsMu;

    public HealthUnitDTO() {
    }

    public HealthUnitDTO(String region, String period, String percentageHospitalsMu) {
        this.region = region;
        this.period = period;
        this.percentageHospitalsMu = percentageHospitalsMu;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getPercentageHospitalsMu() {
        return percentageHospitalsMu;
    }

    public void setPercentageHospitalsMu(String percentageHospitalsMu) {
        this.percentageHospitalsMu = percentageHospitalsMu;
    }

    @Override
    public String toString() {
        return "HealthUnitDTO{" +
                "region='" + region + '\'' +
                ", period='" + period + '\'' +
                ", percentageHospitalsMu='" + percentageHospitalsMu + '\'' +
                '}';
    }
}
