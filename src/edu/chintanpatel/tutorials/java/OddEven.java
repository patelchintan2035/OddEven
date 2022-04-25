package edu.chintanpatel.tutorials.java;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int number = scanner.nextInt();
        if (number % 2 != 0) {
            System.out.println("Enter number " + number + " is an odd number.");
        }
        else {
            System.out.println("Enter number " + number + " is an even number");
        }
    }
}
