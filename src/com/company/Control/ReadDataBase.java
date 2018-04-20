package com.company.Control;

import com.company.Model.BasicInfo;
import com.company.Model.Doctor;
import com.company.Model.ElementHospital;
import com.company.Model.Nurse;

import javax.swing.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

public class ReadDataBase
{

    public static ElementHospital[] readFromDatabase( ArrayList<String> projections, ArrayList<String> conditions, String tableName, Connexion conn)
    {

        String specialCondition = ";";
        HashMap<String, Boolean> selectedProjections = buildDictionnay(projections);

        if(tableName ==  DataType.Employee + ", " + DataType.Doctor)
        {
            specialCondition = DataType.Doctor+"."+ DataType.Num + " = " +  DataType.Employee+"."+ DataType.Num + ";";
            QueryBuilder.replaceAmbiguous(DataType.Num, DataType.Doctor+"."+ DataType.Num, projections);
            QueryBuilder.replaceAmbiguous(DataType.Num, DataType.Doctor+"."+ DataType.Num, conditions);
        }

        if(tableName ==  DataType.Employee + ", " + DataType.Nurse)
        {
            specialCondition = DataType.Nurse+"."+ DataType.Num + " = " +  DataType.Employee+"."+ DataType.Num + ";";
            QueryBuilder.replaceAmbiguous(DataType.Num, DataType.Nurse+"."+ DataType.Num, projections);
            QueryBuilder.replaceAmbiguous(DataType.Num, DataType.Nurse+"."+ DataType.Num, conditions);
        }


        String conditionQuery = (conditions.size() != 0)?  String.join(" AND ", conditions) : "";
        conditionQuery += (specialCondition != ";" && !conditionQuery.isEmpty())? " AND " : "";
        String where = (!conditionQuery.isEmpty() ||  specialCondition != ";")? SQLKeyWords.WhereKeyWord : "";

        String query = QueryBuilder.buildSelectQuery(projections) + SQLKeyWords.FromKeyWord + tableName + where + conditionQuery + specialCondition;
        try
        {
            Statement st = conn.conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            if(tableName == DataType.Employee + ", " + DataType.Doctor)  return readDoctorTable(rs, selectedProjections);
            if(tableName == DataType.Employee + ", " + DataType.Nurse)  return readNurseTable(rs, selectedProjections);

            st.close();
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null ,ex.getMessage() ,"Connexion error", JOptionPane.ERROR_MESSAGE);
        }

        return new ElementHospital[10];
    }

    private static ElementHospital[] readDoctorTable(ResultSet rs, HashMap<String, Boolean> selectedProjections)
    {
        ArrayList<Doctor> doctors= new ArrayList<Doctor>();
        try
        {
            while (rs.next())
            {

                String name       = (selectedProjections.get(DataType.Name))? rs.getString(DataType.Name) : null;
                String firstName  = (selectedProjections.get(DataType.FirstName))? rs.getString(DataType.FirstName) : null;
                String adress     = (selectedProjections.get(DataType.Adress))? rs.getString(DataType.Adress) : null;
                String phone      = (selectedProjections.get(DataType.PhoneNumber))? rs.getString(DataType.PhoneNumber) : null ;
                String speciality = (selectedProjections.get(DataType.Speciality))? rs.getString(DataType.Speciality) : null;
                Integer number    = (selectedProjections.get(DataType.Num))? rs.getInt(DataType.Num) : null;

                doctors.add(new Doctor(new BasicInfo(name, firstName, phone, adress), number, speciality));
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null ,ex.getMessage() ,"Connexion error", JOptionPane.ERROR_MESSAGE);
        }

        return doctors.toArray(new Doctor[doctors.size()]);
    }

    private static ElementHospital[] readNurseTable(ResultSet rs, HashMap<String, Boolean> selectedProjections)
    {
        ArrayList<Nurse> nurses= new ArrayList<Nurse>();
        try
        {
            while (rs.next())
            {

                String name        = (selectedProjections.get(DataType.Name))? rs.getString(DataType.Name) : null;
                String firstName   = (selectedProjections.get(DataType.FirstName))? rs.getString(DataType.FirstName) : null;
                String adress      = (selectedProjections.get(DataType.Adress))? rs.getString(DataType.Adress) : null;
                String phone       = (selectedProjections.get(DataType.PhoneNumber))? rs.getString(DataType.PhoneNumber) : null ;
                String codeService = (selectedProjections.get(DataType.CodeService))? rs.getString(DataType.CodeService) : null;
                Double salary    = (selectedProjections.get(DataType.Salary))?  rs.getBigDecimal(DataType.Salary).doubleValue() : null;
                String rotation    = (selectedProjections.get(DataType.Rotation))? rs.getString(DataType.Rotation) : null;
                Integer number     = (selectedProjections.get(DataType.Num))? rs.getInt(DataType.Num) : null;

                nurses.add(new Nurse(new BasicInfo(name, firstName, phone, adress), number, codeService, rotation, salary));
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null ,ex.getMessage() ,"Connexion error", JOptionPane.ERROR_MESSAGE);
        }

        return nurses.toArray(new Nurse[nurses.size()]);
    }

    private static HashMap<String, Boolean> buildDictionnay(ArrayList<String> projections)
    {
        boolean initBolean = (projections.get(0) == DataType.SelectAll)? true : false;
        HashMap<String, Boolean> hm = new HashMap<String, Boolean>();
        hm.put(DataType.CodeService, initBolean);
        hm.put(DataType.Num, initBolean);
        hm.put(DataType.NumbOfBeds, initBolean);
        hm.put(DataType.NumPatient, initBolean);
        hm.put(DataType.NumRoom, initBolean);
        hm.put(DataType.Code, initBolean);
        hm.put(DataType.Name, initBolean);
        hm.put(DataType.Speciality, initBolean);
        hm.put(DataType.FirstName, initBolean);
        hm.put(DataType.PhoneNumber, initBolean);
        hm.put(DataType.Bed, initBolean);
        hm.put(DataType.Rotation, initBolean);
        hm.put(DataType.Salary, initBolean);
        hm.put(DataType.Insurance, initBolean);
        hm.put(DataType.Building, initBolean);
        hm.put(DataType.Superviser, initBolean);
        hm.put(DataType.Watcher, initBolean);
        hm.put(DataType.Adress, initBolean);

        if(initBolean) return hm;

        for (String str: projections)
        {
            if (hm.containsKey(str))
            {
                hm.put(str, true);
            }
        }
        return hm;
    }


}
