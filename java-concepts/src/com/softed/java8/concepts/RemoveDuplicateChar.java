package com.softed.java8.concepts;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveDuplicateChar {
	
	public static String removeDuplicates(String str) {
        return Arrays.asList(str.split(""))
                     .stream()
                     .distinct()
                     .collect(Collectors.joining());
    }

	public static void main(String[] args) {

		System.out.println("After remove duplicate character = "+removeDuplicates("abhay guptag"));
	}
}