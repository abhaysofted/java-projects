package com.softed.singleton;

public class LazyDoubleCheckedLockingSingleton {

	public static volatile LazyDoubleCheckedLockingSingleton instance;
	
	private LazyDoubleCheckedLockingSingleton() {}
	
	public static LazyDoubleCheckedLockingSingleton getInstance() {
		
		if(instance == null) {
			synchronized(LazyDoubleCheckedLockingSingleton.class) {
				if(instance == null) {
					instance = new LazyDoubleCheckedLockingSingleton();
				}
			}
		}
		return instance;
	}
}