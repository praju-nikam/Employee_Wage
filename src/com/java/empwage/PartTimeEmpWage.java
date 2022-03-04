package com.java.empwage;
public class PartTimeEmpWage
{
    public static void main(String args[])
    {
        final int IS_FULL_TIME = 2;
        final int IS_PART_TIME = 1;
        double empCheck = Math.floor(Math.random()*10)%3;
        int perHourSalary=20;
        int workingHour=0;
        int salary;

        if(empCheck == IS_FULL_TIME)
        {
            System.out.println("Employee is Full Time Working");
            workingHour=10;

        }
        else if ( empCheck == IS_PART_TIME)
        {
            System.out.println("Employee is Part Time Working");
            workingHour=8;
        }
        else
        {
            System.out.println("Employee is Absent");
            workingHour=0;
        }
           salary=(perHourSalary * workingHour);
           System.out.println("Employee Salary :( " + perHourSalary + " * " + workingHour + " ) : " + salary);
    }

}
