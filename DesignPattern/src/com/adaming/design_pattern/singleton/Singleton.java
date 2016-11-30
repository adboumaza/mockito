package com.adaming.design_pattern.singleton;

public class Singleton {
	private static Singleton anInstance = null;

	public static Singleton getInstance() {
		if (anInstance == null)
			anInstance = new Singleton();
		return anInstance;
	}

	private Singleton() {
		System.out.println("Private Constructor");
	}
}
