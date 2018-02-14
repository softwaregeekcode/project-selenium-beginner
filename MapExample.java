package javaBeginner;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> hMap = new HashMap<Integer, String>();
		hMap.put(12, "Apple");
		hMap.put(2, "Orange");
		hMap.put(11, "Banana");
		hMap.put(49, "Grape");
		hMap.put(3, null);
		
		System.out.println("\n HashMap result");
		/* Display content using iterator  */
		Set set1 = hMap.entrySet();
		Iterator iterator1 = set1.iterator();
		while(iterator1.hasNext()) {
			Map.Entry mentry = (Map.Entry)iterator1.next();
			System.out.println("Key is:"+mentry.getKey()+"& value is:"+mentry.getValue());
		}
		
		System.out.println("\n TreeMap result");
		TreeMap<Integer, String> tmap = new TreeMap<Integer,String>();
		
		tmap.put(1, "Data1");
		tmap.put(2, "Data2");
		tmap.put(3, "Data3");
		tmap.put(4, "Data4");
		
		/* Display content using Iterator */
		Set set2 = tmap.entrySet();
		Iterator iterator2 = set2.iterator();
		while(iterator2.hasNext()) {
			Map.Entry mentry = (Map.Entry)iterator2.next();
			System.out.println("Key is::"+mentry.getKey()+"& value is::"+mentry.getValue());
		}
		
	}

}
