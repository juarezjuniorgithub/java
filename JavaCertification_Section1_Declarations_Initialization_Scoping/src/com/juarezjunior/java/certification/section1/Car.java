package com.juarezjunior.java.certification.section1;

import java.awt.Color;

/**
 *
 * @author juarezjuniorgithub
 */
public class Car extends Vehicle {

	private String manufacturer;

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public Car(String manufacturingDate, Color color, int maximumSpeed) {
		super(manufacturingDate, color, maximumSpeed);
	}

	public void accelerate(int a, Double speed) {
		setMaximumSpeed((int) (getMaximumSpeed() * speed));
	}

	@Override
	public String toString() {
		return new StringBuilder(super.toString()).append(", manufacturer=").append(manufacturer)
				.toString();
	}

}
