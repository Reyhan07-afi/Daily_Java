package com.Solvee.Day06;

import java.util.Scanner;

public class CharacterIncrementPat {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number of rows : ");
         int n = sc.nextInt();
         for (int i = 1; i <= n; i++) {
             for(int j =1; j<=i; j++){
                 System.out.print((char)('A'+j-1));

             }
             System.out.println();



         }
     }
}
