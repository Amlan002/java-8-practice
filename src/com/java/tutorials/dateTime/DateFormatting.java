package com.java.tutorials.dateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class DateFormatting {

	public static void main(String[] args) {
 
		LocalDateTime dateTime=LocalDateTime.of(2021, 12, 21, 10, 38, 55);
		System.out.println("Date "+dateTime);
		
		System.out.println("Only Date "+dateTime.format(DateTimeFormatter.ISO_DATE));
		
		System.out.println("format1 "+dateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		System.out.println("format2 "+dateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).withLocale(Locale.UK)));
	}

}
