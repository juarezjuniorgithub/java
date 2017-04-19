package com.juarezjunior.java.certification.section5.exercise1;

public class Manager extends Employee {

	private static final long serialVersionUID = -273398195077532383L;
	private String mainProject;

	@Override
	public Double getRatePerHour() {
		return super.getRatePerHour() + super.getRatePerHour() * 10 / 100;
	}

	public Manager() {
		super();
	}

	public Manager(String mainProject) {
		super();
		this.mainProject = mainProject;
	}

	public Manager(Integer hours, Double ratePerHour) {
		super(hours, ratePerHour);
	}

	public String getMainProject() {
		return mainProject;
	}

	public void setMainProject(String mainProject) {
		this.mainProject = mainProject;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((mainProject == null) ? 0 : mainProject.hashCode());
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
		Manager other = (Manager) obj;
		if (mainProject == null) {
			if (other.mainProject != null)
				return false;
		} else if (!mainProject.equals(other.mainProject))
			return false;
		return true;
	}

}
