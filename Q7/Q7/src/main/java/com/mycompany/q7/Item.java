
package com.mycompany.q7;


public class Item
{
    private int location;
    private String description;
    
    //constructor method
    public Item(int location, String description)
    {
        this.location=location;
        this.description=description;
    }
    
    //setter method for location
    public void setLocation(int location)
    {
        this.location=location;  
    }
    
    //getter method for location
    public void getLocation()
    {
        System.out.println("Location: "+location);
    }
    
    //setter method for description
    public void setDescription(String description)
    {
        this.description=description;
    }
    
    //getter method for description
    public void getDescription()
    {
        System.out.println("Description: "+description);
    }
    
}
