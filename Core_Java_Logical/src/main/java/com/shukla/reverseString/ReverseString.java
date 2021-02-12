package com.shukla.reverseString;

public class ReverseString {

	// Added By Shukla
	
	public String method1(String str) {

		StringBuffer sf = new StringBuffer(str);
		StringBuffer revString = sf.reverse();
		return revString.toString();

	}

	public void method2(String str) {

		char[] charArray = str.toCharArray();
		for (int i = charArray.length - 1; i >= 0; i--) {
			System.out.print(charArray[i]);
		}
	}

	public String method3(String str) {

		String revString = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			revString = revString + str.charAt(i);
		}
		return revString;

	}

	public static void main(String[] args) {

		String method1 = new ReverseString().method1("shukla");
		System.out.println(method1);
		new ReverseString().method2("shukla");
		String method3 = new ReverseString().method3("shukla");
		System.out.println(method3);

	}

}
