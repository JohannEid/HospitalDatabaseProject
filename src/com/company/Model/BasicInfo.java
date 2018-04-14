package com.company.Model;

public class BasicInfo
{
    private String name;
    private String firstName;
    private String phoneNumber;
    private String adress;

    public BasicInfo(String name, String firstName, String phoneNumber, String adress)
    {
        this.name = name;
        this.firstName = firstName;
        this.phoneNumber = phoneNumber;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
