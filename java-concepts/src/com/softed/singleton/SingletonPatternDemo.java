package com.softed.singleton;

public class SingletonPatternDemo {

	public static void main(String[] args) {
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		if(obj1 == obj2) {
			System.out.println("Both are holding same object");
		}else {
			System.out.println("Both are holding different object");
		}
	}

}
