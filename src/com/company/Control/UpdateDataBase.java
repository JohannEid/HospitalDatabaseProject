package com.company.Control;

import com.company.Model.*;

import javax.swing.*;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class UpdateDataBase
{


    public static void deleteFromDataBase(String ID, List<String> tables)
    {

        try
        {
            PreparedStatement statement = null;

            for (String tab: tables)
            {
                String query = SQLKeyWords.DeleteKeyWord  + SQLKeyWords.FromKeyWord + tab + " " + SQLKeyWords.WhereKeyWord +
                        QueryBuilder.buildCondition(DataType.mappingTableToId.get(tab), ID) + ";";

                statement =  MainControl.conn.conn.prepareStatement(query);

                int rowsDeleted = statement.executeUpdate();
                if (rowsDeleted > 0)
                {
                    JOptionPane.showMessageDialog(null ,"Successfully deleted information linked to id" + ID ,"Success!", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null ,ex.getMessage() ,"Connexion error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void updateDataBase( String tables)
    {
        if(tables == DataType.Employee + ", " + DataType.Doctor) updateDoctorDataBase();
        if(tables == DataType.Employee + ", " + DataType.Nurse) upateNurseDataBase();
        if(tables == DataType.Patient) updatePatientDataBase();
        if(tables == DataType.Room) updateRoomDataBase();
        if(tables == DataType.Hospital) updateHospitalDataBase();

    }

    private static void updateHospitalDataBase()
    {
        Integer numRoom = null;
        Integer numPatient = null;
        Integer numBed = null;
        try
        {
            numRoom =  Integer.parseInt(DataType.mappingAttributeToParam.get(DataType.NumRoom));
            numPatient =  Integer.parseInt(DataType.mappingAttributeToParam.get(DataType.NumPatient));
            numBed =  Integer.parseInt(DataType.mappingAttributeToParam.get(DataType.Bed));
        }

        catch (Exception ex)
        {
        }
        Hospitalization hospitalization = new Hospitalization(numPatient, DataType.mappingAttributeToParam.get(DataType.CodeService), numRoom, numBed );
        updateHospitalTable(hospitalization);
    }

    private static void updateHospitalTable(Hospitalization hospitalization)
    {
        try {


            String queryDoctor = SQLKeyWords.UpdateKeyWord + DataType.Hospital + " " + SQLKeyWords.SetKeyWord +
                    hospitalization.formatForUpdate()
                    + SQLKeyWords.WhereKeyWord + QueryBuilder.buildCondition(DataType.NumPatient, DataType.mappingAttributeToParam.get(DataType.NumPatient)) + ";";

            PreparedStatement statement = MainControl.conn.conn.prepareStatement(queryDoctor);

            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(null, "Successfully update in Hospitalisation table" +
                        DataType.mappingAttributeToParam.get(DataType.Num), "Success!", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Request error", JOptionPane.ERROR_MESSAGE);
        }

    }

    private static void updateRoomDataBase()
    {
        Integer numRoom = null;
        Integer watcherId = null;
        Integer numBeds = null;
        try
        {
            numRoom =  Integer.parseInt(DataType.mappingAttributeToParam.get(DataType.NumRoom));
            watcherId =  Integer.parseInt(DataType.mappingAttributeToParam.get(DataType.Watcher));
            numBeds =  Integer.parseInt(DataType.mappingAttributeToParam.get(DataType.NumbOfBeds));
        }

        catch (Exception ex)
        {
        }
        Room room = new Room(numRoom, DataType.mappingAttributeToParam.get(DataType.Service), watcherId, numBeds);
        updateRoomTable(room);
    }

    private static void updateRoomTable(Room room)
    {

        try {


            String queryDoctor = SQLKeyWords.UpdateKeyWord + DataType.Room + " " + SQLKeyWords.SetKeyWord +
                    room.formatForUpdate()
                    + SQLKeyWords.WhereKeyWord + QueryBuilder.buildCondition(DataType.NumRoom, DataType.mappingAttributeToParam.get(DataType.NumRoom)) + ";";

            PreparedStatement statement = MainControl.conn.conn.prepareStatement(queryDoctor);

            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(null, "Successfully update in Room table" +
                        DataType.mappingAttributeToParam.get(DataType.Num), "Success!", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Request error", JOptionPane.ERROR_MESSAGE);
        }

    }

    private static void updatePatientDataBase()
    {
        Patient patient = new Patient(new BasicInfo(DataType.mappingAttributeToParam.get(DataType.Name),
                DataType.mappingAttributeToParam.get(DataType.FirstName),
                DataType.mappingAttributeToParam.get(DataType.PhoneNumber),
                DataType.mappingAttributeToParam.get(DataType.Adress)),
                DataType.mappingAttributeToParam.get(DataType.Insurance),
                Integer.parseInt(DataType.mappingAttributeToParam.get(DataType.Num)));
        updatePatientTable(patient);
    }

    private static void upateNurseDataBase()
    {

        Double sal = null;

        try
        {
            sal =  Double.parseDouble(DataType.mappingAttributeToParam.get(DataType.Salary));
        }
        catch (NumberFormatException e)
        {
            sal = null;
        }
        Nurse nurse = new Nurse(new BasicInfo(DataType.mappingAttributeToParam.get(DataType.Name),
                DataType.mappingAttributeToParam.get(DataType.FirstName),
                DataType.mappingAttributeToParam.get(DataType.PhoneNumber),
                DataType.mappingAttributeToParam.get(DataType.Adress)),
                Integer.parseInt(DataType.mappingAttributeToParam.get(DataType.Num)),
                DataType.mappingAttributeToParam.get(DataType.CodeService),
                DataType.mappingAttributeToParam.get(DataType.Rotation),
                null);


        updateEmployeTable(nurse);
        updateNurseTable(nurse);
    }

    public static void insertIntoDataBase(String tables)
    {
        if(tables == DataType.Employee + ", " + DataType.Doctor) insertDoctorDataBase();
        if(tables == DataType.Employee + ", " + DataType.Nurse) insertNurseDataBase();
        if(tables == DataType.Patient) insertPatientDataBase();
        if(tables == DataType.Room) insertRoomDataBase();
        if(tables == DataType.Hospital) insertHospitalDataBase();
    }

    private static void insertHospitalDataBase()
    {
        Integer numRoom = null;
        Integer numPatient = null;
        Integer numBed = null;
        try
        {
            numRoom =  Integer.parseInt(DataType.mappingAttributeToParam.get(DataType.NumRoom));
            numPatient =  Integer.parseInt(DataType.mappingAttributeToParam.get(DataType.NumPatient));
            numBed =  Integer.parseInt(DataType.mappingAttributeToParam.get(DataType.Bed));
        }

        catch (Exception ex)
        {
        }
        Hospitalization hospitalization = new Hospitalization(numPatient, DataType.mappingAttributeToParam.get(DataType.CodeService), numRoom, numBed );
        insertHospitalTable(hospitalization);

    }

    private static void insertHospitalTable(Hospitalization hospitalization)
    {
        try
        {



            String queryDoctor = SQLKeyWords.InsertKeyWord +  SQLKeyWords.IntoKeyWord + DataType.Hospital + " " +
                    hospitalization.formatForInsert() + ";";

            PreparedStatement statement = MainControl.conn.conn.prepareStatement(queryDoctor);

            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0)
            {
                JOptionPane.showMessageDialog(null, "Successfully inserted in hospitalisation table" +
                        DataType.mappingAttributeToParam.get(DataType.Num), "Success!", JOptionPane.INFORMATION_MESSAGE);
            }
        }


        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Request error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private static void insertRoomDataBase()
    {
        Integer numRoom = null;
        Integer watcherId = null;
        Integer numBeds = null;
        try
        {
            numRoom =  Integer.parseInt(DataType.mappingAttributeToParam.get(DataType.NumRoom));
            watcherId =  Integer.parseInt(DataType.mappingAttributeToParam.get(DataType.Watcher));
            numBeds =  Integer.parseInt(DataType.mappingAttributeToParam.get(DataType.NumbOfBeds));
        }

        catch (Exception ex)
        {
        }
        Room room = new Room(numRoom, DataType.mappingAttributeToParam.get(DataType.Service), watcherId, numBeds);
        insertRoomTable(room);

    }




    public static void updateDoctorDataBase()
    {
        Doctor doctor = new Doctor(new BasicInfo(DataType.mappingAttributeToParam.get(DataType.Name),
                DataType.mappingAttributeToParam.get(DataType.FirstName),
                DataType.mappingAttributeToParam.get(DataType.PhoneNumber),
                DataType.mappingAttributeToParam.get(DataType.Adress)),
                Integer.parseInt(DataType.mappingAttributeToParam.get(DataType.Num)),
                DataType.mappingAttributeToParam.get(DataType.Speciality));

        updateDoctorTable(doctor);
        updateEmployeTable(doctor);
    }

    public static void insertDoctorDataBase()
    {
        Doctor doctor = new Doctor(new BasicInfo(DataType.mappingAttributeToParam.get(DataType.Name),
                DataType.mappingAttributeToParam.get(DataType.FirstName),
                DataType.mappingAttributeToParam.get(DataType.PhoneNumber),
                DataType.mappingAttributeToParam.get(DataType.Adress)),
                Integer.parseInt(DataType.mappingAttributeToParam.get(DataType.Num)),
                DataType.mappingAttributeToParam.get(DataType.Speciality));

        insertIntoEmployeTable(doctor);
        insertIntoDoctorTable(doctor);
    }

    private static void insertPatientDataBase()
    {
        Patient patient = new Patient(new BasicInfo(DataType.mappingAttributeToParam.get(DataType.Name),
                DataType.mappingAttributeToParam.get(DataType.FirstName),
                DataType.mappingAttributeToParam.get(DataType.PhoneNumber),
                DataType.mappingAttributeToParam.get(DataType.Adress)),
                DataType.mappingAttributeToParam.get(DataType.Insurance),
                Integer.parseInt(DataType.mappingAttributeToParam.get(DataType.Num)));
        insertIntoPatientTable(patient);
    }



    public static void insertNurseDataBase()
    {
        Double sal = null;

        try
        {
            sal =  Double.parseDouble(DataType.mappingAttributeToParam.get(DataType.Salary));
        }
        catch (NumberFormatException e)
        {
            sal = null;
        }
        Nurse nurse = new Nurse(new BasicInfo(DataType.mappingAttributeToParam.get(DataType.Name),
                DataType.mappingAttributeToParam.get(DataType.FirstName),
                DataType.mappingAttributeToParam.get(DataType.PhoneNumber),
                DataType.mappingAttributeToParam.get(DataType.Adress)),
                Integer.parseInt(DataType.mappingAttributeToParam.get(DataType.Num)),
                DataType.mappingAttributeToParam.get(DataType.CodeService),
                DataType.mappingAttributeToParam.get(DataType.Rotation),
                null);


        insertIntoEmployeTable(nurse);
        insertIntoNurseTable(nurse);
    }


    private static void updateDoctorTable(Doctor doctor)
    {
        try {

            if (doctor.getSpeciality() != null) {
                String queryDoctor = SQLKeyWords.UpdateKeyWord + DataType.Doctor + " " + SQLKeyWords.SetKeyWord +
                        QueryBuilder.buildCondition(DataType.Speciality, doctor.getSpeciality())
                        + SQLKeyWords.WhereKeyWord + QueryBuilder.buildCondition(DataType.Num, DataType.mappingAttributeToParam.get(DataType.Num)) + ";";

                PreparedStatement statement = MainControl.conn.conn.prepareStatement(queryDoctor);

                int rowsUpdated = statement.executeUpdate();
                if (rowsUpdated > 0) {
                    JOptionPane.showMessageDialog(null, "Successfully update in doctor table" +
                            DataType.mappingAttributeToParam.get(DataType.Num), "Success!", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Request error", JOptionPane.ERROR_MESSAGE);
        }

    }

    private static void updateNurseTable(Nurse nurse)
    {
        try {

            if (nurse.getSalary() != null || nurse.getService() != " " || nurse.getShift() != " ")
            {
                String queryDoctor = SQLKeyWords.UpdateKeyWord + DataType.Nurse + " " + SQLKeyWords.SetKeyWord +
                        nurse.formatForUpdate()
                        + SQLKeyWords.WhereKeyWord + QueryBuilder.buildCondition(DataType.Num, DataType.mappingAttributeToParam.get(DataType.Num)) + ";";

                PreparedStatement statement = MainControl.conn.conn.prepareStatement(queryDoctor);

                int rowsUpdated = statement.executeUpdate();
                if (rowsUpdated > 0) {
                    JOptionPane.showMessageDialog(null, "Successfully update in Nurse table" +
                            DataType.mappingAttributeToParam.get(DataType.Num), "Success!", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Request error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private static void updatePatientTable(Patient patient)
    {
        try {

            if (patient.getInsurance() != null)
            {
                String queryDoctor = SQLKeyWords.UpdateKeyWord + DataType.Patient + " " + SQLKeyWords.SetKeyWord +
                        patient.formatForUpdate()
                        + SQLKeyWords.WhereKeyWord + QueryBuilder.buildCondition(DataType.Num, DataType.mappingAttributeToParam.get(DataType.Num)) + ";";

                PreparedStatement statement = MainControl.conn.conn.prepareStatement(queryDoctor);

                int rowsUpdated = statement.executeUpdate();
                if (rowsUpdated > 0) {
                    JOptionPane.showMessageDialog(null, "Successfully update in patient table" +
                            DataType.mappingAttributeToParam.get(DataType.Num), "Success!", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Request error", JOptionPane.ERROR_MESSAGE);
        }

    }


    private static void updateEmployeTable(Employee employee)
    {
        try {

            if     (DataType.mappingAttributeToParam.get(DataType.Name) != null ||
                    DataType.mappingAttributeToParam.get(DataType.FirstName) != null ||
                    DataType.mappingAttributeToParam.get(DataType.Adress) != null ||
                    DataType.mappingAttributeToParam.get(DataType.PhoneNumber) != null)
            {

                String query = SQLKeyWords.UpdateKeyWord + DataType.Employee + " " + SQLKeyWords.SetKeyWord +
                        employee.getBasicInfo().formatForUpdate()
                        + SQLKeyWords.WhereKeyWord + QueryBuilder.buildCondition(DataType.Num, DataType.mappingAttributeToParam.get(DataType.Num)) +";";

                PreparedStatement statement = MainControl.conn.conn.prepareStatement(query);

                int rowsUpdated = statement.executeUpdate();
                if (rowsUpdated > 0)
                {
                    JOptionPane.showMessageDialog(null ,"Successfully update in employee table" +
                            DataType.mappingAttributeToParam.get(DataType.Num) ,"Success!", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Request error", JOptionPane.ERROR_MESSAGE);
        }

    }

    private static void insertIntoDoctorTable(Doctor doctor)
    {
        try
        {

            ArrayList<String> values     = new ArrayList<>();
            ArrayList<String> parameters = new ArrayList<>();

            parameters.add(DataType.Num);
            values.add(DataType.mappingAttributeToParam.get(DataType.Num));

            if (doctor.getSpeciality() != " ")
            {
                parameters.add(DataType.Speciality);
                values.add("'"+doctor.getSpeciality()+"'");
            }


            String queryDoctor = SQLKeyWords.InsertKeyWord +  SQLKeyWords.IntoKeyWord + DataType.Doctor + " " +
                    QueryBuilder.buildValuesQuery(parameters) + SQLKeyWords.ValuesKeyWord
                    + QueryBuilder.buildValuesQuery(values) + ";";

            PreparedStatement statement = MainControl.conn.conn.prepareStatement(queryDoctor);

            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0)
            {
                JOptionPane.showMessageDialog(null, "Successfully update in doctor table" +
                        DataType.mappingAttributeToParam.get(DataType.Num), "Success!", JOptionPane.INFORMATION_MESSAGE);
            }
        }


        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Request error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private static void insertIntoEmployeTable(Employee employee)
    {
        try
        {



            String queryDoctor = SQLKeyWords.InsertKeyWord +  SQLKeyWords.IntoKeyWord + DataType.Employee + " " +
                    employee.getBasicInfo().formatForInsert() + ";";

            PreparedStatement statement = MainControl.conn.conn.prepareStatement(queryDoctor);

            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0)
            {
                JOptionPane.showMessageDialog(null, "Successfully inserted in nurse table" +
                        DataType.mappingAttributeToParam.get(DataType.Num), "Success!", JOptionPane.INFORMATION_MESSAGE);
            }
        }


        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Request error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private static void insertIntoPatientTable(Patient patient)
    {
        try
        {



            String queryDoctor = SQLKeyWords.InsertKeyWord +  SQLKeyWords.IntoKeyWord + DataType.Patient + " " +
                    patient.formatForInsert() + ";";

            PreparedStatement statement = MainControl.conn.conn.prepareStatement(queryDoctor);

            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0)
            {
                JOptionPane.showMessageDialog(null, "Successfully inserted in patient table" +
                        DataType.mappingAttributeToParam.get(DataType.Num), "Success!", JOptionPane.INFORMATION_MESSAGE);
            }
        }

        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Request error", JOptionPane.ERROR_MESSAGE);
        }

    }


    private static void insertIntoNurseTable(Nurse nurse)
    {
        try
        {

            if (nurse.getSalary() != null || nurse.getService() != " " || nurse.getShift() != " ")
            {

                String queryNusrse = SQLKeyWords.InsertKeyWord + SQLKeyWords.IntoKeyWord + DataType.Nurse + " " +
                        nurse.formatForInsert() + ";";

                PreparedStatement statement = MainControl.conn.conn.prepareStatement(queryNusrse);


                int rowsUpdated = statement.executeUpdate();
                if (rowsUpdated > 0) {
                    JOptionPane.showMessageDialog(null, "Successfully update in nurse table" +
                            DataType.mappingAttributeToParam.get(DataType.Num), "Success!", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }


        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Request error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private static void insertRoomTable(Room room)
    {
        try
        {

            String queryNusrse = SQLKeyWords.InsertKeyWord + SQLKeyWords.IntoKeyWord + DataType.Room + " " +
                    room.formatForInsert() + ";";

            PreparedStatement statement = MainControl.conn.conn.prepareStatement(queryNusrse);

            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(null, "Successfully inserted in room table" +
                        DataType.mappingAttributeToParam.get(DataType.Num), "Success!", JOptionPane.INFORMATION_MESSAGE);
            }
        }


        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Request error", JOptionPane.ERROR_MESSAGE);
        }
    }


}

