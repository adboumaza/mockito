package com.adaming.design_pattern.template;

public class BrickHouse extends HouseTemplate {
	
	@Override
	public void buildWalls() {
		System.out.println("Building Brick Walls");
	}

	@Override
	public void buildPillars() {
		System.out.println("Building Pillars with reinforced concrete");
	}

}
