package com.ttn;

import java.util.Date;

/**
 * Employee entity to store basic details of employees.
 */
public class Employee {

	private Integer empNo;
	private String firstName;
	private String lastName;
	private String middleName;
	private Integer age;
	private Date dob;

	public Employee(Integer empNo, String firstName, String lastName, String middleName, Integer age, Date dob) {
		this.empNo = empNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.age = age;
		this.dob = dob;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Employee{" +
			   "empNo=" + empNo +
			   ", firstName='" + firstName + '\'' +
			   ", lastName='" + lastName + '\'' +
			   ", middleName='" + middleName + '\'' +
			   ", age=" + age +
			   ", dob=" + dob +
			   '}';
	}
}
