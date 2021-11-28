package com.java.tutorials.lambda;

import java.util.ArrayList;
import java.util.List;

public class LabdaExample_ForEach {

	public static void main(String[] args) {
		List<String> prog = new ArrayList<>();
		prog.add("C");
		prog.add("C++");
		prog.add("Java");
		List<String> prog_upper = new ArrayList<>();
		prog.forEach(xyz -> {
			
			System.out.println(xyz);
			prog_upper.add(xyz.toUpperCase());
			});
		
		prog_upper.forEach(abc ->System.out.println(abc));
	}

}
