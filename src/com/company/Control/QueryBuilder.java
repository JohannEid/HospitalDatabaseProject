package com.company.Control;

import java.util.ArrayList;

public class QueryBuilder
{

    public static String buildSelectQuery(ArrayList<String> projections)
    {
        if(projections.size() == 1 ) return "SELECT " +  projections.get(0);

        String query = "SELECT ";
        for (String projection : projections)
        {
            query += projection + ",";
        }

        return query;
    }

    public static String conditionQuery(String attribute, String requierement, Character operator ) {return attribute + operator + requierement; }

    public static String buildConditionQuery(String[] conditions, String attribute, String operator)
    {
        if(conditions.length == 0)return "WHERE " +  conditions[0];
        return new String();
        /*
        String query = "WHERE";
        for (String requierement: requierements)
        {
            query += requierement + operator + attribute;
        }
        return query;
        */
    }

}
