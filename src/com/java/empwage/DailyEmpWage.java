package com.java.empwage;

public class DailyEmpWage
{
    public static void main(String args[])
    {
        final int IS_FULL_TIME = 1;
        double empCheck = Math.floor(Math.random()*10)%2;
        int empHrs = 0;
        int salary=0;
        int empRatePerHr = 20;
       if( empCheck == IS_FULL_TIME  )
       {
           empHrs = 8;
           salary = (empHrs * empRatePerHr);
          System.out.println( "Employee Salary :  ( " +empHrs + " * " + empRatePerHr + " ) : " + salary);
       }
         else
         {
           salary = 0;
           System.out.println("Employee Salary : ( " +empHrs + " * " + empRatePerHr + " ) : " + salary);
       }
    }

}
