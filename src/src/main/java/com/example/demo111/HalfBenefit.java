package com.example.demo111;

public class HalfBenefit {
    private String halfBenefit = "Half Benefit";
    private int benefit_id;

    public HalfBenefit(int emp_id, String halfBenefit) {
        this.benefit_id = emp_id;
        this.halfBenefit = halfBenefit;
    }

    public String getHalfBenefit() {
        return halfBenefit;
    }

    public void setHalfBenefit(String halfBenefit) {
        this.halfBenefit = halfBenefit;
    }

    public int getBenefit_id() {
        return benefit_id;
    }

    public void setBenefit_id(int benefit_id) {
        this.benefit_id = benefit_id;
    }
}
