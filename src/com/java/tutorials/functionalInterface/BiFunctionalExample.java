package com.java.tutorials.functionalInterface;

import java.util.function.BiFunction;

public class BiFunctionalExample {

	public static void main(String[] args) {

		BiFunction<Integer, Integer, Integer> biFunction=(a,b)-> a+b;
		System.out.println("Addition ===>"+biFunction.apply(10, 20));
		
	}

}
