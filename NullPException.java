package com.handling;

public class NullPException {

	public static void main(String[] args) {

	   String s = "Apple";
		String t = null;
	
	
	try {
		t.charAt(3);
	System.out.println(t.charAt(3));
	}
	catch(NullPointerException np)
	{
		np.printStackTrace();
		//System.out.println("NULL POINT ECEP");
	}
	System.out.println("HANDLED EXCEP");

	}

}
