package com.company.Control;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class UpdateDataBase
{
    private static final Map<String, String> mappingTableToId;

    static
    {
        mappingTableToId = new HashMap<String, String>();

        mappingTableToId.put(DataType.Doctor, DataType.Num);
        mappingTableToId.put(DataType.Employee, DataType.Num);
        mappingTableToId.put(DataType.Room, DataType.NumRoom + DataType.Code);
        mappingTableToId.put(DataType.Hospital,  DataType.Num);
        mappingTableToId.put(DataType.Nurse, DataType.Num + DataType.Code);
        mappingTableToId.put(DataType.Patient, DataType.Num);
        mappingTableToId.put(DataType.Service, DataType.Code);
        mappingTableToId.put(DataType.Care, DataType.NumDoctor + DataType.NumPatient);
    }

    public static void deleteFromDataBase(String ID, ArrayList<String> tables)
    {

        for (String tab: tables)
        {
            String query = SQLKeyWords.DeleteKeyWord + " " +  SQLKeyWords.FromKeyWord + " " + tab + " " + SQLKeyWords.WhereKeyWord;

        }

    }
}
