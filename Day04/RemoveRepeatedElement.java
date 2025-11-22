package com.Solvee.Day04;
import java.util.*;
public class RemoveRepeatedElement {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter size of array: ");
            int n = sc.nextInt();

            int[] arr = new int[n];
            System.out.println("Enter elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // Step 1: Sort the array (Bubble Sort - manual, no inbuilt sort)
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }

            // Step 2: Remove duplicates manually
            int[] temp = new int[n];
            int j = 0;

            for (int i = 0; i < n - 1; i++) {
                if (arr[i] != arr[i + 1]) {
                    temp[j++] = arr[i];
                }
            }
            temp[j++] = arr[n - 1];   // Add last element

            // Step 3: Print unique elements
            System.out.print("Unique elements: [");
            for (int i = 0; i < j; i++) {
                System.out.print(temp[i]);
                if (i != j - 1) System.out.print(", ");
            }
            System.out.println("]");
        }
    }


