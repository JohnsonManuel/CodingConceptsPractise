package co.concepts;
import java.util.ArrayList;
import java.util.Iterator;

class Student{
	int roll;
	String name;
	
}
public class listTrial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list1  = new ArrayList<String>();
		//list 1 can contain only string objects
		
		ArrayList<Object> list2= new ArrayList();
		// list 2 can contain any type 
		
		Student s1 = new Student();
		s1.name="Johnson";
		s1.roll=101;
		
		//add method
		list1.add("Johnson");
		list1.add("Jeswin");
		list1.add("Joe");
		list1.add("Haerizz");
		
		list2.add(10);
		list2.add("20something");
		list2.add("10something");
		list2.add(s1);
		
		System.out.println("List 1 :"+list1);
		System.out.println("list 2 :"+list2);
	
	
		//get method
		//get works on list1 as the objects are of string type
		//it doesn't work on list 2 as list 2 of of object ttpe
		String value = list1.get(2);
		System.out.println("Get(2) of list 1 is "+ value);
		
		//need object type to get the value of object list
		Object o = list2.get(2);
		System.out.println("Get(2) of list 2 is "+o);
		
		//set method 
		//set(index, element)
		list1.set(0,"JOHNSON MANUEL");
		System.out.println("List 1 :"+list1);
		//remove method
		//remove(index)
		list1.remove(2);
		System.out.println("List 1 :"+list1);
		//contains method
		//contains(object o);
		if(list1.contains("Jeswin")) {
			System.out.println("Jeswin is in the Array list1");
		}
		
		System.out.println("Iterating with an enhances for loop");
		for(String str:list1) {
			System.out.println(str);
		}
		System.out.println();
		System.out.println("Iterating with Iterator ");
		
		//Iterator initialization
		Iterator<String> itr = list1.iterator();
		while(itr.hasNext()) {
			String str = itr.next();
			System.out.println(str);
			//can use iterator to go through the list and remove the elements using the remove method
			
			if(str.equals("Jeswin") ) {
				itr.remove();
			}
			
		}
		System.out.println("List after itertor "+list1);
	
	}

}
