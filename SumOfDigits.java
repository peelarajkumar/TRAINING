package com.statements;

public class SumOfDigits {
public static void main(String [] args) {
	
	int num = 365;
	
	 int arm = 0;
     int rem = 0;
  while (num != 0) {
             rem = num % 10;
             arm = arm + rem;
             num= num/ 10;
         }
 System.out.println("SUM OF THE DIGITS : "+arm);
         arm=0;
         rem=0;
 }	
}

