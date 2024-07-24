package Homework;

import java.util.Scanner;

public class TriangleClassifier {
    public static void main(String[] args) {
        System.out.println("Please enter three sides of triangle");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter side1 of triangle");
        int side1= sc.nextInt();
        System.out.println("Enter side2 of triangle");
        int side2=sc.nextInt();
        System.out.println("Enter side3 of triangle");
        int side3=sc.nextInt();

        if (side1 != side2 && side2 != side3 && side3 != side1) {
            System.out.println("It is scalene traingle");
        }
        else if (side1 == side2 && side2 == side3) {
            System.out.println("It is equilateral traingle");
        }
        else if((side1==side2 && side2!=side3) || (side2==side3 && side2!=side1) || (side3==side1 && side3!=side2))
        {
            System.out.println("It is isoceles traingle");
        }
    }
}
