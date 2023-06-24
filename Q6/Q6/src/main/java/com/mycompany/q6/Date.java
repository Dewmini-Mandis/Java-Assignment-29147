
package com.mycompany.q6;

public class Date
{
    private int month,day,year;
    
    //constructor method
    public Date(int month,int day,int year)
    {
        this.month=month;
        this.day=day;
        this.year=year;
    }
    
    //setter method for month
    public void setMonth(int month)
    {
         this.month=month;
    }
    
    //getter method for month
    public int getMonth()
    {
        return month;
    }
    
     //setter method for day
    public void setDay(int day)
    {
         this.day=day;
    }
    
    //getter method for day
    public int getDay()
    {
        return day;
    }
    
    //setter method for year
    public void setYear(int year)
    {
         this.year=year;
    }
    
    //getter method for year
    public int getYear()
    {
        return year;
    }
}
