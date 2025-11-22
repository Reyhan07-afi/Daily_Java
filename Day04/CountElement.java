package com.Solvee.Day04;
import java.util.*;
public class CountElement {



        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String str = sc.nextLine();

            int[] freq = new int[256]; // ASCII size

            // Count frequency
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                freq[ch]++;
            }

            // Print frequency of each unique character
            boolean[] printed = new boolean[256];
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (!printed[ch]) {
                    System.out.println(ch + " → " + freq[ch]);
                    printed[ch] = true;
                }
            }
        }
    }



