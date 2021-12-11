package com.java.tutorials.Exception_Handling;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("44", "373", "h");
		List<Integer> list1 = Arrays.asList(1, 0);

		// string to int

		// list.stream().map(s->Integer.parseInt(s)).collect(Collectors.toList()).forEach(System.out::println);

		System.out.println("===================way 1===================");
		list.forEach(ExceptionHandlingExample::printList);

		System.out.println("===================way 2===================");
		list.forEach(handleExceptionIfAny(s -> System.out.println(Integer.parseInt(s))));

		System.out.println("===================way 3===================");
		list1.forEach(handleGenericException(s-> System.out.println(10/s),ArithmeticException.class));
		System.out.println("--------------------");
		list.forEach(handleGenericException(s -> System.out.println(Integer.parseInt(s)),NumberFormatException.class));
	}

	public static void printList(String s) {
		try {
			System.out.println(Integer.parseInt(s));
		} catch (Exception ex) {
			System.out.println("exception : " + ex.getMessage());
		}
	}

	static Consumer<String> handleExceptionIfAny(Consumer<String> payload) {
		return obj -> {
			try {
				payload.accept(obj);
			} catch (Exception ex) {
				System.out.println("exception : " + ex.getMessage());
			}
		};
	}

	static <Target, ExObj extends Exception> Consumer<Target> handleGenericException(Consumer<Target> targetConsumer,
			Class<ExObj> exObjClass) {
		return obj -> {
			try {
				targetConsumer.accept(obj);
			} catch (Exception ex) {
				try {
					ExObj exObj = exObjClass.cast(ex);
					System.out.println("exception : " + exObj.getMessage());
				} catch (ClassCastException ecx) {
					throw ex;
				}
			}
		};
	}
}
