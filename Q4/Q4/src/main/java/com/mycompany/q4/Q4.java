
package com.mycompany.q4;
import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        
        int no1,no2,no3,sum,product,smallest,largest;
        double average;
        
        System.out.println("Enter number 1: ");
        no1=sc.nextInt();
        
        System.out.println("Enter number 2: ");
        no2=sc.nextInt();
        
        System.out.println("Enter number 3: ");
        no3=sc.nextInt();
        
        sum=no1+no2+no3;
        average=sum/3;
        product=no1*no2*no3;
        {
        if(no1<no2 && no1<no3)
        
        {
            smallest=no1;
        }
        else if(no2<no1 && no2<no3)
        {
            smallest=no2;
        }
        else
        {
            smallest=no3;
        }
        }
        
        {
        if(no1>no2 && no1>no3)
        {
            largest=no1;
        }
        else if(no2>no1 && no2>no3)
        {
            largest=no2;
        }
        else
        {
            largest=no3;
        }
        }
        
        System.out.println("Sum is "+sum);
        System.out.println("Average is "+average);
        System.out.println("Product is "+product);
        System.out.println("Smallest number is "+smallest);
        System.out.println("Largest number is "+largest);
    }
}
