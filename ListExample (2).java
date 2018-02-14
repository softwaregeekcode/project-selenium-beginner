import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
import java.util.Enumeration;
import java.util.Iterator;

public class ListExample 
{
   public static void main(String[] args) 
   {
      //ArrayList and LinkedList
      //List<String> list = new ArrayList<String>();
	  LinkedList<String> list=new LinkedList<String>();
      list.add("One"); 
      list.add("Two");
      list.add("Three");
      System.out.println(list);
 
      Iterator iter = list.iterator();
      while (iter.hasNext()) 
	  {
         String str = (String)iter.next();
         System.out.println(str);
      }
	  
	  //Vector
	  Vector<String> vec = new Vector<String>(2);

      /* Adding elements to a vector*/
      vec.addElement("Apple");
      vec.addElement("Orange");
      vec.addElement("Mango");
      vec.addElement("Banana");
	  /*Display Vector elements*/
      Enumeration en = vec.elements();
      System.out.println("\n Vector Elements are:");
      while(en.hasMoreElements())
         System.out.print(en.nextElement() + "\n");
   }
}