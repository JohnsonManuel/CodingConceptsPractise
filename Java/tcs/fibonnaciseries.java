package co.tcs;

import java.util.*;

public class fibonnaciseries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the digit of the fibonnaci series you want ");
		int n= sc.nextInt();
		int t1=0,t2=1,nextdigit;
		for(int i=0;i<n;i++) {
			if(i==n-1) {
			System.out.print(t1+" ");
			}
			nextdigit = t1+t2;
			t1=t2;
			t2=nextdigit;
		}
		sc.close();
	}
}
