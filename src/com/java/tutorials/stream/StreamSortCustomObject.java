package com.java.tutorials.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.java.tutorials.supportClass.Employee;

public class StreamSortCustomObject {

	public static void main(String[] args) {
		System.out.println("============ascending sort by salary=============");
		getEmp().stream().sorted((o1, o2) -> (int) (o1.getSalary() - o2.getSalary())).collect(Collectors.toList())
				.forEach((e) -> System.out.println("Emp sal-" + e.getSalary() + " || emp name-" + e.getName()));

		System.out.println("============descending sort by salary=============");
		getEmp().stream().sorted((o1, o2) -> (int) (o2.getSalary() - o1.getSalary())).collect(Collectors.toList())
				.forEach((e) -> System.out.println("Emp sal-" + e.getSalary() + " || emp name-" + e.getName()));

		System.out.println("============ascending sort by age=============");
		getEmp().stream().sorted(Comparator.comparingInt(Employee::getAge)).collect(Collectors.toList())
				.forEach((e) -> System.out.println("Emp age-" + e.getAge() + " || emp name-" + e.getName()));

		System.out.println("============ascending sort by age=============");
		getEmp().stream().sorted(Comparator.comparingInt(Employee::getAge).reversed()).collect(Collectors.toList())
				.forEach((e) -> System.out.println("Emp age-" + e.getAge() + " || emp name-" + e.getName()));
		
		System.out.println("============ascending sort by name=============");
		getEmp().stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList())
				.forEach((e) -> System.out.println("Emp age-" + e.getAge() + " || emp name-" + e.getName()));

		System.out.println("============ascending sort by name=============");
		getEmp().stream().sorted(Comparator.comparing(Employee::getName).reversed()).collect(Collectors.toList())
				.forEach((e) -> System.out.println("Emp age-" + e.getAge() + " || emp name-" + e.getName()));
		
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
