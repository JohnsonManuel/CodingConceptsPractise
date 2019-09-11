package co.codingquestions;
import java.util.*;
public class Fibonacci {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t1=0,t2=1,n;
		n= sc.nextInt();
		while(n>0) {
			System.out.print(t1+" ");
			int sum= t1+t2;
			t1=t2;
			t2=sum;
			n--;
		}
		
		sc.close();
		
	}

}
