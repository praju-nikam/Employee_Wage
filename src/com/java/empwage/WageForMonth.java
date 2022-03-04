package com.java.empwage;
public class WageForMonth
{
     public static void main(String args[])
     {
          int WORKING_DAYS = 20;
          int perHourSalary = 20;
          int workingHour = 8;
          int salary = 0;
          int totalSalary = 0;

         for (int day = 0; day < WORKING_DAYS; day++)
         {
             double ch = Math.floor(Math.random() * 10) % 3;

             switch ((int) ch) {
                 case 0:
                     System.out.println("Employee is Absent");
                     workingHour = 0;
                     break;
                 case 1:
                     System.out.println("Employee is Present");
                     workingHour = 8;
                     break;
                 case 2:
                     System.out.println("Employee is Working At Part Time");
                     workingHour = 4;
                     break;
             }

             salary = (perHourSalary * workingHour);
             day++;
         }
         totalSalary = (perHourSalary * salary);

         System.out.println("Employee one day Salary : ( " + perHourSalary + " * " + workingHour + " ) : " + salary);
         System.out.println("Employee has earned totalSalary in month : (" + perHourSalary + " * " + salary + " ) : " + totalSalary);
     }
}
