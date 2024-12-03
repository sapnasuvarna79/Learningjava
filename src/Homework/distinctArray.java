package Homework;

import java.util.Scanner;

public class distinctArray {
    public static void main(String[] args) {
        System.out.println("Enter length of array");
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr = new int[n];

        // Input elements
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        // Display the array
        System.out.print("The array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int i=0 ;i<arr.length;i++)
        {
            if (arr[i]==arr[i+1]) {
                arr[i] =arr[i+1];
                System.out.print(arr[i]);

            }
            System.out.print(arr);
        }

    }
}
