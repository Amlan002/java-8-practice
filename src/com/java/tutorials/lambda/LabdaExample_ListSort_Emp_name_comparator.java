package com.java.tutorials.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.java.tutorials.supportClass.Employee;

public class LabdaExample_ListSort_Emp_name_comparator {

	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<Employee>();

		employees.add(new Employee(10, 30, 63000, "Amlan"));
		employees.add(new Employee(20, 60, 73000, "Tapa"));
		employees.add(new Employee(30, 50, 53000, "Arpita"));
		employees.add(new Employee(50, 40, 33000, "Khusi"));
		employees.add(new Employee(40, 80, 43000, "Dev"));
		employees.add(new Employee(70, 70, 83000, "Mahapatra"));
		employees.add(new Employee(60, 90, 30000, "Tumi"));

		System.out.println("==========================XXXXXXXXX-- Using Lambda --XXXXXXXXX==========================");
		System.out.println("===============ascending=======");
		Collections.sort(employees, (o1,o2) -> (o1.getName().compareTo(o2.getName())));
		System.out.println(employees);

		System.out.println("===============descending=======");
		Collections.sort(employees, (o1,o2) -> (o2.getName().compareTo(o1.getName())));
		System.out.println(employees);

	}

}


