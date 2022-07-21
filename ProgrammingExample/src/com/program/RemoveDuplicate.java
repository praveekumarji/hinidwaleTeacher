package com.program;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveDuplicate {
	
	public static void main(String[] args) {
		
		String s ="ppaddssresdhh";
		
		char[] charArray = s.toCharArray();
		Arrays.sort(charArray);
		Set<Character> set	 = new HashSet<Character>();
		for(int i=1;i<charArray.length;i++) {
			
			set.add(charArray[i]);
		}
		Iterator<Character> iterator = set.iterator();
		 String sbString = new String();
		 while (iterator.hasNext())
		 sbString += iterator.next()+"";
		 System.out.println(sbString);
		 
		 addNumberFromString("abc2sdf34e44");
		 
	}

	static void addNumberFromString(String abc) {
		
		char[] charArray = abc.toCharArray();
		int sum=0;
		for (char c : charArray) {
			
			if(Character.isDigit(c)) {
				sum=sum+Integer.parseInt(String.valueOf(c));
			}
			
		}
		System.out.println("Add of all nuber"+sum);
	}
	
}
