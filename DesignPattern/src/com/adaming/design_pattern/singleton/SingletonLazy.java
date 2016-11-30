package com.adaming.design_pattern.singleton;

public class SingletonLazy {
	private static SingletonLazy anInstance;

	synchronized public static SingletonLazy getInstance() {
		if (anInstance == null)
			anInstance = new SingletonLazy();
		return anInstance;
	}

	private SingletonLazy() {
		System.out.println("Private Constructor");
	}
}
