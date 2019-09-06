package co.tcs;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		int n= sc.nextInt();
		if(n%4 == 0) {
			if(n%100==0) {	
				if(n%400==0) {
					System.out.print(n+" is a leap year");
				}
				else {
					System.out.print(n+" is not a leap year");
				}
			}
			else { 
				System.out.print(n+" is a leap year");
			}
		}
		else {
			System.out.print(n+"is not a leap year");
		}
		sc.close();
	}

}
