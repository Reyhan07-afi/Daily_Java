package com.Solvee.Day04;
import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        while(num>=10) {
            num = sumOfDigits(num);
        }
        System.out.println("Sum of Digits: "+num);


    }
    public static int sumOfDigits(int num) {
        int sum = 0;
        while(num>0){
            sum+=num%10;
            num/=10;

        }
        return sum;
    }
}
