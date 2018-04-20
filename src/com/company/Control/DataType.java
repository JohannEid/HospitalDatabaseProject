package com.company.Control;

import java.util.HashMap;
import java.util.Map;

public class DataType
{
    public static final String SelectAll   = "*";
    public static final String CodeService = "code_service";
    public static final String Num         = "numero";
    public static final String NumRoom     = "no_chambre";
    public static final String NumPatient  = "no_malade";
    public static final String NumDoctor  = "no_docteur";
    public static final String Watcher     = "surveillant";
    public static final String NumbOfBeds  = "nb_lits";
    public static final String Speciality  = "specialite";
    public static final String Name        = "nom";
    public static final String FirstName   = "prenom";
    public static final String Adress      = "adresse";
    public static final String PhoneNumber = "tel";
    public static final String Bed         = "lit";
    public static final String Rotation    = "rotation";
    public static final String Salary      = "salaire";
    public static final String Insurance   = "mutuelle";
    public static final String Code        = "code";
    public static final String Building    = "batiment";
    public static final String Superviser  = "directeur";
    public static final String Room        = "chambre";
    public static final String Doctor      = "docteur";
    public static final String Employee    = "employe";
    public static final String Hospital     = "hospitalisation";
    public static final String Nurse       = "infirmier";
    public static final String Patient     = "malade";
    public static final String Service     = "service";
    public static final String Care        = "soigne";

    public static final Map<String, String> mappingTableToId;

    static
    {
        mappingTableToId = new HashMap<String, String>();

        mappingTableToId.put(DataType.Doctor, DataType.Num);
        mappingTableToId.put(DataType.Employee, DataType.Num);
        mappingTableToId.put(DataType.Room, DataType.NumRoom + "," + DataType.Code);
        mappingTableToId.put(DataType.Hospital,  DataType.Num);
        mappingTableToId.put(DataType.Nurse, DataType.Num );
        mappingTableToId.put(DataType.Patient, DataType.Num);
        mappingTableToId.put(DataType.Service, DataType.Code);
        mappingTableToId.put(DataType.Care, DataType.NumDoctor + "," +  DataType.NumPatient);
    }

    public static Map<String, String> mappingAttributeToParam;

    static
    {
        mappingAttributeToParam = new HashMap<String, String>();

        mappingAttributeToParam.put(DataType.PhoneNumber, " ");
        mappingAttributeToParam.put(DataType.Name, " ");
        mappingAttributeToParam.put(DataType.FirstName, " ");
        mappingAttributeToParam.put(DataType.Adress, " ");
        mappingAttributeToParam.put(DataType.Num, " ");
        mappingAttributeToParam.put(DataType.Speciality, " ");
        mappingAttributeToParam.put(DataType.Salary, " ");
        mappingAttributeToParam.put(DataType.Rotation, " ");

    }



}
