package com.adaming.design_pattern.adapter;

public class PortableX {

	// ne se recharge qu'avec du 10 volts
	public void ChargerPortable(int volts) {
		System.out.println("Portable X en charge");
		System.out.println("voltage: " + volts);
	}
}
