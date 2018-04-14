package com.company.Control;

import com.company.Model.Doctor;
import com.company.Model.ElementHospital;

import javax.swing.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ReadDataBase
{
    static ElementHospital[] readPatientFromInsurance( ArrayList<String> projections, String tableName, Connexion conn)
    {
        String query = QueryBuilder.buildSelectQuery(projections) + "FROM" + tableName;
        try
        {
            Statement st = conn.conn.createStatement();
            ResultSet rs = st.executeQuery(query);
           if(tableName == "Doctor")  return readDoctorTable(rs);

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
        /*
        while (rs.next())
        {
            int id = rs.getInt("id");
            String firstName = rs.getString("first_name");
            String lastName = rs.getString("last_name");
            Date dateCreated = rs.getDate("date_created");
            boolean isAdmin = rs.getBoolean("is_admin");
            int numPoints = rs.getInt("num_points");

        }
        */


        return new Doctor[10];

    }

}
