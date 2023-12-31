
package com.mycompany.q9;

public class Sedan extends Car
{
    private int length;
    
    public Sedan(int speed, double regularPrice, String color, int length)
    {
        super(speed, regularPrice, color);
        this.length=length;
    }
    
    @Override
    public double getSalePrice()
    {
        if (length >20)
            return regularPrice*0.95; //5% discount
        else
            return regularPrice*0.9; //10% discount
    }
}
