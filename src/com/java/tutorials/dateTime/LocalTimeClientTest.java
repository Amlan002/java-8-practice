package com.java.tutorials.dateTime;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalTimeClientTest {

	public static void main(String[] args) {

		LocalTime currentTime=LocalTime.now();
		System.out.println("Current time "+currentTime);
		LocalTime localTime=LocalTime.parse("09:45");
		System.out.println("Time using param1 "+localTime);
		LocalTime localTime2=LocalTime.of(9, 56);
		System.out.println("time using param2 "+localTime2);
		
		System.out.println("Adding hours "+localTime2.plus(1,ChronoUnit.HOURS));
	
		System.out.println("isbefore is after same type of syntax");
		
	}

}
