package com.examples;

class Alpha implements Runnable{
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
class Beta implements Runnable{
	
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
public class ThreadRunnable {

	public static void main(String[] args) throws InterruptedException {
	Alpha obj = new Alpha();
	Beta obj1 = new Beta();
	
	Thread t1 = new Thread(obj);
	Thread t2 = new Thread(obj1);
	
	t1.start();
	Thread.sleep(10);
	t2.start();
        
	}

}
