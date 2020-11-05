package com.handling;

public class BUffer {
public static void main(String[] args) {
	
	StringBuffer bs = new StringBuffer("ELEPHANT");
	bs.append(" IS AN ANIMAL");
	System.out.println(bs);
	bs.append('E');
	System.out.println(bs);

	System.out.println(bs.charAt(7));
	System.out.println(bs.capacity());
	System.out.println(bs.length());
	System.out.println(bs.substring(15, 21));
	System.out.println(bs.indexOf("AN"));
	System.out.println(bs.lastIndexOf("ANIMALE"));
	System.out.println("CONVERTING STRING BUFFER TO STRING");
	System.out.println(bs.toString());
	
	

	
	
	
}

}
