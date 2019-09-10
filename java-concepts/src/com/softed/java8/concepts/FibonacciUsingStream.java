package com.softed.java8.concepts;

import java.util.List;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;



public class FibonacciUsingStream {
	
	public  static List<Integer> getFibonicci(int series){
		
		return Stream.iterate(new int[]{0,1}, fib -> new int[]{fib[1], fib[0]+fib[1]})
				.limit(series)
				.map(num -> num[0])
				.collect(toList());	
	}

	public static void main(String[] args) {

		List<Integer> list = getFibonicci(15);
		list.forEach(res -> System.out.printf(res+" "));
	}

}
