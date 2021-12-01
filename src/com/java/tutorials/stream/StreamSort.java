package com.java.tutorials.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSort {

	public static void main(String[] args) {

		List<Integer> integers=new ArrayList<Integer>();
		integers.add(20);
		integers.add(10);
		integers.add(5);
		integers.add(40);
		integers.add(35);
		
		System.out.println("============ascending sort============="); 
		integers.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList()).forEach((x)->System.out.println(x));
		System.out.println("============ascending sort using lambda============="); 
		integers.stream().sorted((o1,o2)->o1.compare(o1, o2)).collect(Collectors.toList()).forEach((x)->System.out.println(x));

		System.out.println("============descending order============="); 
		integers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).forEach((x)->System.out.println(x));
		System.out.println("============descending sort using lambda============="); 
		integers.stream().sorted((o1,o2)->o1.compare(o2, o1)).collect(Collectors.toList()).forEach((x)->System.out.println(x));
		
	}

	

}
