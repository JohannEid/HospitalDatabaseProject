package com.company.Control;

import com.company.Model.ElementHospital;

public class ReadDataBase
{
    static ElementHospital[] readPatientFromInsurance(String condition, String[] projections, String tableName, Connexion conn )
    {
        String query = QueryBuilder.buildSelectQuery(projections) + "FROM" + tableName + "WHERE" + condition;
    //    Statement st = conn.
        return new ElementHospital[10];
    }
}
