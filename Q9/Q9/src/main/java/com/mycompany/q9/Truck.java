 
package com.mycompany.q9;


public class Truck extends Car
{
    private int weight;

    public Truck(int speed, double regularPrice, String color, int weight)

    {
        super(speed, regularPrice, color);
        this.weight=weight;
    }
    
    @Override
    public double getSalePrice()
    {
        if (weight >2000)
            return regularPrice*0.9; //10% discount
        else
            return regularPrice*0.8; //20% discount

    }
    
}
