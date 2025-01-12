package com.example.demo111;

public class FullBenefit {
    String fullBenefit;
    int benefit_id;

    public FullBenefit(int benefit_id, String fullBenefit) {
        this.benefit_id = benefit_id;
        this.fullBenefit = fullBenefit;
    }

    public String getFullBenefit() {
        return fullBenefit;
    }

    public void setFullBenefit(String fullBenefit) {
        this.fullBenefit = fullBenefit;
    }

    public int getBenefit_id() {
        return benefit_id;
    }

    public void setBenefit_id(int benefit_id) {
        this.benefit_id = benefit_id;
    }



}
