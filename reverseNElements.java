package com.map;

public class reverseNElements {
	static int[] reverse(int arr[], int k) {
		if(k<=1)
			return arr;
		int n=arr.length-1;
		if(arr.length<k)
			k=n;
		int temp;
		for(int i=1;i<=k;i++) {
			temp=arr[k-i];
					arr[k-i]=arr[n-k+i];
					arr[n-k+i]=temp;
		}
		return arr;
		
		
	}
public static void main(String[] args) {
	int arr[]= {1,2,3,4,5,6,7,8};
	for(int i:arr) {
		System.out.print(i+" ");
	}
	reverse(arr,3);
	System.out.println();
	for(int i:arr) {
		System.out.print(i+" ");
	}
}
}
