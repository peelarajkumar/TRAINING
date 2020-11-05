package com.handling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.FileSystemNotFoundException;

public class BlockThrow {
public static void main(String args[]) throws ArithmeticException,NullPointerException,StringIndexOutOfBoundsException,FileNotFoundException,Exception

{
	try {
		
		FileReader red = new FileReader("rate");
	}
	catch(Exception e) {
		e.printStackTrace();
		System.out.println("no file found");
		
	}
	try {
		
		int a=10;
		int b=0;
		int c = a/b;
	}
	catch(Exception ee) {
	ee.printStackTrace();
	System.out.println("Arithmetic exception ");
		
	}
	
	
}
}
