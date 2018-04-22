package com.company.Model;

import com.company.Control.DataType;
import com.company.Control.QueryBuilder;
import com.company.Control.SQLKeyWords;

import java.util.ArrayList;

public class Patient extends Human
{
    private String insurance;
    private Integer ID;

    public Patient(BasicInfo basicInfo, String insurance, Integer ID)
    {
        super(basicInfo);
        this.insurance = insurance;
        this.ID = ID;
    }


    public String getInsurance() {
        return insurance;
    }

    public void setInsurance(String insurance) {
        this.insurance = insurance;
    }

    public String toString()
    {
        String setInsurance = (insurance != null)? "Insurance: " + insurance: " ";
        String setId = (ID != null)? "ID: " + ID  + " ": " ";

        return setId + getBasicInfo().toString() + setInsurance;
    }

    public String formatForUpdate()
    {
        String setInsurance = (insurance != " ")?
                QueryBuilder.buildCondition(DataType.Insurance,insurance) : "";

        String coma = (getBasicInfo().formatForUpdate().trim().length() > 0)? ", " : " " ;

        return getBasicInfo().formatForUpdate() + coma +  setInsurance;
    }


    public String formatForInsert()
    {
        ArrayList<String> values     = new ArrayList<>();
        ArrayList<String> parameters = new ArrayList<>();

        parameters.add(DataType.Num);
        values.add(DataType.mappingAttributeToParam.get(DataType.Num));

        if (getBasicInfo().getName() != " ")
        {
            parameters.add(DataType.Name);
            values.add("'"+ getBasicInfo().getName() +"'");
        }
        if (getBasicInfo().getFirstName() != " ")
        {
            parameters.add(DataType.FirstName);
            values.add("'"+ getBasicInfo().getFirstName() + "'");
        }

        if (getBasicInfo().getAdress() != " ")
        {
            parameters.add(DataType.Adress );
            values.add("'"+ getBasicInfo().getAdress()   +"'");
        }
        if (getBasicInfo().getPhoneNumber() != " ")
        {
            parameters.add(DataType.PhoneNumber );
            values.add("'"+ getBasicInfo().getPhoneNumber()   +"'");
        }

        if (insurance != " ")
        {
            parameters.add(DataType.Insurance );
            values.add("'"+ insurance   +"'");
        }

        return  QueryBuilder.buildValuesQuery(parameters) + SQLKeyWords.ValuesKeyWord   + QueryBuilder.buildValuesQuery(values);
    }

}
