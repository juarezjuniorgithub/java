package com.juarezjunior.java.certification.section5.exercise1;

import java.io.Serializable;

public class Employee implements Serializable {

	private static final long serialVersionUID = 5984411502439114605L;
	private Integer hours;
	private Double ratePerHour;

	public Employee() {
		super();
	}

	public Employee(Integer hours, Double ratePerHour) {
		super();
		this.hours = hours;
		this.ratePerHour = ratePerHour;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	public Double getRatePerHour() {
		return ratePerHour;
	}

	public void setRatePerHour(Double ratePerHour) {
		this.ratePerHour = ratePerHour;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((hours == null) ? 0 : hours.hashCode());
		result = prime * result + ((ratePerHour == null) ? 0 : ratePerHour.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (hours == null) {
			if (other.hours != null)
				return false;
		} else if (!hours.equals(other.hours))
			return false;
		if (ratePerHour == null) {
			if (other.ratePerHour != null)
				return false;
		} else if (!ratePerHour.equals(other.ratePerHour))
			return false;
		return true;
	}

}
