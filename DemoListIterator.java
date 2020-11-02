package com.ListIterator;

import java.util.ArrayList;
import java.util.ListIterator;

public class DemoListIterator {

	public static void main(String[] args) {
		ArrayList<Integer> num =new ArrayList();
		num.add(19);
		num.add(27);
		num.add(9);
		num.add(34);
		num.add(65);
		num.add(13);
		num.add(16);
		
		
	ListIterator<Integer> lit = num.listIterator();
	
while(lit.hasNext()) {
	System.out.println(lit.next());

}

	}

}
