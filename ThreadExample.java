package com.examples;


class Hi extends Thread{
public void run() {
	
	for(int i=1;i<=5;i++) {
		
		System.out.println("HI");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}	
	
	
}
class Hello extends Thread{
	
	public void run() {
		
		for(int i=1;i<=5;i++) {
			
			System.out.println("HELLO");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
public class ThreadExample {

	public static void main(String[] args) {
		
		Hi obj = new Hi();
		Hello obj2 = new Hello();
		
		obj.start();
		obj2.start();
		
	}

}
