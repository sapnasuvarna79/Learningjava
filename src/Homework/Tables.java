package Homework;

import java.util.Scanner;

public class Tables {
    public static void main(String[] args) {
        System.out.println("Enter the table number: ");
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();

        for (int i=1;i<=10;i++)
        {
            int table = n*i ;
            System.out.println(+n+ "x" +i+ "="+table);
        }
    }
}
