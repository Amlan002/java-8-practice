package com.java.tutorials.foreach;

import java.util.ArrayList;
import java.util.List;

import com.java.tutorials.supportClass.Employee;

public class ListForEach {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();

		employees.add(new Employee(10, 30, 63000, "Amlan"));
		employees.add(new Employee(20, 60, 73000, "Tapa"));
		employees.add(new Employee(30, 50, 53000, "Arpita"));
		employees.add(new Employee(50, 40, 33000, "Khusi"));
		employees.add(new Employee(40, 80, 43000, "Dev"));
		employees.add(new Employee(70, 70, 83000, "Mahapatra"));
		employees.add(new Employee(60, 90, 30000, "Tumi"));

		// normal for each
		employees.forEach((x) -> System.out.println("Name " + x.getName() + " || Age " + x.getAge()));
		
		
		System.out.println("=====================================================");
		
		
		// with stream
		employees.stream().forEach((x) -> System.out.println("Name " + x.getName() + " || Age " + x.getAge()));

	}

}
