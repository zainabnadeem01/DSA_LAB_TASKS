package week1_java_revision;

import java.util.Scanner;

public class MarksCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];
        int total = 0;
        double average;

        System.out.println("Enter marks of 5 subjects:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            total += marks[i];
        }

        average = total / 5.0;

        System.out.println("\nTotal Marks = " + total);
        System.out.println("Average = " + average);

        if (average >= 90) System.out.println("Grade: A+");
        else if (average >= 80) System.out.println("Grade: A");
        else if (average >= 70) System.out.println("Grade: B");
        else if (average >= 60) System.out.println("Grade: C");
        else if (average >= 50) System.out.println("Grade: D");
        else System.out.println("Grade: Fail");

        sc.close();
    }
}
