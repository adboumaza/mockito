package com.adaming.design_pattern.adapter;

public class AdaptateurX implements IChargeable {

	private PortableX portable;

	public AdaptateurX(PortableX portable) {
		super();
		this.portable = portable;
	}

	@Override
	public void Recharger(int volts) {
		this.portable.ChargerPortable(volts);
	}

}
