package com.java.empwage;

import java.awt.*;
import java.util.Scanner;

public class EmpUseCase
{
   public static void main(String args[])
   {
       int perHourSalary = 20;
       int workingHour = 8;
       int salary = 0;
       int totalSalary = 0;

      double ch = Math.floor(Math.random() * 10) % 3;

     switch ((int) ch)
     {
        case 0:
                System.out.println("Employee is Absent");
                workingHour = 0;
                break;
      case 1:
                System.out.println("Employee is Present");
                workingHour = 8;
                break;
      case 2:
                System.out.println("Employee is Working As Part Time");
                workingHour = 4;
                break;
    }

    salary = (perHourSalary * workingHour);

    System.out.println("Employee one day Salary : ( " + perHourSalary + " * " + workingHour + " ) : " + salary);

  }

}