package com.Array;

import java.util.*;

public class PairWithGivenSum {
	static HashMap<Integer, Integer> map = new HashMap();

	static void putInMap(int arr[]) {
		for (int i : arr) {
			if (map.get(i) != null)
				map.put(i, map.get(i) + 1);
			else
				map.put(i, 1);
		}
		for (int i : map.keySet())
			System.out.println("Key: " + i + " value: " + map.get(i));
	}

	static void findPairs(int arr[], int sum) {
		for (int i : arr) {
			int temp = sum - i;
			if (map.get(temp) != null) {
				if (temp == i && map.get(temp) != 1) {
					System.out.println("pairs are " + i + " and " + temp);
				} else if (temp != i) {
					System.out.println("pairs are " + i + " and " + temp);
				}
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 1, 3, 1, 4, 5, 6 };
		putInMap(arr);
		int sum = 10;
		findPairs(arr, sum);
	}
}
// Either we can create two loops and add-compare but that will cause O(n2)
// complexity.