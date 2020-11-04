package com.statements;

public class Fibnoccipattern {

	public static void main(String[] args) {
		
		
int i,j,sum=0;
int a=-1;
int b=1;
		
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
			{ 
				sum=a+b;
				a=b;
				b=sum;
			System.out.print(sum+" ");	
			}
		System.out.println( );
	}
}
}
