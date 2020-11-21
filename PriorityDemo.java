package com.Assignment10;

public class PriorityDemo extends Thread {
	
	public synchronized void run() {
		System.out.println("Thread name "+currentThread().getName());
		System.out.println("Thread Priority "+currentThread().getPriority());
		
	}

	public static void main(String[] args) {
	
        PriorityDemo t1 = new PriorityDemo();
        t1.setName("HELLO THREAD");
        t1.setPriority(MIN_PRIORITY);
        PriorityDemo t2 = new PriorityDemo();
        t2.setName("HI THREAD");
        t2.setPriority(MAX_PRIORITY);
        t1.start();
        t2.start();
        
	}

}
