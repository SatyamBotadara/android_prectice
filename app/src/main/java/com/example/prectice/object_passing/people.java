package com.example.prectice.object_passing;


import java.io.Serializable;
import java.util.ArrayList;

public class people implements Serializable
{
    private String name;
    private Integer id;
    private ArrayList<Integer> marks_array;

    public people(String name,Integer id,ArrayList marks)
    {
        this.name=name;
        this.marks_array=marks;
        this.id=id;
    }
    public int get_id(){
        return id;
    }
    public String get_name(){
        return  name;
    }


    public int total_marks()
    {
        int sum=0;
        for (int i=0;i<marks_array.size();i++)
        {
            sum+=marks_array.get(i);
        }
        return sum;
    }

    public float avg_marks()
    {
        int sum=this.total_marks();
        float avg=(float)sum/(float)marks_array.size();
        return avg;
    }

    public float percentage()
    {
        float avg=this.avg_marks();

        return  avg;
    }

}
