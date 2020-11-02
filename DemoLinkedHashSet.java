package com.LinkedHashset;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;

public class DemoLinkedHashSet {
public static void main(String[] args) {
	
	LinkedHashSet<String>lh = new LinkedHashSet();
	lh.add("APPLE");
	lh.add("BOY");
	lh.add("CAT");
	lh.add("BRITISH");
	lh.add("EMPIRE");
	lh.add("MAVIN");
	lh.add("ZEBRA");
	lh.add("CAT");
	lh.size();
	
   System.out.println(lh.remove("CAR"));
   System.out.println(lh.size());
   System.out.println(lh.contains("CAT"));
   System.out.println(lh);
	
	
}
}
