package com.program;

public class RemoveVowelFromString {
	
	public static void main(String[] args) {
		
		String word="akdjfkadjiweuizoOAIEojsdh";
		
		String replaceAll = word.replaceAll("[aeiouAEIOU]", "");
		System.out.println(replaceAll);
		
	}

}
