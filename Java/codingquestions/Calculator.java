package co.codingquestions;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter two numbers");
		double first = sc.nextDouble();
		double second = sc.nextDouble();
		
		System.out.println("Enter the operator (+,-,/,*)");
		char operator = sc.next().charAt(0);
		
		double result;
		
		switch(operator)
		{
		case '+':
			result = first+second;
			break;
		case '-':
			result = first-second;
			break;
		case '*':
			result = first * second;
			break;
		case '/':
			result = first/second;
			break;
		default:
			System.out.println(" Not a proper operator ");
			return;
		}
		
	System.out.printf(first+" "+operator+" "+second+" = "+result);	
	sc.close();
	}

}
