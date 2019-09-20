package com.dev.strings;

public class CreatingStrings {

	public static void main(String[] args) {
		
		StringBuffer sb= new StringBuffer("Hello");
		StringBuilder sb1= new StringBuilder("Hai");
		
//		StringBuffer sb2= new StringBuffer(1);
		
		System.out.println(sb);
		System.out.println(sb1);
		System.out.println(sb.length());
		System.out.println(sb.capacity());

	}

}
