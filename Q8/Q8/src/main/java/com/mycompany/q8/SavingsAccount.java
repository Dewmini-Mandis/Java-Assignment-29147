
package com.mycompany.q8;


public class SavingsAccount 
{
    static double annualInterestRate;
    private double savingsBalance;
    
    public SavingsAccount(double savingsBalance)
    {
        this.savingsBalance=savingsBalance;
    }
    
    public static void modifyInterestRate(double aIR)
    {
         annualInterestRate=aIR;

    }
   
    public void calculateMonthlyInterest()
    {
        double calculateMonthlyInterest= (savingsBalance*annualInterestRate/12);
        savingsBalance+=calculateMonthlyInterest;
    }
    
    public void setSavingsBalance(double SavingsBalance)
    {
        this.savingsBalance=savingsBalance;
    }
    
    public double getSavingsBalance()
    {
        return savingsBalance;
    }
    
    
    
    
}
