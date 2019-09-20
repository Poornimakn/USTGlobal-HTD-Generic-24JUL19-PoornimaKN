package com.dev.strings;

public class String1 {

	public static void main(String[] args) {
		String str = "Some_String";
		String str2 = "soMe_StRiNg";
		
		int len=str.length();
		System.out.println("Output of length() " +len);
		
		char[] ch=str.toCharArray();
		System.out.println("Output of toCharArray() "+ch[10]);
		
		char c=str.charAt(4);
		System.out.println("Output of toCharAt "+c);
		
		boolean b=str.equals(str2);
		System.out.println("Output of equals() "+b);
		
		boolean b1=str.equalsIgnoreCase(str2); 
		System.out.println("Output of equalsIgnorecase() "+b1);
		
		boolean v= str.contains("Som");
		System.out.println("Output of contains() "+v);
		
		String g=str.replace("_", ":");
		System.out.println("Output of replace "+g);
		
		int h=str.indexOf("e"); //returns index of first occurrence
		System.out.println("Output of indexOf() "+h);
		
		String i=str.toUpperCase();
		System.out.println("Output of tpUpperCase() "+i);
		
		String j=str.toLowerCase();
		System.out.println("Output of toLowerCase() "+j);
		
		String a=str.substring(3);
		System.out.println("Output of substring() "+a);
		
		String q=str.substring(3,7); //first arg:begining index(included) and second arg:ending index(not included)
		System.out.println("Output of substring() "+q);
		
		
	}

}
