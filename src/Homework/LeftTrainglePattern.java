package Homework;

import java.util.Scanner;

public class LeftTrainglePattern {
    public static void main(String[] args) {
        System.out.println("Enter number for left angled triangle");
        Scanner sc= new Scanner(System.in);
        int pattern=sc.nextInt();

        for (int i=1;i<=pattern;i++)
        {
            for (int j=pattern;j>=i;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
