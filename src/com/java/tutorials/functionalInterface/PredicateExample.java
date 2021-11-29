package com.java.tutorials.functionalInterface;

import java.util.function.Predicate;

import com.java.tutorials.supporClass.Employee;

public class PredicateExample {

	public static void main(String[] args) {
		
		Predicate<Employee> predicate=(emp)-> emp.getAge()>40;
		boolean result=predicate.test(new Employee(10, 29, 700000, "Amlan"));
		System.out.println("Result is "+result);

	}

}
