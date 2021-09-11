package com.company;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Sean McCormack
 */
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        System.out.printf("Enter the first number: ");
        int num1 = Integer.parseInt(scan.nextLine());
        System.out.printf("Enter the second number: ");
        int num2 = Integer.parseInt(scan.nextLine());
        System.out.printf("Enter the third number: ");
        int num3 = Integer.parseInt(scan.nextLine());
        String output = "The largest number is ";
        if(num1 > num2 && num1 > num3){
            output=output+num1;
        }else if(num2 > num1 && num2 > num3){
            output=output+num2;
        }else if(num3 > num1 && num3 > num2){
            output=output+num3;
        }
        System.out.println(output);
    }
}
