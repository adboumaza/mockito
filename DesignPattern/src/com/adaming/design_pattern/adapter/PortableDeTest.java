package com.adaming.design_pattern.adapter;

public class PortableDeTest implements IChargeable {

	public void Recharger(int volts) {
		System.out.println("Portable de test en charge");
		System.out.println("voltage: " + volts);
	}
}
