package com.java.tutorials.functionalInterface;

import java.util.function.BiPredicate;

public class BiPredicateExample {

	public static void main(String[] args) {

		BiPredicate<String, String> biPredicate=(s,a)-> {
			return s.equals(a);
		};
		
		System.out.println("============"+biPredicate.test("Amlan", "Amlan"));
		System.out.println("============"+biPredicate.test("Arpita", "Amlan"));
			
		
		BiPredicate<Integer, Integer> biPredicate2=(a,b)-> a>b;
		BiPredicate<Integer, Integer> biPredicate3=(a,b)-> a==b;
		
		boolean result= biPredicate2.and(biPredicate3).test(20, 10);
		System.out.println("---------"+result);
		
		boolean result1= biPredicate2.or(biPredicate3).test(20, 10);
		System.out.println("---------"+result1);
	}

}
