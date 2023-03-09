package org.sample;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two numbers :");
		int a= sc.nextInt();
		int b= sc.nextInt();
		char ch;
		
		do {
		System.out.println("Enter the operator for needed calculations(+,-,*,/,%) :");
		char op = sc.next().charAt(0);
		
		switch(op) {
		
		case '+': System.out.println(a+b);
		break;
		
		case '-': System.out.println(a-b);
		break;
		
		case '*': System.out.println(a*b);
		break;
		
		case '/': System.out.println(a/b);
		break;
		
		case '%': System.out.println(a%b);
		break;
		
		default : System.out.println("Invalid option :");
		
		}
		
		 System.out.println("Do you want to continue type(y or n)");
	        ch = sc.next().charAt(0);
		}while(ch == 'Y'|| ch == 'y');
		
	}

}
