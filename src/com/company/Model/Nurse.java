package com.company.Model;

import com.company.Control.DataType;
import com.company.Control.QueryBuilder;
import com.company.Control.SQLKeyWords;

import java.util.ArrayList;

public class Nurse extends Employee
{
    private String service;
    private String shift;
    private Double salary;

    public Nurse(BasicInfo basicInfo, int idNumber, String service, String shift, Double salary)
    {
        super(basicInfo, idNumber);
        this.service = service;
        this.shift = shift;
        this.salary = salary;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String toString()
    {
        String serviceDisplay = (service != null)? " Service : " + service : "";
        String shiftDisplay = (shift != null)? " Shift : " + shift : "";
        String salaryDisplay = (salary != null)? " Salary : " + salary : "";

        return super.toString() + serviceDisplay + shiftDisplay + salaryDisplay;
    }
    public String formatForUpdate()
    {
        String setService = (service != null)?
                QueryBuilder.buildCondition(DataType.Service,service) : "";
        String setShift = (shift != null)?
                QueryBuilder.buildCondition(DataType.Rotation, shift)  : "";
        String setSalary = (salary != null)?
                QueryBuilder.buildCondition(DataType.Salary,salary.toString()) : "";


        setService += (setService != "" && setShift != "")? ", " : " ";
        setShift += (setShift != "" && setSalary != "")? ", " : " ";
        setSalary += " ";

        return setService + setShift + setSalary;
    }

    public String formatForInsert()
    {
        ArrayList<String> values     = new ArrayList<>();
        ArrayList<String> parameters = new ArrayList<>();

        parameters.add(DataType.Num);
        values.add(DataType.mappingAttributeToParam.get(DataType.Num));

        if (service != " ")
        {
            parameters.add(DataType.CodeService);
            values.add("'"+ service +"'");
        }
        if (shift != " ")
        {
            parameters.add(DataType.Rotation);
            values.add("'"+ shift + "'");
        }

        if (salary != null)
        {
            parameters.add(DataType.Salary);
            values.add("'"+ salary  +"'");
        }


        return  QueryBuilder.buildValuesQuery(parameters) + SQLKeyWords.ValuesKeyWord   + QueryBuilder.buildValuesQuery(values);

    }
}
