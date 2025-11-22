package com.Solvee.Day02;

import java.util.Scanner;

public class NumOfDig {
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements:");
        int num = sc.nextInt();
        int count = 0;
        int temp = num;
        if(num==0) {
            count = 1;
        }
        else {
            while (temp != 0) {
                temp = temp / 10;
                count++;
            }
        }
        System.out.print("Number of digits:"+count);

    }
}
