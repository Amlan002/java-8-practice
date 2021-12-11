package com.java.tutorials.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.java.tutorials.supportClass.Student;

public class FlateMap {

	public static void main(String[] args) {
		System.out.println("=========================================MAP=========================================");
		List<String> words = Arrays.asList("Java Dev Journal", "Java", "Spring Boot", "Java 8");
		List<Integer> wordCount = words.stream().map(String::length).collect(Collectors.toList());
		wordCount.forEach(System.out::println);
		System.out
				.println("=========================================FLATE MAP=========================================");
		List<String> words2 = Arrays.asList("hibernate", "Amlan");
		List<String> unique = words2.stream().map(s -> s.split("")).flatMap(Arrays::stream).distinct()
				.collect(Collectors.toList());
		unique.forEach(System.out::println);

		System.out.println(
				"=========================================NEW FLATE MAP=========================================");

		List<Student> users = Arrays.asList(new Student("Peter", 20, Arrays.asList("1", "2")),
				new Student("Sam", 40, Arrays.asList("3", "4", "10")), new Student("Ryan", 60, Arrays.asList("6")),
				new Student("Adam", 70, Arrays.asList("7", "8")));

		System.out.println("Functional Style: ");

		Optional<String> stringOptional = users.stream().map(user -> user.getPhoneNumbers().stream())
				.flatMap(stringStream -> stringStream.filter(phoneNo -> phoneNo.equals("10"))).findAny();

		stringOptional.ifPresent(System.out::println);

	}

	private static boolean isNotSam(String name) {
		return !name.equals("Sam");
	}
}
