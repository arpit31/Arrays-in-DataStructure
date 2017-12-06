package com.Array;

import java.util.Scanner;

public class ReverseArray {
	static void reverse(int arr[], int n) {
 int first=0;
 int last=0;
 int lastIndex=arr.length-1;
		for(int i=0; i<n;i++,lastIndex--) {
			first=arr[i];
			last=arr[lastIndex];
			arr[lastIndex]=first;
			arr[i]=last;
			
		}
		for(int j:arr) {
			System.out.print(j+" ");
		}
	}
public static void main(String[] args) {
	int arr[]= {1,2,3,4,5,6,7};
	System.out.println("enter the number of elements need to reverse");
	int n=new Scanner(System.in).nextInt();
	int length=arr.length;
	if(length>n)
	reverse(arr,n);
	else if(length==n)
		System.out.println("will return same array");
	else
		System.out.println(" elements to reverse are more than array length");
}
}
//Above code is having time complexity as O(n), where n stands for number of elements 
//to reverse.  
/*enter the number of elements need to reverse
3
7 6 5 4 3 2 1 */
/*enter the number of elements need to reverse
4
7 6 5 4 3 2 1 */
/*enter the number of elements need to reverse
5
7 6 3 4 5 2 1 */
