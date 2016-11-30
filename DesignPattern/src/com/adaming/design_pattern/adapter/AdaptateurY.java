package com.adaming.design_pattern.adapter;

public class AdaptateurY implements IChargeable {

	private PortableY portable;

	public AdaptateurY(PortableY portable) {
		super();
		this.portable = portable;
	}

	@Override
	public void Recharger(int volts) {

		int nouveauVoltage;

		if (volts > 5) {
			nouveauVoltage = 5;
		} else {
			nouveauVoltage = volts;
		}

		this.portable.ChargerBatteries(nouveauVoltage);
	}
}
