package com.Assignment10;

public class NotifyDemo {

	public static void main(String[] args) throws Exception {
		Customer sam = new Customer();
		new Thread(){
		       public void run() {
		    	   try {
					sam.withdraw(20000);
				} catch (Exception e) {
					e.printStackTrace();
				}
		       }	
		}.start();;
		
		new Thread(){//thread by super constructor 
		       public void run() {
		    	   try {
					sam.deposit(300000);
				} catch (Exception e) {
					e.printStackTrace();
				}
		       }	
		}.start();;
		

	}

}

class Customer{
	int balance = 10000;
	
	synchronized public void withdraw(int amount) throws Exception {
		System.out.println("STARTING WITHDRAWL");
		if(balance<amount) {
	  balance = balance-amount;
	System.out.println("INSUFFICIENT BALANCE PLEASE DEPOSIT ");
			wait();
		}
		
		
	}
	synchronized public void deposit(int amount) {
		balance = balance+amount;
		System.out.println("GOING TO DEPOSIT ");
		System.out.println("DEPOSIT COMPLETED");
		notify();
	}
}
