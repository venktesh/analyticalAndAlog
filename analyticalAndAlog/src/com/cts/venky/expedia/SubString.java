package com.cts.venky.expedia;

import java.util.StringTokenizer;

/*
 * This program will find out number of   repeatitons in  given string   
 */
public class SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String token = "ABCD";
		String str = "kjasldkgfkajiojkladnfkABCDaksjdfknsakldnnkadlsknfABCDlksajgjaksdjABCDajkfjadksljfklABCDakljsgfdsaklABCD";
		System.out.println(numberOfMaches(str, token));
	}

	public static int numberOfMaches(String str, String token) {
		StringTokenizer st = new StringTokenizer(str, token);
		String xyz[] = str.split(token);
		for (int i = 0; i < xyz.length; i++)
			System.out.println(xyz[i]);

		return xyz.length;

	}

}
