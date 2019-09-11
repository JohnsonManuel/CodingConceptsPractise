package co.codingquestions;
import java.util.*;

public class TotalStringReversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String initial = sc.nextLine();
		
		String [] strArray = initial.split(" ");
		
		
		for (String str :strArray) {
			int i= str.length()-1;
			while(i>=0) {
				System.out.print(str.charAt(i));
				i--;
			}
			System.out.print(" ");
		}
		
	}

}
