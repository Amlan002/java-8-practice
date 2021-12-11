package com.java.tutorials.functionalInterface;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

import com.java.tutorials.supportClass.Employee;

public class SupplierExample {
	public static void main(String[] args) {
		
		Supplier<String> supplier=()->"Hi myself Amlan";
 		//List<String> list=Arrays.asList("x","y");
		List<String> list=Arrays.asList();
		//System.out.println(list.stream().findAny().orElseGet(supplier));
		System.out.println(list.stream().findAny().orElseGet(()->"Hi myself Amlan"));

		Supplier<Employee> supplier1 = () -> {
			return new Employee(1, 20, 85000, "Arpita");
		};

		Employee employee = supplier1.get();
		System.out.println("New Employee --> " + employee);

		Supplier<LocalDateTime> supplier2 = () -> LocalDateTime.now();
		System.out.println("=================local date time->" + supplier2.get());

		System.out.println("====================" + employeesSupplier().get());
	}

	private static Supplier<List<Employee>> employeesSupplier() {
		Supplier<List<Employee>> employeesSupplier = () -> {

			List<Employee> employees = new ArrayList<Employee>();

			employees.add(new Employee(10, 30, 63000, "Amlan"));
			employees.add(new Employee(20, 60, 73000, "Tapa"));
			employees.add(new Employee(30, 50, 53000, "Arpita"));
			employees.add(new Employee(50, 40, 33000, "Khusi"));
			employees.add(new Employee(40, 80, 43000, "Dev"));
			employees.add(new Employee(70, 70, 83000, "Mahapatra"));
			employees.add(new Employee(60, 90, 30000, "Tumi"));
			return employees;

		};
		return employeesSupplier;
	}
}
