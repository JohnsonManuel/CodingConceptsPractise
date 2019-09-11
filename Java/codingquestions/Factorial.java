package co.codingquestions;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int factorial = Findfactorial(n);
		System.out.println("Factorial of "+n+" is "+factorial);
		sc.close();
	}
	
		static int Findfactorial(int n) {
			int output;
			if(n==1) {
				return 1;
			}
			output= Findfactorial(n-1)*n;
			return output;
		}
		
}
