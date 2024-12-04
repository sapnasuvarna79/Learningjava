package Homework;

import java.util.Scanner;

public class Reversestring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        try {
            String rev = sc.nextLine();
            char [] arr =rev.toCharArray();
            for (int i=rev.length()-1;i>=0;i--)
            {
                System.out.print(arr[i]);

            }

        }
        catch (Exception e)
        {
            System.out.println("Enter a valid string");
        }
    }


    }

