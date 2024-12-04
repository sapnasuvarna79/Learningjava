package Homework;

import java.util.Scanner;

public class Swaprev {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
        char[] fin=str.toCharArray();
        int length=fin.length;
        for (int i = 0; i < length/2; i++)
        {
            char tmp =fin[i];
            fin[i]=fin[length-i-1];
            fin[length-i-1]=tmp;

        }
        System.out.print(fin);

    }
}
