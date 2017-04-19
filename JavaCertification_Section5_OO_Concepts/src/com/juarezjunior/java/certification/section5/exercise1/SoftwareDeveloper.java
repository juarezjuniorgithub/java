package com.juarezjunior.java.certification.section5.exercise1;

import java.util.ArrayList;
import java.util.List;

public class SoftwareDeveloper extends Employee {

	private static final long serialVersionUID = -8037725807967698436L;
	private List<String> programmingLanguageSkills;

	public void addProgrammingLanguage(String programmingLanguage) {
		if (programmingLanguageSkills == null) {
			programmingLanguageSkills = new ArrayList<String>();
		}
		programmingLanguageSkills.add(programmingLanguage);
	}

	public SoftwareDeveloper() {
		super();
	}

	public SoftwareDeveloper(List<String> programmingLanguageSkills) {
		super();
		this.programmingLanguageSkills = programmingLanguageSkills;
	}

	public SoftwareDeveloper(Integer hours, Double ratePerHour) {
		super(hours, ratePerHour);
	}

	public List<String> getProgrammingLanguageSkills() {
		return programmingLanguageSkills;
	}

	public void setProgrammingLanguageSkills(List<String> programmingLanguageSkills) {
		this.programmingLanguageSkills = programmingLanguageSkills;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((programmingLanguageSkills == null) ? 0 : programmingLanguageSkills.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		SoftwareDeveloper other = (SoftwareDeveloper) obj;
		if (programmingLanguageSkills == null) {
			if (other.programmingLanguageSkills != null)
				return false;
		} else if (!programmingLanguageSkills.equals(other.programmingLanguageSkills))
			return false;
		return true;
	}

}
