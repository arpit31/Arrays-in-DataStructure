package com.apple;

public class MaxSubArraySum {
	
	static int maxSubArraySum(int a[]){
		int maxSoFar=0;
		int maxYet=0;
		for(int i=0;i<a.length-1;i++) {
			maxYet=maxYet+a[i];
			if(maxYet<0) {
				maxYet=0;
			}
			if(maxSoFar<maxYet) {
			}
				maxSoFar=maxYet;
		}
		return maxSoFar;
	}
public static void main(String[] args) {
	int [] a = {-2, -3, 4, 3, -6, 8, 5, -3};
    System.out.println("Maximum contiguous sum is " +
                                   maxSubArraySum(a));
}
}
