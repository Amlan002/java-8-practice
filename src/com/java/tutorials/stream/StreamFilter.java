package com.java.tutorials.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.java.tutorials.supportClass.Employee;

public class StreamFilter {

	public static void main(String[] args) {

		System.out.println("============= using for extra list===========");
		List<Employee> list = getEmp().stream().filter((p) -> p.getSalary() > 50000).collect(Collectors.toList());
		list.forEach((x) -> System.out.println("Employee name is -> " + x.getName()));

		System.out.println("============= without using extra list===========");
		getEmp().stream().filter((p) -> p.getSalary() > 50000)
				.forEach((y) -> System.out.println("Employee name is " + y.getName()));

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
