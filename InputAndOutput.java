package com.Filesand;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class InputAndOutput {

	public static void main(String[] args) {
		// Create a new file and locate its path
        try {
		//File a = new File("Files.txt");
		//if(a.createNewFile()) {
		//System.out.println("FILE IS CREATED "+a.getName());
			//System.out.println("ITS PATH "+a.getAbsolutePath());
			
			
			//FileInputStream fi = new FileInputStream("C:\\Users\\Welcome\\Desktop\\JNIT TRAIN\\Assignment4\\Files.txt");
			FileOutputStream fo = new FileOutputStream("C:\\Users\\Welcome\\Desktop\\JNIT TRAIN\\Assignment4\\Files.txt");
			
		String s = "THIS IS WIN";
		byte b[] = s.getBytes();
		fo.write(b);
		
		//int i = fi.read();  // reading one char
		//System.out.println((char)i);
		
	//	int j = 0; // all characters 
		//while((j=fi.read())!=-1){
			
			//System.out.print((char)j);
		//}
		//fi.close();
		
		
		}
        catch(Exception e) {
        	
        	e.printStackTrace();
        }
		
	}

}
