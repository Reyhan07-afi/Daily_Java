package com.Solvee.Day03;
import java.util.Scanner;
public class SecondLargNum {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter size of array: ");
            int n = sc.nextInt();

            int[] arr = new int[n];

            System.out.println("Enter array elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // Step 1: Initialize with first two elements
            int largest, secondLargest;

            if (arr[0] > arr[1]) {
                largest = arr[0];
                secondLargest = arr[1];
            } else {
                largest = arr[1];
                secondLargest = arr[0];
            }

            // Step 2: Loop from third element
            for (int i = 2; i < n; i++) {

                if (arr[i] > largest) {
                    secondLargest = largest;
                    largest = arr[i];
                }
                else if (arr[i] > secondLargest && arr[i] != largest) {
                    secondLargest = arr[i];
                }
            }

            System.out.println("Second Largest Element = " + secondLargest);
        }
    }



