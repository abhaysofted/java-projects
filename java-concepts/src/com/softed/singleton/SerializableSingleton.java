package com.softed.singleton;

import java.io.Serializable;

public class SerializableSingleton implements Serializable{

	private static final long serialVersionUID = 3931844022164168329L;
	private static SerializableSingleton instance;
	
	private SerializableSingleton() {}
	
	public static synchronized  SerializableSingleton getInstance() {
		
		if(instance == null) {
			instance = new SerializableSingleton();
		}
		return instance;
	}

	// Prevent to create new object at the time deserialization 
	protected Object readResolve() {
        return instance;
    }
}
