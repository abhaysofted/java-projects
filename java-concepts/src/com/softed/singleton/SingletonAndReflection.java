package com.softed.singleton;

import java.lang.reflect.Constructor;

public class SingletonAndReflection {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws IllegalAccessException {

		// check singleton using reflection api to break singleton properties
		
		  Singleton singletonInstance = Singleton.getInstance(); Singleton
		  singletonAndReflection = null;
		  
		  try { Constructor[] constructors = Singleton.class.getDeclaredConstructors();
		  for (Constructor constructor : constructors) {
		  constructor.setAccessible(true); singletonAndReflection = (Singleton)
		  constructor.newInstance(); } } catch (Exception ex) { throw new
		  RuntimeException(ex); }
		  
		  System.out.println("singletonInstance hashCode: " + singletonInstance.hashCode());
		  System.out.println("reflectionInstance hashCode: " + singletonAndReflection.hashCode());
		 
		
		// check Singleton Protection against Reflection API to break singleton properties
		
		SingletonProtectAgainstReflection singletonProtectAgainstReflection = SingletonProtectAgainstReflection.getInstance();
		SingletonProtectAgainstReflection singletonProtectAgainstReflection2 = null;
		
		try {
            Constructor[] constructors = SingletonProtectAgainstReflection.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                constructor.setAccessible(true);
                singletonProtectAgainstReflection2 = (SingletonProtectAgainstReflection) constructor.newInstance();
            }
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }

        System.out.println("singletonProtectAgainstReflection hashCode: " + singletonProtectAgainstReflection.hashCode());
        System.out.println("reflectionInstance hashCode: " + singletonProtectAgainstReflection2.hashCode());
	}
}