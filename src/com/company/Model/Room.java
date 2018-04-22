package com.company.Model;

import com.company.Control.DataType;
import com.company.Control.QueryBuilder;
import com.company.Control.SQLKeyWords;

import java.util.ArrayList;

public class Room extends Infrastructure
{
    private String service;
    private Integer watcher;
    private Integer numberOfBeds;

    public Room(Integer code, String service, Integer watcher, Integer numberOfBeds)
    {
        super(code);
        this.service = service;
        this.watcher = watcher;
        this.numberOfBeds = numberOfBeds;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public Integer getWatcher() {
        return watcher;
    }

    public void setWatcher(Integer watcher) {
        this.watcher = watcher;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public String toString()
    {
        String setService = (service != null)? "Service: " + service + " " : " ";
        String setWatcher = (watcher != null)? "Code: " + watcher + " " : " ";
        String setNbBeds = (numberOfBeds != null)? "Number of beds: " + numberOfBeds + " " : " ";

        return super.toString() + setService + setWatcher + setNbBeds;
    }

    public String formatForUpdate()
    {

        String setWatcher  = (watcher != null)?
                QueryBuilder.buildCondition(DataType.NumRoom,watcher.toString()) : "";
        String setNumbOfBeds  = (numberOfBeds != null)?
                QueryBuilder.buildCondition(DataType.NumbOfBeds,numberOfBeds.toString()) : "";
        String setService  = (service != " ")?
                QueryBuilder.buildCondition(DataType.CodeService,service) : "";

        setWatcher += (setWatcher != "" && setNumbOfBeds != "")? ", " : " ";
        setNumbOfBeds += (setService != "")? ", " : " ";
        setService += " ";

        return setWatcher + setNumbOfBeds +setService;

    }

    public String formatForInsert()
    {
        ArrayList<String> values     = new ArrayList<>();
        ArrayList<String> parameters = new ArrayList<>();

        parameters.add(DataType.NumRoom);
        values.add(DataType.mappingAttributeToParam.get(DataType.NumRoom));

        if ( service != " ")
        {
            parameters.add(DataType.CodeService);
            values.add("'"+ service +"'");
        }
        if (watcher != null)
        {
            parameters.add(DataType.Watcher);
            values.add("'"+ watcher + "'");
        }

        if (numberOfBeds != null)
        {
            parameters.add(DataType.NumbOfBeds );
            values.add("'"+ numberOfBeds   +"'");
        }
        return  QueryBuilder.buildValuesQuery(parameters) + SQLKeyWords.ValuesKeyWord   + QueryBuilder.buildValuesQuery(values);
    }
}
