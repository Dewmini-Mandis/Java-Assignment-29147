

package com.mycompany.q3;
import java.util.Scanner;

public class Q3 {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        double celsius, fahrenheit;
 
        System.out.println("Enter the temperature in Fahrenheit: ");
        fahrenheit=sc.nextDouble();
        
        celsius=(5.0/9.0)*( fahrenheit-32.0);
        System.out.println("The temperature in Celsius is: "+celsius);

    }
}
