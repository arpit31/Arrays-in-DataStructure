package com.Array;

public class BinarySearch {
	static int search(int arr[],int l,int x,int r) {
		if(r>=l) {
			int mid=(r+l)/2;
			if(arr[mid]==x)
				return mid;
			else if(x>arr[mid])
				return search(arr,mid+1,x,r);
			
			else if(x<arr[mid])
				return search(arr,l,x,mid-1);
		}
		return -1;
	}
public static void main(String[] args) {
	int arr[]= {1,4,5,6,7,9};
	System.out.println("Element found at "+search(arr,0,9,arr.length-1));
}
}
