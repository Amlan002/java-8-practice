package com.java.tutorials.functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.java.tutorials.supportClass.Employee;

public class PredicateExample {

	public static void main(String[] args) {
		
		Predicate<Employee> predicate=(emp)-> emp.getAge()>40;
		boolean result=predicate.test(new Employee(10, 41, 700000, "Amlan"));
		System.out.println("Result is "+result);
		
		
		Predicate<Integer> predicate2=(x)->{
			if(x%2==0) {
				System.out.println("even");
				return true;
			}else {
				System.out.println("Odd");
				return false;
			}
			
		};
		
		Predicate<Integer> p4=(t)->t%2==0;
		
		
		
		List<Integer> integers=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		integers.stream().filter(p4).forEach(n->System.out.println("even no list "+n));
		
		Predicate<Integer> predicate3=(x)-> x > 5;
		Predicate<Integer> predicate4=(x)-> x < 8;
		integers.stream().filter(predicate3).collect(Collectors.toList()).forEach(System.out::println);
		System.out.println("==========================");
		integers.stream().filter(predicate3.and(predicate4)).collect(Collectors.toList()).forEach(System.out::println);
		System.out.println("==========================");
		
		
		Predicate<String> predicate5=(x)-> x.length()==3;
		Predicate<String> predicate6=(x)-> x.endsWith("A");
		List<String> list=Arrays.asList("A","AA","BCA","AAC","B","BBA");
		
		list.stream().filter(predicate5.or(predicate6)).collect(Collectors.toList()).forEach(System.out::println);
		System.out.println("==========================");
		list.stream().filter(predicate5.and(predicate6)).collect(Collectors.toList()).forEach(System.out::println);
		
	}

}
