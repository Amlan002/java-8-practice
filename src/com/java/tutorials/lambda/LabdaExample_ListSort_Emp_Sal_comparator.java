package com.java.tutorials.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.java.tutorials.supportClass.Employee;

public class LabdaExample_ListSort_Emp_Sal_comparator {

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<Employee>();

		employees.add(new Employee(10, 30, 63000, "Amlan"));
		employees.add(new Employee(20, 60, 73000, "Tapa"));
		employees.add(new Employee(30, 50, 53000, "Arpita"));
		employees.add(new Employee(50, 40, 33000, "Khusi"));
		employees.add(new Employee(40, 80, 43000, "Dev"));
		employees.add(new Employee(70, 70, 83000, "Mahapatra"));
		employees.add(new Employee(60, 90, 30000, "Tumi"));

		System.out.println("===============ascending=======");
		Collections.sort(employees, new MySortA());
		System.out.println(employees);
		System.out.println("===============descending=======");
		Collections.sort(employees, new MySortD());
		System.out.println(employees);

		System.out.println("==========================XXXXXXXXX-- Using Anonymous Class --XXXXXXXXX==========================");
		System.out.println("===============ascending=======");

		Collections.sort(employees, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// ascending
				return (int) (o1.getSalary() - o2.getSalary());

			}
		});
		System.out.println(employees);

		System.out.println("===============descending=======");

		Collections.sort(employees, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// descending
				return (int) (o2.getSalary() - o1.getSalary());

			}
		});
		System.out.println(employees);
		
		System.out.println("==========================XXXXXXXXX-- Using Lambda --XXXXXXXXX==========================");
		System.out.println("===============ascending=======");
		Collections.sort(employees, (o1,o2) ->(int) (o1.getSalary() - o2.getSalary()));
		System.out.println(employees);
		System.out.println("==========================XXXXXXXXX-- Using stream1 --XXXXXXXXX==========================");
		employees.stream().sorted((o1,o2) ->(int) (o1.getSalary() - o2.getSalary())).forEach(System.out::println);
		System.out.println("==========================XXXXXXXXX-- Using stream2 --XXXXXXXXX==========================");
		employees.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(System.out::println);
		
		System.out.println("===============descending=======");
		Collections.sort(employees, (o1,o2) ->(int) (o2.getSalary() - o1.getSalary()));
		System.out.println(employees);
		System.out.println("==========================XXXXXXXXX-- Using stream1 --XXXXXXXXX==========================");
		employees.stream().sorted((o1,o2) ->(int) (o2.getSalary() - o1.getSalary())).forEach(System.out::println);
		System.out.println("==========================XXXXXXXXX-- Using stream2 --XXXXXXXXX==========================");
		employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).forEach(System.out::println);
	}

}

class MySortA implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// ascending
		return (int) (o1.getSalary() - o2.getSalary());

	}
}

class MySortD implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// descending
		return (int) (o2.getSalary() - o1.getSalary());
	}

}
