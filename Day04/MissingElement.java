package com.Solvee.Day04;
import java.util.*;

public class MissingElement {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter size of array (N-1 numbers): ");
            int size = sc.nextInt();

            int[] arr = new int[size];

            System.out.println("Enter the numbers:");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
            int n = size + 1;
            int expectedSum = n * (n + 1) / 2;

            int actualSum = 0;
            for (int num : arr) {
                actualSum += num;
            }

            int missingNumber = expectedSum - actualSum;

            System.out.println("Missing number: " + missingNumber);
        }
    }

