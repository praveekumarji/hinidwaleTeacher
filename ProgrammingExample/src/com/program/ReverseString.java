package com.program;

public class ReverseString {
	
	public static void main(String[] args) {
	//How to reverse string is java	
	//check whether string is palindrome or not	
	//	String s ="abcba";
		String s ="acdefds";
		StringBuffer str = new StringBuffer(s);
		String afterString =str.reverse().toString();
		
		System.out.println(afterString);
		if(s.equals(afterString)) {
			System.out.println("This is palindrome string");
		}else {
			System.out.println("This is not a palindrome");
		}
	}

}
