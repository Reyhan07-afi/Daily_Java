package com.Solvee.Day02;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                System.out.println("Not Palindrome");
                break;
            } else {
                i++;
                j--;
            }

        }
        System.out.println("Palindrome");


    }
}
