package com.assignment;


public class exceptionExample {
	private void method1() throws customException {
		try {
			method2();
		}
		catch (NullPointerException e) {
			throw new customException("String is null");
		}
	}
	private void method2(){
		String str = null;
		System.out.println(str.charAt(0));
		
	}
	public static void main(String[] args) {
		exceptionExample eg = new exceptionExample();
		try {
			eg.method1();
		}
		catch(customException e) {
			System.out.println("Message: "+e.getMessage());
		}
		
		
	}
}
