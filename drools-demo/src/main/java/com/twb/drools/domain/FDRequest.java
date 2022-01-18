package com.twb.drools.domain;

public class FDRequest {
    private String bankName;
    private Integer durationInYear;
    private String fdInterestRate;

    public FDRequest(String bankName, Integer durationInYear) {
        this.bankName = bankName;
        this.durationInYear = durationInYear;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public Integer getDurationInYear() {
        return durationInYear;
    }

    public void setDurationInYear(Integer durationInYear) {
        this.durationInYear = durationInYear;
    }

    public String getFdInterestRate() {
        return fdInterestRate;
    }

    public void setFdInterestRate(String fdInterestRate) {
        this.fdInterestRate = fdInterestRate;
    }
}
