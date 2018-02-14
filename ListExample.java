package javaBeginner;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Array list and linked list
		LinkedList<String> list = new LinkedList<String>();
		list.add("One");
		list.add("Two");
		list.add("Three");
		
		System.out.println(list);
		
		Iterator iter = list.iterator();
		while(iter.hasNext()) {
			String str = (String) iter.next();
			System.out.println(str);
		}
		
		Vector<String>  vec = new Vector<String>();
		vec.addElement("Apple");
		vec.addElement("Orange");
		vec.addElement("Mango");
		vec.addElement("Banana");
		
		System.out.println(vec);
		
		// Display vector elements
		Enumeration en = vec.elements();
		System.out.println("\n vector elements are:");
		while(en.hasMoreElements())
		{
			System.out.println(en.nextElement()+"\t");
		}
	}

}
