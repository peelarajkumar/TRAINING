package com.queue;

import java.util.LinkedList;
import java.util.Queue;

public class DemoQueue {
public static void main(String[] args) 
{
	Queue<String> x = new LinkedList();
	x.add("ARABIC");
	x.add("11 ");
	x.add("JHON ");
	x.add("SHIP ");
	x.add(" WADE");
	x.add("24 ");
	x.add("LAKE ");
	
	System.out.println(x);
	System.out.println("OBTAINING HEAD OF THE QUEUE");
	System.out.println(x.peek());
	System.out.println("REMOVING THE HEAD ");
	System.out.println(x.poll());
	
	System.out.println("UPDATED QUEUE SIZE IS  "+x.size());
	}
}
