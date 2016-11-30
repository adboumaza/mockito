package com.adaming.design_pattern.template;

public class TemplateDemo {

	public static void main(String[] args) {
		HouseTemplate houseTemplate = new WoodenHouse();
		houseTemplate.buildHouse();

		System.out.println("************************");
		
		
		houseTemplate = new BrickHouse();
		houseTemplate.buildHouse();
	}

}
