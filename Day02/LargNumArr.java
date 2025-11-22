package com.Solvee.Day02;

import java.util.Scanner;
public class LargNumArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for(int i=1;i<n;i++){
            arr[0]=max;
         if(arr[i]>max){
             max=arr[i];
         }
        }
        System.out.println("The maximum number is "+max);
    }

}
