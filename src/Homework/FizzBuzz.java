package Homework;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        for(int i=1; i<=100;i++)
        {
            if ((i%3==0) && (i%5!=0))
            {
                System.out.println("Fizz");
            }
            if ((i%5==0) && (i%3!=0))
            {
                System.out.println("Buzz");
            }
            if ((i%3==0) && (i%5==0)) {
                System.out.println("FizzBuzz");
            }
           else if ((i%3!=0) && (i%5!=0)) {
                System.out.println(i);
            }

        }
    }
}
