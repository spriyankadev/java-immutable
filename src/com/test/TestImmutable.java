package com.test;

public class TestImmutable {

	public static void main(String[] args) {
		Address address = new Address("Chennai", "Tamil Nadu");
		Employee employee = new Employee("Mike", 15, address);

		System.out.println("Original Employee Object : \n " + employee);

		address.setCity("Mumbai");
		address.setState("Maharashtra");

		System.out.println("Employee Object after local variable address change : \n " + employee);

		Address empAddress = employee.getAddress();
		empAddress.setCity("Jaipur");
		empAddress.setState("Rajasthan");

		System.out.println("Employee Object after employee address change : \n " + employee);

	}
}
