package com.cts.venky.expedia;

public class Palindrom {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="12DAD21";
		String  str2="This String is not a Pailendrom ";
		System.out.println(checkPalindrom(str1));
		System.out.println(checkPalindrom(str2));
	}
	private static boolean checkPalindrom(String str)
	{
		boolean  palindrom=false;
		
	char newstr[]=	str.toCharArray();
	
	for ( int i=0; i<newstr.length; i++)
	{
		if(newstr[i]==newstr[newstr.length-1-i])
		{
			palindrom=true;
		}
		else {
			palindrom=false;
			return palindrom;
			}
	}
		return palindrom;
	}

}
