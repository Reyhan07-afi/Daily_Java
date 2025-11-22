package com.Solvee.Day06;

import java.util.Scanner;

public class AlternatingPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i + 1; j++) {
                if (i % 2 == 0) {
                    System.out.print((j % 2 == 1) ? "1" : "0");   //Ternary op
                } else {
                    System.out.print((j % 2 == 1) ? "0" : "1"); //Tern Op
                }
            }
            System.out.println();
        }
    }
}
