package com.handling;

public class ArithException {

	public static void main(String[] args) {
		int a=10;
		int b= 0;
		System.out.println("good morning");
		try {
			int c = a/b;
			   System.out.println(c);
			}
		
		
		catch(ArithmeticException ae) {
		System.out.println("Cannot divide with zero ");
		//ae.printStackTrace();
	}
	
		//finally block executes before the try catch block;
	finally {
			System.out.println("between the try-catch block");
			}
		System.out.println(a);
		System.out.println(b);

	}

}
