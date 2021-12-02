package com.java.tutorials.functionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import com.java.tutorials.supportClass.Employee;

public class ConsumerExample {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();

		employees.add(new Employee(10, 30, 63000, "Amlan"));
		employees.add(new Employee(20, 60, 73000, "Tapa"));
		employees.add(new Employee(30, 50, 53000, "Arpita"));
		employees.add(new Employee(50, 40, 33000, "Khusi"));
		employees.add(new Employee(40, 80, 43000, "Dev"));
		employees.add(new Employee(70, 70, 83000, "Mahapatra"));
		employees.add(new Employee(60, 90, 30000, "Tumi"));
		
		employees.forEach((p)->{
			System.out.println(p.getName());
		});

		Consumer<Employee> consumer=(p)->{
			System.out.println("consuming new employee--- "+p.getSalary());
		};
		
		consumer.accept(new Employee(10, 30, 65000, "Hanuman"));
	}

}
