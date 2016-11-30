package com.adaming.design_pattern.singleton;

public class SingletonEager {
	private static final SingletonEager anInstance = new SingletonEager();

	public static SingletonEager getInstance() {
		return anInstance;
	}

	private SingletonEager() {
		System.out.println("Private Constructor");
	}
}
