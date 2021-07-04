package com.assignment;

public class arrayExample {
	public static void main(String[] args) {
		
		int i = 3;
		int[] ar = new int[3];
		try {
			ar[i] = 3;
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Caught exception. Message: "+e.getMessage());
		}
		finally {
			System.out.println("Setting i to -1");
			i = -1;
		}
	}
}
