package Homework;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println("Enter your string");
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String palindrome =text.toLowerCase();
        if (palindrome.matches("[a-zA-Z]+")) {

            System.out.println("This is valid string");
            for (int i = 0; i <= palindrome.length() / 2; i++) {
                char start = palindrome.charAt(i);
                char end = palindrome.charAt(palindrome.length() - 1 - i);
                if (start != end) {
                    System.out.println("This string is not a palindrome");
                  break;
                }
                else {
                    System.out.println("This string is a palindrome");
                  break;
                }

            }


        } else {
            System.out.println("Enter a valid string");
        }


    }

}
