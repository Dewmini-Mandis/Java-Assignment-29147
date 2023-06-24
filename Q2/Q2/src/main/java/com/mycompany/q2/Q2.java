

package com.mycompany.q2;
import java.util.Scanner;
public class Q2 {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        
        int no1,no2,no3,product;
        
        System.out.println("Enter number 1: ");
        no1=sc.nextInt();
        
        System.out.println("Enter number 2: ");
        no2=sc.nextInt();
        
        System.out.println("Enter number 3: ");
        no3=sc.nextInt();
        
        product=no1*no2*no3;
        
        System.out.println("Product is "+product);
    }
}
