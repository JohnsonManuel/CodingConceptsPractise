package co.concepts;

public class stringTrial {
public static void main(String[] args) {
	
	//Creating strings as literals
	String str1= "John";
	String str2= "John";
	// == is checking the reference of the strings
	if(str1==str2) {
		System.out.println("str1 == str2");
	}
	else {
		System.out.println("str1 != str2");
	}
	
	//Creating strings as objects 
	String str3 = new String ("Joe");
	String str4 = new String ("Joe");
	
	//Objects create a new memory location to store the strings so references wont be same
	if(str3 == str4) {
		System.out.println("str3 == str4");
	}else {
		System.out.println("str3 != str4");
	}
	//charAt returns the character at the indexed string
	System.out.println(str3.charAt(0));
	//length returns the length of the string
	System.out.println(str3.charAt(str3.length()-1));

	str3 =" Joe Austin,Johnson ,ram,mani ";
	System.out.println(str3);
	//replace operation replaces all the old character with the new character.
	String replacestring = str3.replace("J", "K");
	System.out.println("Replace character J with k\n\n"+replacestring);
	//trim removes the white space both before and after the string
	String trimstring = str3.trim();
	System.out.println(trimstring);
	//split returns the substring before the character specified
	String [] Array = str3.split(",");
	for(String g:Array) {
		System.out.print(g.trim());
	}
	//immutable string 
	String str5 = new String("Jeswin");
	str5.concat(" justin");
	System.out.println("String concat "+str5);
	
	//String buffer and builder are mutable ie can change the values of the string
	//String buffer is thread safe ie: it is synchronizable
	StringBuffer buffer = new StringBuffer("Jeswin");
	buffer.append(" justin");
	System.out.println("string builder append"+buffer);
	
	StringBuilder builder = new StringBuilder("Jeswin");
	builder.append(" justin");
	System.out.println("String builder append "+builder);
}
}
