package com.java.tutorials.foreach;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.java.tutorials.supportClass.Employee;

public class MapForEach {

	public static void main(String[] args) {
		
		//normal
		for(Entry<Integer, Employee> entry:getEmp().entrySet()) {
			System.out.println("Key- "+ entry.getKey()+" || Name- "+entry.getValue().getName());
		}
		
		System.out.println("==================================");
		
		//for each with lambda
		getEmp().forEach((k,v)->{
			System.out.println("Key- "+k);
			System.out.println("Name- "+v.getName());
		});

	}

	private static Map<Integer, Employee> getEmp() {
		Map<Integer, Employee> map=new HashMap<>();
		map.put(1, new Employee(10, 30, 63000, "Amlan"));
		map.put(2, new Employee(20, 60, 73000, "Tapa"));
		map.put(3, new Employee(30, 50, 53000, "Arpita"));
		map.put(4, new Employee(40, 80, 43000, "Dev"));
		map.put(5, new Employee(50, 40, 33000, "Khusi"));
		return map;
	}
}
