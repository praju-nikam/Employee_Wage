package com.java.geometory;

import java.util.Scanner;

public class LineIsGreaterOrLess
{
    public static void main(String arg[])
    {
    int x1,x2,y1,y2;
    int m1,m2,n1,n2;
    double distanceXY;
    double distanceMN;

    Scanner sc=new Scanner(System.in);
    // Enter point line 1
        System.out.println("Enter x1 point");
    x1=sc.nextInt();

        System.out.println("Enter y1 point");
    y1=sc.nextInt();

        System.out.println("Enter x2point");
    x2=sc.nextInt();

        System.out.println("Enter y2 point");
    y2=sc.nextInt();

    distanceXY=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));

        System.out.println("Distance Between XY : "+"("+x1+","+y1+"),"+"("+x2+","+y2+")===> "+distanceXY);

    //Enter point line 2
        System.out.println("Enter m1 point");
    m1=sc.nextInt();

        System.out.println("Enter n1 point");
    n1=sc.nextInt();

        System.out.println("Enter m2point");
    m2=sc.nextInt();

        System.out.println("Enter n2 point");
    n2=sc.nextInt();

    distanceMN=Math.sqrt((m2-m1)*(m2-m1) + (n2-n1)*(n2-n1));

        System.out.println("Distance Between MN : "+"("+m1+","+n1+"),"+"("+m2+","+n2+")===> "+distanceMN);
        System.out.println();

        if(distanceXY == distanceMN)
    {
        System.out.println(" Lines are Equals");
    }
        else if(distanceXY > distanceMN)
    {
        System.out.println("Line XY is Greater");
    }
        else
        {
            System.out.println("Line MN is Greater");
        }
}
}
