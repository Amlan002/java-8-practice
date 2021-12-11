package com.java.tutorials.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.java.tutorials.supportClass.Employee;

public class EvaluateTax {

	public static void main(String[] args) {
		System.out.println(evltTax("non tax"));
	}

	private static List<Employee> evltTax(String string) {

		return (string.equalsIgnoreCase("tax"))
				? getEmp().stream().filter(e -> e.getSalary() > 50000).collect(Collectors.toList())
				: getEmp().stream().filter(e -> e.getSalary() <= 50000).collect(Collectors.toList());

	}

	private static List<Employee> getEmp() {
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(10, 30, 63000, "Amlan"));
		employees.add(new Employee(20, 60, 73000, "Tapa"));
		employees.add(new Employee(30, 50, 53000, "Arpita"));
		employees.add(new Employee(50, 40, 33000, "Khusi"));
		employees.add(new Employee(40, 80, 43000, "Dev"));
		employees.add(new Employee(70, 70, 83000, "Mahapatra"));
		employees.add(new Employee(60, 90, 30000, "Tumi"));
		return employees;
	}
}
