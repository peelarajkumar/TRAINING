package com.vector;

import java.util.Enumeration;
import java.util.Vector;

public class DemoVector {
public static void main(String[] args) {
	
	Vector <Integer> v =new Vector();
	v.add(10);
	v.add(20);
	v.add(30);
	v.add(40);
	v.add(50);
	v.add(60);
	v.add(70);
	v.add(80);
	v.add(90);
	v.add(10);

	
	Enumeration<Integer> t = v.elements() ;
	while(t.hasMoreElements())
	{System.out.println(t.nextElement());
	}
	
}
}
