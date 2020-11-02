package com.CollectionDemo;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.ArrayList;

public class DemoCollection {
 public static void main(String[] args) {
	 
	 Collection values = new ArrayList(); // allows  duplicate values
	 HashSet<Integer>values1=new HashSet();//random order
	 Set<String> s = new TreeSet();//sorted ascending order 
	 Set<Integer> n = new LinkedHashSet();
	 
	 n.add(10);
	 n.add(1);
	 n.add(19);
	 n.add(7);
	 n.add(76);
	 
	 
	 
	 values.add(11);
	 values.add(43);
	 values.add(21);
	 values.add(76);
	 values.add(17);
	 values.add(35);
	 values.add(17);
	 values.add(52);
	 
	 values.remove(11);
	 
	 
	values1.add(21);
	values1.add(12);
	values1.add(11);
	values1.add(76);
	values1.add(7);
	values1.add(19);
	values1.add(43);
	values1.add(32);
	
	s.add("Mother");
	s.add("Brother");
	s.add("Apple");
	s.add("Kite");
	s.add("Hexaphone");
	s.add("Zebra");
	s.add("Elephant");
	
	
	 
	 System.out.println(values);
	 
	 System.out.println(values1);
	 
	 System.out.println(s);
	 
	 System.out.println(n);
	 
 }
}


