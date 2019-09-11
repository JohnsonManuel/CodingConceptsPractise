package co.codingquestions;
import java.util.*;
public class Palindrome {

	static void checkPalindrome(String input) {
	int length = input.length();
	boolean isPalindrome= true;
	
	for(int i=0;i< length/2 ;i++) {
		if(input.charAt(i)!=input.charAt(length-i-1)) {
			isPalindrome=false;
			break;
		}
	}
	
	if(isPalindrome) {
		System.out.println("The word '"+input+"' is a Palindrome");
	}
	else {
		System.out.println("The word '"+input+"' is not a Palindrome");
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		checkPalindrome(str);
		sc.close();
	}

}
