package com.Filesand;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SequenceInput {

	public static void main(String[] args) throws IOException {
		try {
			FileInputStream fot = new FileInputStream("C:\\Users\\Welcome\\Desktop\\JNIT TRAIN\\Assignment4\\Files.txt");
			FileInputStream fin = new FileInputStream("C:\\Users\\Welcome\\Desktop\\JNIT TRAIN\\Assignment4\\STREAMS.txt");
			
			SequenceInputStream is = new SequenceInputStream(fot,fin);
			  int j;    
			   while((j=is.read())!=-1){    
			    System.out.print((char)j);    
			   }
			
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		}

	}

}
