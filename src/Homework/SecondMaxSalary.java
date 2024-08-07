package Homework;

public class SecondMaxSalary {
    public static void main(String[] args) {
        int[] salaries = {7, 10, 4, 13, 25, 18, 9, 8, 17};
        int max = 0;
        int secondmax = 0;

        for (int i = 0; i < salaries.length; i++) {
            if (salaries[i] > max) {
                secondmax = max;
                max = salaries[i];

            }
            if (secondmax < salaries[i] && salaries[i] < max) {
                secondmax = salaries[i];
            }

        }
        System.out.print(secondmax);
    }
}




//import java.util.ArrayList;
//import java.util.Collections;

//public class SecondMaxSalary {
//
//
//
//
//    public static void main(String[] args) {
//        ArrayList<Integer> salaries = new ArrayList<>();
//        Collections.addAll(salaries, 7, 10, 4, 13, 25, 18, 9, 8, 17);
//
//
//        int highest = Integer.MIN_VALUE;
//        int secondHighest = Integer.MIN_VALUE;
//
//        for (int salary : salaries) {
//            if (salary > highest) {
//                secondHighest = highest;
//                highest = salary;
//            } else if (salary > secondHighest && salary < highest) {
//                secondHighest = salary;
//            }
//        }
//
//        if (secondHighest == Integer.MIN_VALUE) {
//            System.out.println("There is no second highest salary.");
//        } else {
//            System.out.println("The second highest salary is: " + secondHighest);
//        }
//    }

