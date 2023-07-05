
package com.mycompany.q11_ii;


public class MyClass implements B,C 
{
    @Override
    public void methodB()
    {
        System.out.println("Implementing MethodB");
    }
    
    
    @Override
    public void methodC()
    {
        System.out.println("Implementing MethodC");
    }
    
}
