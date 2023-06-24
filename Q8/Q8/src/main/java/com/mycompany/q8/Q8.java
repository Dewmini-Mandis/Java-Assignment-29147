
package com.mycompany.q8;


public class Q8 {

    public static void main(String[] args)
    {
        SavingsAccount saver1 = new SavingsAccount(2000.00f);
        SavingsAccount saver2 = new SavingsAccount(3000.00f);
        SavingsAccount.annualInterestRate=0.04f;
      
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        
        System.out.println("Balance of saver1 is "+saver1.getSavingsBalance());
        System.out.println("Balance of saver2 is "+saver2.getSavingsBalance());
        
        SavingsAccount.modifyInterestRate(0.05f);
        
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println("New balance of saver1 is "+saver1.getSavingsBalance());
        System.out.println("New balance of saver2 is "+saver2.getSavingsBalance());
    }
}
