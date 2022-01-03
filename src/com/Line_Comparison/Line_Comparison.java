package com.Line_Comparison;

import java.util.Scanner;
public class Line_Comparison {

	public static void main(String[] args) {
		System.out.println("Welcome To Line Comparison program");
		input();
	}
		 public static void input() {
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("enter the value of x = ");
		        int x = scanner.nextInt();
		        System.out.print("enter the value of x1 = ");
		        int x1 = scanner.nextInt();
		        System.out.print("enter the value of y = ");
		        int y = scanner.nextInt();
		        System.out.print("enter the value of y1 = ");
		        int y1 = scanner.nextInt();

		        double distance = Math.sqrt((x1 - x) * (x1 - x) + (y1 - y) * (y1 - y));
		        System.out.println("Distance = " + distance);
		    }
	}