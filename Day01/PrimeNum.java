package com.Solvee.Day01;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        boolean isPrime = true;  // assume prime initially
        if (num <= 1) {
            isPrime = false;
        } else {
           for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    System.out.println("Prime");
                    break;
                }
                else{
                    System.out.println("Not Prime");
                }
            }
        }

    }
}
