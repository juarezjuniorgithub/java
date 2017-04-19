package com.juarezjunior.java.certification.section5.exercise1;

/**
 *
 * @author juarezjuniorgithub
 *
 *         Section 5, Exercise 1
 *
 *         Create a class hierarchy that demonstrates the following principles:
 *         inheritance, encapsulation (data hiding), method overloading, method
 *         overriding, object instantion, polymorphism. Demonstrate the
 *         implementation of equals() and hashCode() methods
 *
 *         References:
 *
 *         http://docs.oracle.com/javase/tutorial/java/javaOO/classes.html
 *         http://docs.oracle.com/javase/tutorial/java/IandI/subclasses.html
 *
 */
public class Section5Exercise1Main {

	public static void main(String[] args) {

		Employee emp1 = new Manager(5, 80.0);

		Manager emp2 = new Manager();
		emp2.setHours(6);
		emp2.setRatePerHour(60d);
		emp2.setMainProject("SGO");

		Employee emp3 = (Employee) emp2;
		emp3.setRatePerHour(75d);

		SoftwareDeveloper emp4 = new SoftwareDeveloper(10, 50d);
		emp4.addProgrammingLanguage("Java");
		emp4.addProgrammingLanguage("Python");
		emp4.addProgrammingLanguage("Ruby");

		SoftwareDeveloper emp5 = new SoftwareDeveloper(8, 30d);
		emp5.addProgrammingLanguage("C");
		emp5.addProgrammingLanguage("C++");
		emp5.addProgrammingLanguage("C#");

		showEmployeeInformation(emp1);
		showEmployeeInformation(emp2);
		showEmployeeInformation(emp3);
		showEmployeeInformation(emp4);
		showEmployeeInformation(emp5);
	}

	public static void showEmployeeInformation(Employee employee) {
		System.out.println("Employee: " + employee.getClass().getSimpleName());
		System.out.println("Hours: " + employee.getHours());
		System.out.println("Rate per hour: " + employee.getRatePerHour());
		System.out.println("Total: " + employee.getHours() * employee.getRatePerHour());
		System.out.println("------------------------------");
	}

}
