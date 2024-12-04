package Homework;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter a number to get factorial");
        Scanner sc=new Scanner(System.in);
        int fact=sc.nextInt();
        int fin=1;
        for(int i=1;i<=fact;i++)
        {

             fin=fin*i;


        }
        System.out.println(fin);
    }
}
