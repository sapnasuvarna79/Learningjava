package Homework;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        try {
            int fibo = s.nextInt();
            int first = 0;
            int second = 1;
            for (int i = 0; i <= fibo; i++) {
                System.out.println(first);
                int fin = first + second;
                first = second;
                second = fin;
            }
        }
        catch (Exception e)
        {
            System.out.println("Enter valid number");
        }

        }
    }

