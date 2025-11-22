package com.Solvee.Day05;
import java.util.*;
public class RigTriangle {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter number of rows: ");
            int n = sc.nextInt();

            for (int i = 1; i <= n; i++) {     // Rows
                for (int j = 1; j <= i; j++) { // Columns
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }



