package com.softed.java8.concepts;

import java.util.stream.Stream;

public class ReverseString {
	
	// using lambda expression
		static ReverseFunctionalInterface  intraf = str->{
		String revstr = "";
		char[] arr = str.trim().toCharArray();
		for(int i = arr.length-1; i >= 0 ; i--) {
			revstr = revstr+ Character.toString(arr[i]);
		}
			return revstr;
	};

	public static void main(String[] args) {

		// using stream to reverse the string
		Stream.of("Reverser Given String").map(str -> new StringBuilder(str).reverse()).forEach(System.out::print);
		
		System.out.println();		
		
		String source = "Reverse String Demo";
		System.out.println("Source String = "+source);
		System.out.println("Reverse String Result : "+intraf.reverseStr(source));
	}
}