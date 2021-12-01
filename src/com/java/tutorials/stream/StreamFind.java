package com.java.tutorials.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamFind {

	public static void main(String[] args) {

		List<Integer> integers=new ArrayList<Integer>();
		integers.add(20);
		integers.add(10);
		integers.add(5);
		integers.add(40);
		integers.add(35);
		
		System.out.println("count is "+integers.stream().count());
		System.out.println("min is "+integers.stream().min(Comparator.comparing(Integer::valueOf)).get());
		System.out.println("count is "+integers.stream().max(Comparator.comparing(Integer::valueOf)).get());
	}

	

}
