package com.company.Control;

import com.company.Model.BasicInfo;
import com.company.Model.Doctor;
import com.company.Model.ElementHospital;

import javax.swing.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ReadDataBase
{
    public static ElementHospital[] readFromDatabase( ArrayList<String> projections, String tableName, Connexion conn)
    {

        String specialCondition = (tableName == "employe, docteur") ? "docteur.numero = employe.numero": "";

        String query = QueryBuilder.buildSelectQuery(projections) + "FROM " + tableName + " WHERE " + specialCondition +   " ;";
        try
        {
            Statement st = conn.conn.createStatement();
            ResultSet rs = st.executeQuery(query);
           if(tableName == "employe, docteur")  return readDoctorTable(rs);

            st.close();

        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null ,ex.getMessage() ,"Connexion error", JOptionPane.ERROR_MESSAGE);

        }
        return new ElementHospital[10];

    }

    private static ElementHospital[] readDoctorTable(ResultSet rs)
    {
        ArrayList<Doctor> doctors= new ArrayList<Doctor>();
        try {
            while (rs.next()) {

                String name = rs.getString("nom");
                String firstName = rs.getString("prenom");
                String adress = rs.getString("adresse");
                String phone = rs.getString("tel");
                String speciality = rs.getString("Specialite");
                int number  =rs.getInt("numero");

                doctors.add(new Doctor(new BasicInfo(name, firstName, phone, adress), number, speciality));
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null ,ex.getMessage() ,"Connexion error", JOptionPane.ERROR_MESSAGE);
        }

        return doctors.toArray(new Doctor[doctors.size()]);

    }

}
