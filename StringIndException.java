package com.handling;

public class StringIndException {
	
public static void main(String[] args) {
	
	String s = "TOM AND JERRY";
	try {
		
		s.charAt(17);
	}
	catch(StringIndexOutOfBoundsException sie) {
	sie.printStackTrace();
	//System.out.println("GIVEN INDEX EXCEEDED THE STRING RANGE");
	}
	
}
}
