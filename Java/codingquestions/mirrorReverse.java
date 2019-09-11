package co.codingquestions;
import java.util.*;

public class mirrorReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int []arr = new int[n];
		int []arr1= new int[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter any number between 0-"+(n-1));
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) 
		{
			arr1[arr[i]]= i;
		}
		System.out.println("----------------");
		for(int i=0;i<n;i++) 
		{
			System.out.print(arr1 [i]+" ");
		}
	sc.close();
	}

}
