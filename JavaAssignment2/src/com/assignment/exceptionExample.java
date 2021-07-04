package com.assignment;


public class exceptionExample {
	
	String str;
	
	exceptionExample(){
		this.str = null;
	}
	exceptionExample(String s){
		this.str = s;
	}
	
	private void method1() throws customException {
		try {
			method2();
		}
		catch (NullPointerException e) {
			throw new customException("String is null");
		}
	}
	private void method2(){
		System.out.println(str.charAt(0) + " is the first letter of the string.");
		
	}
	public static void main(String[] args) {
		exceptionExample eg1 = new exceptionExample();
		try {
			eg1.method1();
		}
		catch(customException e) {
			System.out.println("Message: "+e.getMessage());
		}
		
		
	}
}
