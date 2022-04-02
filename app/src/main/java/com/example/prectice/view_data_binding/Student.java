package com.example.prectice.view_data_binding;

public class Student {

    String name;
    String city;

    public Student(String name,String city){
        this.name=name;
        this.city=city;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setName(String name) {
        this.name = name;
    }
}
