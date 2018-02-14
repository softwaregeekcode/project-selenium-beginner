import java.util.HashSet;
import java.util.TreeSet;
public class SetExample 
{
   public static void main(String args[]) 
   {
	  // HashSet of Integer Type
         HashSet<Integer> hiset = new HashSet<Integer>();

         // Adding elements to HashSet<Integer>
         hiset.add(88);
         hiset.add(7);
         hiset.add(101);
         hiset.add(0);
		 hiset.add(222);
         hiset.add(222);
         System.out.println(hiset);
	
	  
	  // TreeSet of Integer Type
         TreeSet<Integer> tset = new TreeSet<Integer>();

         // Adding elements to TreeSet<Integer>
         tset.add(88);
         tset.add(7);
         tset.add(101);
         tset.add(0);
		 tset.add(222);
         tset.add(3);
         tset.add(222);
         System.out.println(tset);
    }
}