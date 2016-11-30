package com.adaming.design_pattern.adapter;

public class Test {

	public static void main(String[] args) {
		Chargeur chargeur = new Chargeur();
		

		PortableX portableX = new PortableX();		
		
		AdaptateurX adaptateurX = new AdaptateurX(portableX);

		chargeur.brancherPortable(adaptateurX);

		System.out
				.println("*****************************************************************");

		PortableY portableY = new PortableY();
		AdaptateurY adaptateurY = new AdaptateurY(portableY);

		chargeur.brancherPortable(adaptateurY);
	}
}
