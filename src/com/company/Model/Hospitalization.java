package com.company.Model;

import com.company.Control.DataType;
import com.company.Control.QueryBuilder;
import com.company.Control.SQLKeyWords;

import java.util.ArrayList;

public class Hospitalization extends Activity
{
    String serviceCode;
    Integer roomNumber;
    Integer bedNumber;



    public Hospitalization(Integer patient, String serviceCode, Integer roomNumber, Integer bedNumber)
    {
        super(patient);
        this.serviceCode = serviceCode;
        this.roomNumber = roomNumber;
        this.bedNumber = bedNumber;
    }

    public String toString()
    {
        String setId = (getPatient() != null)? "Patient: " + getPatient() + " ": " ";
        String setService = (serviceCode != null)? "Service code: " + serviceCode + " " : " ";
        String setBed = (bedNumber != null)? "Bed number: " + bedNumber + " ": " ";
        String setRoom = (roomNumber != null)? "Room number: " + roomNumber + " " : " ";

        return setId + setService + setBed + setRoom;
    }

    public String formatForUpdate()
    {

        String setService  = (serviceCode != " ")?
                QueryBuilder.buildCondition(DataType.CodeService,serviceCode) : "";
        String setBed  = (bedNumber != null)?
                QueryBuilder.buildCondition(DataType.Bed,bedNumber.toString()) : "";
        String setRoom  = (roomNumber != null)?
                QueryBuilder.buildCondition(DataType.NumRoom, roomNumber.toString()) : "";

        setService += (setService != "" && setBed != "")? ", " : " ";
        setBed += ( setRoom != "")? ", " : " ";
        setRoom += " ";

        return setService + setBed +setRoom;

    }

    public String formatForInsert()
    {
        ArrayList<String> values     = new ArrayList<>();
        ArrayList<String> parameters = new ArrayList<>();

        parameters.add(DataType.NumPatient);
        values.add(DataType.mappingAttributeToParam.get(DataType.NumPatient));

        if ( serviceCode != " ")
        {
            parameters.add(DataType.CodeService);
            values.add("'"+ serviceCode +"'");
        }
        if (bedNumber != null)
        {
            parameters.add(DataType.Bed);
            values.add("'"+ bedNumber + "'");
        }

        if (roomNumber != null)
        {
            parameters.add(DataType.NumRoom );
            values.add("'"+ roomNumber   +"'");
        }
        return  QueryBuilder.buildValuesQuery(parameters) + SQLKeyWords.ValuesKeyWord   + QueryBuilder.buildValuesQuery(values);
    }
}
