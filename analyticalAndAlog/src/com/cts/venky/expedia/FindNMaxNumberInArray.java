package com.cts.venky.expedia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class FindNMaxNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[] = { 12, 324, 23, 7, 34, 45, 345, 4, 634, 634, 43 };
		numbers = FindNMaxNumberInArray.shortArray(numbers);
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}

	}

	private static int[] shortArray(int numbers[]) {
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] < numbers[j]) {
					int tmp = numbers[j];
					numbers[j] = numbers[i];
					numbers[i] = tmp;
				}
			}
		}

		System.out
				.println("**********************************************************************************");
		return numbers;
	}
}
