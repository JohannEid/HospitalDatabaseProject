package com.company.Model;

import com.company.Control.DataType;
import com.company.Control.QueryBuilder;
import com.company.Control.SQLKeyWords;

import java.util.ArrayList;

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

    public String toString()
    {
        String nameDisplay = (name != null)? "Name: " + name : "";
        String firstNameDisplay = (firstName != null)? " First name: " + firstName : "";
        String phoneNumberDisplay = (phoneNumber != null)? " Phone number: " + phoneNumber : "";
        String adressDisplay = (adress != null)? " Adress: " + adress :  "";

        return nameDisplay + firstNameDisplay + phoneNumberDisplay + adressDisplay;
        
    }

    public String formatForUpdate()
    {
       String setName = (name != " ")?
                QueryBuilder.buildCondition(DataType.Name,name) : "";
       String setFirstName = (firstName != " ")?
                QueryBuilder.buildCondition(DataType.FirstName, firstName)  : "";
       String setPhone = (phoneNumber != " ")?
                QueryBuilder.buildCondition(DataType.PhoneNumber,phoneNumber) : "";
       String setAdress = (adress != " ")?
                QueryBuilder.buildCondition(DataType.Adress, adress): "";

        setName += (setName != "" && setFirstName != "")? ", " : " ";
        setFirstName += (setFirstName != "" && setPhone != "")? ", " : " ";
        setPhone += (setPhone != "" && setAdress != "")? ", " : " ";
        setAdress += " ";

        return setName + setFirstName + setPhone + setAdress;
    }

    public String formatForInsert()
    {
        ArrayList<String> values     = new ArrayList<>();
        ArrayList<String> parameters = new ArrayList<>();

        parameters.add(DataType.Num);
        values.add(DataType.mappingAttributeToParam.get(DataType.Num));

        if (name != " ")
        {
            parameters.add(DataType.Name);
            values.add("'"+ name +"'");
        }
        if (DataType.mappingAttributeToParam.get(DataType.FirstName) != " ")
        {
            parameters.add(DataType.FirstName);
            values.add("'"+ firstName + "'");
        }

        if (adress != " ")
        {
            parameters.add(DataType.Adress);
            values.add("'"+ adress  +"'");
        }


        if (DataType.mappingAttributeToParam.get(DataType.PhoneNumber) != " ")
        {
            parameters.add(DataType.PhoneNumber);
            values.add("'"+ phoneNumber +"'");
        }

        return  QueryBuilder.buildValuesQuery(parameters) + SQLKeyWords.ValuesKeyWord   + QueryBuilder.buildValuesQuery(values);

    }
}
