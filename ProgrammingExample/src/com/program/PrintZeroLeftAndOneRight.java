package com.program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class PrintZeroLeftAndOneRight {

	public static void main(String[] args) {
		int[] a = {0,1,0,1,0,1,0,0,1};
		 List<Integer> ilist = new ArrayList<Integer>();
		 for (Integer integer : a) {
			ilist.add(integer);
		}
		 System.out.println(ilist);
		 Collections.sort(ilist);
			System.out.println(ilist);
			
			System.out.println("Second Way using stream");
		
		List<Integer> list = Arrays.stream(a).boxed().collect(Collectors.toList());
		Collections.sort(list);
		System.out.println(list);
		System.out.println("Third Way using stream");
		List<Integer> list2 = Arrays.stream(a).boxed().collect(Collectors.toList());
		list2.stream().sorted().collect(Collectors.toList()).forEach(System.out::print);
		System.out.println("");
		System.out.println("Revers order");
		list2.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList()).forEach(System.out::print);
	
		System.out.println("");
		System.out.println("Only O");
		list2.stream().filter(number-> number==0).forEach(System.out::print);
		
	}
}
