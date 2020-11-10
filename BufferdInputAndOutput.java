package com.Filesand;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferdInputAndOutput {
	public static void main(String[] args) {
		
		try {
			FileInputStream fi = new FileInputStream("C:\\Users\\Welcome\\Desktop\\JNIT TRAIN\\Assignment4\\STREAMS.txt");
			FileOutputStream fo = new FileOutputStream("C:\\Users\\Welcome\\Desktop\\JNIT TRAIN\\Assignment4\\fileout.txt");
			
			BufferedInputStream bs = new BufferedInputStream(fi);
			
			BufferedOutputStream bo = new BufferedOutputStream(fo);
			String d = "INTO THE FILE";
			byte k[] = d.getBytes();
			fo.write(k);
			int i = bs.read();
			System.out.println((char)i);
			
			int j;
			while((j=bs.read())!=-1){
			System.out.print((char)j);
				
			}
			
			
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
	}

}
