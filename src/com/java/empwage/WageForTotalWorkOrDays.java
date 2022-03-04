package com.java.empwage;

public class WageForTotalWorkOrDays
{
    public static void main(String args[])
    {
        int perHourSalary = 20;
        int totalSalary = 0;
        int totalWorkingHour = 0;
        int workingHour = 0;
        int salary = 0;
        int day = 1;
        while (day < 20 && totalWorkingHour < 100)
        {
            double ch = Math.floor(Math.random()*10)%3;

            switch ((int)ch)
            {
                case 0:
                    //   System.out.println("Employee is Absent");
                       workingHour = 0;
                       break;
                case 1:
                     //  System.out.println("Employee is Present");
                       workingHour = 10;
                       break;
                case 2:
                    //  System.out.println("Employee is Working At Part Time");
                      workingHour = 8;
                      break;
            }

            totalWorkingHour=(totalWorkingHour + workingHour);

            salary = (perHourSalary * workingHour);
            day++;
        }
        totalSalary = (perHourSalary * salary);
        System.out.println("Total Working Hours : " + totalWorkingHour);
        System.out.println("Employee one day Salary : ( " +perHourSalary+ " * "+workingHour+" ) : "+salary);
        System.out.println("Employee has earned totalSalary in month : (" + perHourSalary+ " * " +salary+ " ) : " +totalSalary);
    }
}
