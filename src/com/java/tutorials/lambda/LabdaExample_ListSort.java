package com.java.tutorials.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LabdaExample_ListSort {

	public static void main(String[] args) {
		List<Integer> integers=new ArrayList<Integer>();
		integers.add(20);
		integers.add(10);
		integers.add(5);
		integers.add(40);
		integers.add(35);
		
		Collections.sort(integers);;
		System.out.println("ascesnding order====> " + integers);		

		Collections.reverse(integers);;
		System.out.println("desending order====> "+integers);

	}

}
