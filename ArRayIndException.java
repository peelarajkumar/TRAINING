package com.handling;

public class ArRayIndException {
	
public static void main(String[] args) {
	
	int arr[] = new int[10];
	arr[0]=10;
	arr[5]=20;
	try {
	arr[10]=30;
	arr[15]=40;
	}
	catch(ArrayIndexOutOfBoundsException aie) {
		aie.printStackTrace();
		System.out.println("Array index exceeded");
		}
	
}
}
