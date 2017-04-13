package com.juarezjunior.java.certification.section1.exercise1;

import java.awt.Color;

/**
 *
 * @author juarezjuniorgithub
 *
 */
public class Vehicle {

	private String name;
	private Color color;
	private int maximumSpeed;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public int getMaximumSpeed() {
		return maximumSpeed;
	}

	public void setMaximumSpeed(int maximumSpeed) {
		this.maximumSpeed = maximumSpeed;
	}

	public void accelerate(int speed) {
		this.maximumSpeed += speed;
	}

	public Vehicle(String name, Color color, int maximumSpeed) {
		this.name = name;
		this.color = color;
		this.maximumSpeed = maximumSpeed;
	}

	@Override
	public String toString() {
		return new StringBuilder("Vehicle: ").append("name=").append(name).append(", color=").append(color)
				.append(", maximumSpeed=").append(maximumSpeed).toString();
	}

}
