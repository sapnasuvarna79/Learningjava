package Homework;

import java.util.Scanner;

public class Leap_year_2024 {
    public static void main(String[] args) {
        System.out.println("Please enter a year");
        Scanner sc= new Scanner(System.in);
        int year =sc.nextInt();

       // if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
//            if ((year%100 !=0) && (year%400 ==0 ) )
//        {
//
//                System.out.println("this is a leap year");
//
//        }
//        else if (year%4 ==0) {
//
//            System.out.println("this is a leap year");
//        }
//        else
//            {
//                System.out.println("this is a not leap year");
//            }
////        if (year%4 ==0 )
//        {
//            System.out.println("this is a leap year");
//        }
//        if (year%4 !=0)
//        {
//            System.out.println("this is a not leap year");
//        }

        if(((year%4==0 )&&(year%100!=0))||(year%400==0))
        {

            System.out.println("this is a leap year");

        }else
        {
            System.out.println("this is a not leap year");
        }

    }

    }

