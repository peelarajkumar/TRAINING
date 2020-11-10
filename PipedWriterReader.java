package com.Filesand;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

public class PipedWriterReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		PipedWriter a=new PipedWriter();
		PipedReader b=new PipedReader();
		String s="WELCOME TO THE SHOW";
		b.connect(a);//connects pipe writer
		a.write(s);
		a.append("HAVE A NICE DAY");
		int i;
		while((i=b.read())!=-1) {
			System.out.print((char)i);
			
		}
		
	}

}
