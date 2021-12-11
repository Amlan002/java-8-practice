package com.java.tutorials.dateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest {

	public static void main(String[] args) {

		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println("current date time1 " + dateTime);
		
		LocalDateTime dateTime2=LocalDateTime.of(LocalDate.now(), LocalTime.now());
		System.out.println("Current date time2 "+dateTime2);
		
		LocalDateTime dateTime3=LocalDateTime.parse("2021-12-11T10:20:45");
		System.out.println("date time using param "+dateTime3);
		
		System.out.println("Local date "+dateTime3.toLocalDate());
		System.out.println("Local time "+dateTime3.toLocalTime());
	
 		
		System.out.println("isbefore is after same type of syntax");

	}

}
