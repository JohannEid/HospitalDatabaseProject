package com.company.Model;

public abstract class Infrastructure extends ElementHospital
{
    protected Integer code;

    public Infrastructure(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String toString()
    {
        String setCode = (code != null)? "Code: " + code : " ";
        return setCode;
    }
}
