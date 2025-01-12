package com.example.demo111;

public class NoBenefit {
    private String noBenefit = "No Benefit";
    private int benefit_id;

    public NoBenefit(int emp_id, String noBenefit) {
        this.benefit_id = emp_id;
        this.noBenefit = noBenefit;
    }

    public String getNoBenefit() {
        return noBenefit;
    }

    public void setNoBenefit(String noBenefit) {
        this.noBenefit = noBenefit;
    }

    public int getBenefit_id() {
        return benefit_id;
    }

    public void setBenefit_id(int benefit_id) {
        this.benefit_id = benefit_id;
    }

}
