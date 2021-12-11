package com.java.tutorials.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.java.tutorials.supportClass.Lovable;

public class MapReduce {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(3, 7, 8, 1, 5, 9);

		List<String> words = Arrays.asList("corejava", "spring", "hibernate");

		int sum = 0;
		for (int no : numbers) {
			sum = sum + no;
		}
		System.out.println("Normal " + sum);

		System.out.println("using map " + numbers.stream().mapToInt(i -> i).sum());
		System.out.println("using reduce " + numbers.stream().reduce(0, (a, b) -> a + b));
		System.out.println("using method reference " + numbers.stream().reduce(Integer::sum).get());

		Integer maxvalue = numbers.stream().reduce(0, (a, b) -> a > b ? a : b);
		System.out.println("Max value using reduce " + maxvalue);

		Integer maxvalueWithMethodReference = numbers.stream().reduce(Integer::max).get();
		System.out.println("Max value using method reference " + maxvalueWithMethodReference);

		String longestString = words.stream().reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2)
				.get();
		System.out.println("Longest word " + longestString);
		
		
		double avgSalary = getEmployees().stream()
                .filter(employee -> employee.getGrade().equalsIgnoreCase("A"))
                .map(employee -> employee.getSalary())
                .mapToDouble(i -> i)
                .average().getAsDouble();

        System.out.println("avg salary whose grade is A "+avgSalary);

        double sumSalary = getEmployees().stream()
                .filter(employee -> employee.getGrade().equalsIgnoreCase("A"))
                .map(employee -> employee.getSalary())
                .mapToDouble(i -> i)
                .sum();
        System.out.println("sum of salary whose grade is A "+sumSalary);

	}

	public static List<Lovable> getEmployees() {
		return Stream.of(new Lovable(101, "Arpita", "A", 60000), new Lovable(109, "Pampa", "B", 30000),
				new Lovable(102, "Sova", "A", 80000), new Lovable(103, "Khusi", "A", 90000),
				new Lovable(104, "Puja", "C", 15000)).collect(Collectors.toList());
	}
}
