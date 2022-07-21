package com.program;

public class FindSumOfNumberFromString {

	public static void main(String[] args) {
		//Add the number and find the total sum from given string
		//Example- str="abc2be3b4bdf5"; output=2+3+4+5=14
		
		String str = "ab123a"; //1+2+3=6;
		
		
		 char[] charArray = str.toCharArray();
		 int sum=0;
		 for (char c : charArray) {
			
			 if(Character.isDigit(c))
				 sum=sum+Integer.parseInt(String.valueOf(c));
			 
		}
		 System.out.println(sum);
	}

}
