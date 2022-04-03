package com.example.prectice.mini_marks_generator;

import java.io.Serializable;
import java.util.ArrayList;

public class Student implements Serializable {

    private String name;

    private Integer id;

    private ArrayList<Integer> marks;

    public Student(String name, Integer id, ArrayList<Integer> marks){

        this.name=name;
        this.id=id;
        this.marks=marks;

    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public Integer getTotal(){
        Integer sum=0;

        for(Integer i=0;i<marks.size();i++)
        {
            sum+=marks.get(i);
        }
        return sum;
    }

    public Float getAvg(){
        float avg;

        avg=(float)this.getTotal()/(float)marks.size();

        return  avg;
    }

    public Integer getMin(){
        int  min=marks.get(0);
        for(int i=0;i<marks.size();i++)
        {
            if(marks.get(i)<min)
            {
                min=marks.get(i);
            }
        }
        return min;
    }

}
