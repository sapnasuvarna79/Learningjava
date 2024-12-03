package Homework;

import java.util.Scanner;

public class VowelConsonantCounter {
    public static void main(String[] args) {
        System.out.println("Enter the statement for Vowel and Consonant count");
        Scanner s=new Scanner(System.in);
        String statement= s.nextLine();
        System.out.println(statement);
        statement.toLowerCase();
        int Vowelcount=0;
        int Consonantcount=0;
        for (char count : statement.toCharArray())
        {
            if(count=='a' || count =='e' || count =='i' || count =='o' || count =='u')
                Vowelcount++;
            else
            {
                Consonantcount++;
            }
        }
        System.out.println("Vowelcount is " +Vowelcount);
        System.out.println("Vowelcount is " +Consonantcount);
    }
}
