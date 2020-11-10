package com.Filesand;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class WriterAndReader {

	public static void main(String[] args) {
		try {
	Writer w = new  FileWriter("Writefile.txt");
	Reader r = new FileReader("STREAMS.txt");
	
	int x=0 ;
	while((x=r.read())!=-1)
	{
	  System.out.print((char)x);
	
		
	}
	w.append('t');
	w.write("Apple and boy");
	w.close();
	}
	
	catch(Exception e) {
		
		
	}

}
}