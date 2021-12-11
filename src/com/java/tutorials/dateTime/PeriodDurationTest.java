package com.java.tutorials.dateTime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodDurationTest {

	public static void main(String[] args) {
		
		LocalDate initialdate=LocalDate.now();
		
		LocalDate finaldate= initialdate.plus(Period.ofDays(5)); 
		
		int days= Period.between(initialdate, finaldate).getDays();
		System.out.println("No of days "+days);
		
		long betweem=ChronoUnit.DAYS.between(initialdate, finaldate);
		System.out.println("long value no of days "+betweem);
		
		
		LocalTime initialTime=LocalTime.of(6, 30, 0);
		LocalTime finalTime=initialTime.plus(Duration.ofSeconds(30));
		
		long sec=Duration.between(initialTime, finalTime).getSeconds();
		System.out.println("Defference in sec "+sec);
		
		sec=ChronoUnit.SECONDS.between(initialTime, finalTime);
		System.out.println("Defference in sec2 "+sec);
	}

}
