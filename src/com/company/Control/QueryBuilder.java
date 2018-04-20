package com.company.Control;

import java.util.ArrayList;

public class QueryBuilder
{

    public static String buildSelectQuery(ArrayList<String> projections)
    {
        if(projections.size() == 1 ) return "SELECT " +  projections.get(0) +" ";

        String query = "SELECT ";
        for (int i = 0;  i < projections.size(); ++i)
        {
            query += projections.get(i);
            String sep = (i != projections.size() - 1)? ", ": "";
            query += sep;
        }

        return query;
    }

    public static String buildCondition(String elLhs, String elRhs)
    {
        return elLhs + " = " + "'"+elRhs+"'";
    }

    public static void replaceAmbiguous(String oldStr, String newStr,ArrayList<String>  arr)
    {
        int index = -1;

        for(int i = 0; i < arr.size(); ++i)
        {
            if(arr.get(i).contains(oldStr))
            {
                index = i;
                break;
            }
        }
        if(index == -1) return;

        String str = arr.get(index);
        newStr =  str.replaceFirst(oldStr, newStr);
        arr.set(index,newStr);
    }

    public static String  buildValuesQuery(ArrayList<String> values)
    {
        return "(" + String.join(",", values) + ")";
    }

}
