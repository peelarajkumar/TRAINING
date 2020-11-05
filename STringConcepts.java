package com.handling;

public class STringConcepts {
	public static void main(String[] args) {
		
		String s = "APPLE";
		String t = " IS A FRUIT ";
		String f = s.concat(t);
		System.out.println(f);
		System.out.println(     );
		
		String z = "LOOK AFTER THE COOK";
		String y[]= z.split(" ");
		for(int i =0;i<=y.length-1;i++)
		{
			System.out.println(y[i]);
		}
		System.out.println(     );
		
		String a = "ALPHABETS";
		char b = a.charAt(4);
		System.out.println(b);
		String c = a.replace('A', 'Y');
		System.out.println(c);
		
		
		String d = "MONKEY";
		String e = d.toLowerCase();
		String m= d.substring(3, 6);
		System.out.println(e);
		System.out.println(m);
		System.out.println(     );
		
		String h = "CRICKET";
		String i = "cricket";
		
		if(h.equals("CRICKET"));
		System.out.println("EQUALS WITH CASE SENSITIVE");
		
		if(i.equalsIgnoreCase("cricket"));
		System.out.println("EQUALS WITH CASE IGNORING");
		
		
		
	}

}
