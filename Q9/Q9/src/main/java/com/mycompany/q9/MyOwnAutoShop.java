

package com.mycompany.q9;


public class MyOwnAutoShop {

    public static void main(String[] args)
    {
        Sedan s1=new Sedan(150, 25000, "Blue", 18);
        Ford f1=new Ford(180, 35000, "Red", 2019, 5000);
        Ford f2=new Ford(200, 40000, "Black", 2020, 6000);
        Car c1=new Car(120, 20000, "White");
        
        System.out.println("Sedan sale price: " + s1.getSalePrice());
        System.out.println("Ford1 sale price: " + f1.getSalePrice());
        System.out.println("Ford2 sale price: " + f2.getSalePrice());
        System.out.println("Car sale price: " + c1.getSalePrice());
    }
}
