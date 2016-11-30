package com.adaming.design_pattern.adapter;

public class PortableY {
	// ne se recharge qu'avec du 5 volts
	public void ChargerBatteries(int volts) {
		System.out.println("Portable Y en charge");
		System.out.println("voltage: " + volts);
	}
}
