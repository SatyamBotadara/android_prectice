package com.example.prectice.object_passing;

public class people
{
    private String name;
    private  String city;

    public people(String name,String city){
        this.city=city;
        this.name=name;
    }
    public String getName(){
        return  name;
    }
    public String getCity(){
        return city;
    }
}
