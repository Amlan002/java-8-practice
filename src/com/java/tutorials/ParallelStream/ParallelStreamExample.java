package com.java.tutorials.ParallelStream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.java.tutorials.supportClass.Employee;

public class ParallelStreamExample {
	public static void main(String[] args) {

		long start = 0;
		long end = 0;

		// sequential stream/ plain
		start = System.currentTimeMillis();
		IntStream.range(1, 100).forEach(System.out::println);
		end = System.currentTimeMillis();
		System.out.println("Plain stream took time : " + (end - start));

		System.out.println("============================================");

		// parallel stream
		start = System.currentTimeMillis();
		IntStream.range(1, 100).parallel().forEach(System.out::println);
		end = System.currentTimeMillis();
		System.out.println("Parallel stream took time : " + (end - start));

		System.out.println("============================================");
		System.out.println("--------------------------------------------");
		System.out.println("============================================");

		IntStream.range(1, 10).forEach(x -> {
			System.out.println("Thread for normal stream : " + Thread.currentThread().getName() + " : " + x);
		});
		System.out.println("============================================");
		IntStream.range(1, 10).parallel().forEach(x -> {
			System.out.println("Thread for parallel stream : " + Thread.currentThread().getName() + " : " + x);
		});

		System.out.println("============================================");
		System.out.println("--------------------------------------------");
		System.out.println("============================================");
		
		start=System.currentTimeMillis();
        double salaryWithStream = getEmployees().stream()
                .map(Employee::getSalary).mapToDouble(i -> i).average().getAsDouble();
        end=System.currentTimeMillis();

        System.out.println("Normal stream execution time : "+(end-start)+" : Avg salary : "+salaryWithStream);
        System.out.println("============================================");
        start=System.currentTimeMillis();
        double salaryWithParallelStream = getEmployees().parallelStream()
                .map(Employee::getSalary).mapToDouble(i -> i).average().getAsDouble();

        end=System.currentTimeMillis();

        System.out.println("Parallel stream execution time : "+(end-start)+" : Avg salary : "+salaryWithParallelStream);

	}

	// sample data
	public static List<Employee> getEmployees() {
		return Stream
				.of(new Employee(1, 30, 85000, "Amlan"), new Employee(2, 20, 95000, "Arpita"),
						new Employee(3, 35, 90000, "Khusi"), new Employee(4, 32, 86000, "Tapa"),
						new Employee(5, 23, 98000, "Mita"), new Employee(6, 39, 91000, "Asur"))
				.collect(Collectors.toList());
	}
}
