package co.concepts;

import java.util.*;

public class SetTrial {
	public static void main(String[] args) {
		
		//HashSet<String> set = new HashSet<String>();
		TreeSet<String> set = new TreeSet<String>();
		set.add("a");
		set.add("b");
		set.add("d");
		set.add("e");
		set.add("z");
		set.add("ab");
		set.add("abc");//same data added but ignored
		
		System.out.println("set is "+set);
		// cannot iterate through the set using indexes
		//should use Iterator to iterate through the set
		Iterator <String> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
