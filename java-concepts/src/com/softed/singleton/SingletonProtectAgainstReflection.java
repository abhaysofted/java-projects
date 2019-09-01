package com.softed.singleton;

public class SingletonProtectAgainstReflection {

	private static final SingletonProtectAgainstReflection instance = new SingletonProtectAgainstReflection();
	
	private SingletonProtectAgainstReflection() {
		if(instance != null) {
			throw new IllegalStateException("SingletonProtectAgainstReflection already initialized");
		}
	}
	
	public static SingletonProtectAgainstReflection getInstance() throws IllegalStateException {

		return instance;
	}
}