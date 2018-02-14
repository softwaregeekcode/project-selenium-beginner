import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;
public class MapExample 
{
   public static void main(String args[]) 
   {
      /* This is how to declare HashMap */
      HashMap<Integer, String> hmap = new HashMap<Integer, String>();

      /*Adding elements to HashMap*/
      hmap.put(12, "Apple");
      hmap.put(2, "Orange");
      hmap.put(7, "Banana");
      hmap.put(49, "Grape");
      hmap.put(3, null);
	  
	  System.out.println("\n HashMap Result");
	   /* Display content using Iterator*/
      Set set1 = hmap.entrySet();
      Iterator iterator1 = set1.iterator();
      while(iterator1.hasNext()) {
         Map.Entry mentry = (Map.Entry)iterator1.next();
         System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
         System.out.println(mentry.getValue());
      }

	  System.out.println("\n TreeMap Result");
	   /* This is how to declare TreeMap */
      TreeMap<Integer, String> tmap = 
             new TreeMap<Integer, String>();

      /*Adding elements to TreeMap*/
      tmap.put(1, "Data1");
      tmap.put(23, "Data2");
      tmap.put(70, "Data3");
      tmap.put(4, "Data4");
      tmap.put(2, "Data5");

      /* Display content using Iterator*/
      Set set2 = tmap.entrySet();
      Iterator iterator2 = set2.iterator();
      while(iterator2.hasNext()) {
         Map.Entry mentry = (Map.Entry)iterator2.next();
         System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
         System.out.println(mentry.getValue());
      }
	  
   }
}