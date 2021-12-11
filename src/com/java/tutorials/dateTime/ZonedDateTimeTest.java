package com.java.tutorials.dateTime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeTest {

	public static void main(String[] args) {

		ZoneId id= ZoneId.of("America/Cuiaba");
		System.out.println("Zone Id "+id);
		
		System.out.println("All zone id"+ZoneId.getAvailableZoneIds());
		
		System.out.println("Converting zone "+ZonedDateTime.of(LocalDateTime.now(), id));
		
		
 	}

}
