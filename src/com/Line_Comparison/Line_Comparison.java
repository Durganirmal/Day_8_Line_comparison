package com.Line_Comparison;

import java.util.Scanner;
public class Line_Comparison {
	
	public static int x,x1,x2,x3,y,y1,y2,y3;
    public static double distance1,distance2;
    
    public static void main(String[] args) {
		System.out.println("Welcome To Line Comparison program");
		input();
		distance();
		equality();
	}
    
		 public static void input() {
			 Scanner scanner = new Scanner(System.in);
		        System.out.print("enter the value of x = ");
		        x = scanner.nextInt();
		        System.out.print("enter the value of x1 = ");
		        x1 = scanner.nextInt();
		        System.out.print("enter the value of x2 = ");
		        x2 = scanner.nextInt();
		        System.out.print("enter the value of x3 = ");
		        x3 = scanner.nextInt();
		        System.out.print("enter the value of y = ");
		        y = scanner.nextInt();
		        System.out.print("enter the value of y1 = ");
		        y1 = scanner.nextInt();
		        System.out.print("enter the value of y2 = ");
		        y2 = scanner.nextInt();
		        System.out.print("enter the value of y3 = ");
		        y3 = scanner.nextInt();
		    }

		        public static void distance() {
		            distance1=Math.sqrt((x1-x)*(x1-x) + (y1-y)*(y1-y));
		            System.out.println("Distance = " +distance1);
		            distance2=Math.sqrt((x3-x2)*(x3-x2) + (y3-y2)*(y3-y2));
		            System.out.println("Distance = " +distance2);
		            
		        }
		            public static void equality() {
		    	        if (distance1 == distance2)
		    	            System.out.print("Length are same ");
		    	        else if (distance1 > distance2)
		    	            System.out.print(" distance1 is greater ");
		    	        else
		    	            System.out.println("distance2 is greater");

		    }
		}