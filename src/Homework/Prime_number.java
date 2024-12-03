package Homework;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Prime_number {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner s =new Scanner(System.in);
        int num =s.nextInt();
        int count =0;
       if(num>1)
       {
           for (int i=1;i<=num;i++) {
               if (num % i == 0) {
                   count++;

               }
           }
               if(count==2)
               {
                   System.out.println(num + " It is a prime number");
               }
               else
               {
                   System.out.println(num +" It is not a prime number");
               }

           }
       else {
           System.out.println("Not a valid number");
       }

    }
}
