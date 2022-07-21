package com.program;

public class PairOfSum {
	
	public static void main(String[] args) {
		
		int[] arr= {2,4,6,8,10,12,2,15};
		int target=17;
		findPair(arr, target);
	}
	
	
	static void findPair(int[] arr,int target) {
		
		
		for(int i=0;i<arr.length-1;i++) {
			
			for(int j=i;j<arr.length;j++) {
				
				if(arr[i]+arr[j]==target) {
					System.out.println(arr[i]+" and "+arr[j]);
					return;
				}
				
			}
			
		}
		
		System.out.println("Not found");
	}

}
