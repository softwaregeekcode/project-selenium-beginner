package javaBeginner;

import java.util.HashSet;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Hashset of Integer type
		HashSet<Integer> hSet = new HashSet<Integer>();
		
		hSet.add(88);
		hSet.add(7);
		hSet.add(101);
		hSet.add(0);
		hSet.add(222);
		hSet.add(222);
		
		System.out.println("HashSet Values are:"+hSet);
		
		// TreeSet of Integer
		TreeSet<Integer> tSet = new TreeSet<Integer>();
		
		tSet.add(88);
		tSet.add(7);
		tSet.add(101);
		tSet.add(222);
		tSet.add(3);
		tSet.add(444);
		
		System.out.println("TreeSet Values are:"+tSet);
	}
}
