package com.statements;

public class ReversePalindrome {
public static void main(String[] args) {
	
	int num = 133;
	//int num = 151;
	 int rem=0;
     int t = num;
     int rev=0;
     while(num!=0)
     {
     rem=num%10;
     rev=rev*10+rem;
     num=num/10;
     }
     System.out.println("REVERSE OF A NUMBER IS "+" "+rev);
     if(rev==t)
     {
         System.out.println("IT IS A PALINDROME NUMBER"+" ");
     }
     else
     {
         System.out.println("IT IS NOT A PALINDROME NUMBER"+" ");
     }
}
}
