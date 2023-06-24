

package com.mycompany.q5;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Q5 {
    
    static int[] arr=new int[20];
    static int count=0;
    public static double calAverage()
    {
        int i=0,sum=0;
      
        while(i<count)
        {
            sum+=arr[i];
            i++;
        }
        double avg=sum/count;
        return avg;
    }

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        DecimalFormat decimalFormat=new DecimalFormat("#0.00");
        
        System.out.println("To stop entering numbers, enter -1");
        while(count<20)
        {
            System.out.println("Enter grade: ");
            int input= sc. nextInt();
            
            if(input!=-1)
            {
                arr[count]=input;
                count++;
            }
            else
            {
                break;
            }
        }
        String formattedAverage = decimalFormat.format(calAverage());
        
        System.out.println("The average is "+formattedAverage);

     
    }
}
