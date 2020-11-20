package com.Assignment10;

public class SynchronousDemo {

	public static void main(String[] args) {
		Student sam = new Student();
		MyThread x = new MyThread(sam,"PRIMARY");
		MyThread y = new MyThread(sam,"SECONDARY");
		x.start();
		y.start();
		
}

}
class Student{
	public synchronized void show(String schoolname) throws InterruptedException {
		for(int i=0;i<10;i++) {
			System.out.print("WELCOME TO THE SCHOOL ");
			Thread.sleep(100);
			System.out.println(schoolname);
		}}
	}

      class MyThread extends Thread {
	  Student s;
	  String schoolname;
	  MyThread(Student s , String schoolname)
	  {
		this.s = s;
		this.schoolname=schoolname;
	  }
	  public void run() {
		  try {
			s.show(schoolname);
		} catch (InterruptedException e) {
	       	e.printStackTrace();
		}		  
  }
	}
