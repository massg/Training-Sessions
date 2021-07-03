package com.assignment;

import java.util.Scanner;

public class Shape {
	private static int length,width;
	
	private boolean isSquare() {
		return length==width;
	}
	
	public static void main(String[] args) throws NotASquareException {
		
		Scanner s = new Scanner(System.in);
		Shape tmp = new Shape();
		
		System.out.println("Enter length and width");
		
		length = s.nextInt();
		width = s.nextInt();
		s.close(); 
	
		if(tmp.isSquare()) 
			System.out.println("It's a Square");
		else {
			System.out.println("It's not a square");
			throw new NotASquareException("not a square");
		}
			
	}
	
}
