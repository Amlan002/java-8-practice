package com.java.tutorials.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamCountMinMax {

	public static void main(String[] args) {

		List<Integer> integers=new ArrayList<Integer>();
		integers.add(20);
		integers.add(10);
		integers.add(5);
		integers.add(40);
		integers.add(35);
		
		Optional<Integer> optional= integers.stream().findFirst();
		if(optional.isPresent()) {
			System.out.println(optional.get());
		}else {
			System.out.println("List is empty");
		}
		
		Optional<Integer> optional2= integers.stream().findAny();
		if(optional2.isPresent()) {
			System.out.println(optional2.get());
		}else {
			System.out.println("List is empty");
		}
	}

	

}
