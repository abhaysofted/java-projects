package com.softed.singleton;

public class EagerStaticBlockSingleton {
	
	private static EagerStaticBlockSingleton  instance ;
	
	private EagerStaticBlockSingleton () {}
	
	static {
		
		try {
			instance = new EagerStaticBlockSingleton ();
		}catch(Exception exception) {
			throw exception;
		}
	}
	
	public EagerStaticBlockSingleton  getInstance() {
		return instance;
	}
}