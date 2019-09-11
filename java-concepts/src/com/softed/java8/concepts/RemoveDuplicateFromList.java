package com.softed.java8.concepts;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateFromList {
	
	public static List<String> removeDuplicate(List<String> list){
		
		return list.stream().distinct().collect(Collectors.toList());
	}

	public static void main(String[] args) {
		
		List<String> data = new ArrayList<String>();
		data.add("abhay");
		data.add("jeevan");
		data.add("anish");
		data.add("sumit");
		data.add("abhay");
		data.add("jeevan");
		data.add("manish");
		data.add("anish");
		data.add("ajay");
		data.add("nitu");
		
		System.out.println("After remove duplicate string from list = "+removeDuplicate(data));		
	}
}