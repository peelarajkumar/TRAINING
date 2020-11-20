package com.Assignment10;

public class SleepDemo {

	public static void main(String[] args) throws InterruptedException {
		for(int i=0;i<=10;i++) {
			Thread.sleep(1000);
			System.out.println(i);
			
		}
	}

}
