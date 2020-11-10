package com.Filesand;

import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CharInputandOutput {
public static void main(String[] args) throws IOException {
	
	CharArrayWriter caw = new CharArrayWriter();
	caw.write("COMMON TO ALL");
	FileWriter f1 = new FileWriter("Fil1.txt");
	FileWriter f2 = new FileWriter("Fil2.txt");
	FileWriter f3 = new FileWriter("Fil3.txt");
	
	caw.writeTo(f1);
	caw.writeTo(f2);
	caw.writeTo(f3);
	
	f1.close();
	f2.close();
	f3.close();
	
}
}
