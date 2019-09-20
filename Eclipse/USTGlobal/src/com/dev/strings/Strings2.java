package com.dev.strings;

public class Strings2 {

	public static void main(String[] args) {
		String str = "Poornima";
		String str1="poornima";
		String str2 = "Inchara";
		
		int len=str.length();
		System.out.println("Output of length() " +len);
		int len1=str2.length();
		System.out.println("Output of length() " +len1);
		
		char[] ch=str.toCharArray();
		System.out.println("Output of toCharArray() "+ch[6]);
		char[] ch1=str2.toCharArray();
		System.out.println("Output of toCharArray() "+ch1[6]);
		
		char c=str.charAt(4);
		System.out.println("Output of toCharAt "+c);
		char c1=str2.charAt(6);
		System.out.println("Output of toCharAt "+c1);
		
		boolean b=str.equals(str1);
		System.out.println("Output of equals() "+b);
		
		boolean b1=str.equalsIgnoreCase(str1); 
		System.out.println("Output of equalsIgnorecase() "+b1);

	}

}
