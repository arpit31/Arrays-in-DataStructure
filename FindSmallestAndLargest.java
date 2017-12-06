package com.Array;

public class FindSmallestAndLargest {
	static void find(int arr[]) {
		int largest=0;
		int smallest=0;
		if(arr.length>=1) {
		 largest = arr[0];
		 smallest=arr[0];
		}
		for(int n:arr) {
			if(n>largest)
				largest=n;
			if(n<smallest)
				smallest=n;
				
		}
		System.out.println("smallest is  "+smallest +" and the largest is  "+largest);
	}
public static void main(String[] args) {
	int arr[]= {1,3,5,6,-1,8};
	find(arr);
}
}

//smallest is  -1 and the largest is  8