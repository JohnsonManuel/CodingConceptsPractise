package co.codingquestions;
import java.util.*;
public class binarysearch {
	
public static int binarysearcher(int [] ar ,int first,int last,int find) {
  		
  		int mid= (first+last)/2;
  		
	  	  		if(ar[mid]==find) {
	  	  			return mid;
	  	  		}
	  	  		if(mid <first|| mid>last) {
	  	  			return -1;
	  	  		}
	  	  		
	  	  		if(ar[mid]>find) {
	  	  			return binarysearcher(ar,first,mid-1,find);
	  	  		}
	  	  		
	  	  		if(ar[mid]<find) {
	  	  			return binarysearcher(ar,mid+1,last,find);
	  	  		}
	  	  		
  	  	return -1;
  	}

  	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[] = {1,20,30,40,50,80};
		int toFind = sc.nextInt();
		int result= binarysearcher(arr,0,arr.length-1,toFind);
		if(result == -1) {
			System.out.println("The number was not found");
		}
		else {
			System.out.println(result+" =="+arr[result]);	
		}
		sc.close();
  		
	}

	

}
