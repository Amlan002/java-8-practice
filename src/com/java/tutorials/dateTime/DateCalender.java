package com.java.tutorials.dateTime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class DateCalender {

	public static void main(String[] args) {
 
		Date date=new Date();
		
		LocalDateTime dateTime=LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
		
		System.out.println("=============convert "+dateTime);
		
		Calendar calendar=Calendar.getInstance();
		LocalDateTime dateTime2=LocalDateTime.ofInstant(calendar.toInstant(), ZoneId.systemDefault());
		
		System.out.println("=============convert "+dateTime2);
	}

}
