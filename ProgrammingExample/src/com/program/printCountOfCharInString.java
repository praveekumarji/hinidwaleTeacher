package com.program;

import java.util.HashMap;
import java.util.Map;

public class printCountOfCharInString {
	
	public static void main(String[] args) {
		
		String s ="praveenKumar";
		
		countChar( s);
	}
	
	static void countChar(String s) {
		
		char[] chars = s.toCharArray();
		
		Map<Character,Integer> m = new HashMap<Character, Integer>();
		
		for (char c : chars) {
			
			if(m.containsKey(c)) {
				m.put(c, m.get(c)+1);
				
			}else {
				m.put(c, 1);
			}
			
		}
		System.out.println(m);
	}

}
