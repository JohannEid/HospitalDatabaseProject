package com.company.Model;

public abstract class Infrastructure extends ElementHospital
{
    private String code;

    public Infrastructure(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
