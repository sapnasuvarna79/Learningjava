package Homework;

import java.util.Scanner;

public class RightTriangleStarPattern {
    public static void main(String[] args) {
        System.out.println("Please input value for pattern");
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();

        for (int i=1;i<=p;i++)
        {
            for (int j=1;j<=i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
