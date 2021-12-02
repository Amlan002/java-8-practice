package com.java.tutorials.functionalInterface;

import java.util.function.Supplier;

import com.java.tutorials.supportClass.Employee;

public class SupplierExample {
	public static void main(String[] args) {
		
		Supplier<Employee> supplier=()->{
			return new Employee(1, 20, 85000, "Arpita");
		};
		
		Employee employee=supplier.get();
		System.out.println("New Employee --> "+employee);
	}
}
