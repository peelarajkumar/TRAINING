package com.HashMap;

import java.util.HashMap;
import java.util.ListIterator;

public class DemoHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	

HashMap<Integer,String> hm = new HashMap<Integer, String>();
ListIterator  lit = null;
 hm.put(01, "JANUARY");
 hm.put(02, "FEBRUARY");
 hm.put(03, "MARCH");
 hm.put(04, "APRIL");
 hm.put(05, "MAY");
 hm.put(06, "JUNE");
 hm.put(07, "JULY");
 hm.put(8, "AUGUST");
 hm.put(9, "SEPTEMBER");
 hm.put(10, "OCTOBER");
 hm.put(11, "NOVEMBER");
 hm.put(12, "DECEMBER");
 
hm.replace(9, "SEPTEMBER IS 9TH MONTH");
		    System.out.println(hm);
			

	}

}
