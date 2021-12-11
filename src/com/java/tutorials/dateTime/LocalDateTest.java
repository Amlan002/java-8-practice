package com.java.tutorials.dateTime;

import java.time.Clock;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class LocalDateTest {

	public static void main(String[] args) {

		LocalDate localDate = LocalDate.now();
		System.out.println("local date now  " + localDate);

		Clock clock = Clock.systemDefaultZone();
		localDate = LocalDate.now(clock);
		System.out.println("local date now using clock param " + localDate);

		ZoneId zoneId = ZoneId.of("Europe/Paris");
		localDate = LocalDate.now(zoneId);
		System.out.println("local date now using zone param " + localDate);

		localDate = LocalDate.of(2021, 12, 10);
		System.out.println("local date now using using specific date as param " + localDate);

		localDate = LocalDate.parse("2021-12-10");
		System.out.println("local date now using string param YYYY-MM-DD " + localDate);

		LocalDate localDate2 = localDate.plusDays(2);
		System.out.println("local date after adding 2 days  " + localDate2);

		LocalDate localDate3 = localDate.minusDays(3);
		System.out.println("local date after minus 2 days  " + localDate3);

		LocalDate localDate4 = localDate.minus(4, ChronoUnit.DAYS);
		System.out.println("local date after minus 2 days  " + localDate4);

		DayOfWeek dayOfWeek = LocalDate.parse("2021-12-11").getDayOfWeek();
		System.out.println("day of week " + dayOfWeek);

		int dayOfMonth = LocalDate.parse("2021-12-11").getDayOfMonth();
		System.out.println("day of month " + dayOfMonth);

		System.out.println("isLeapYear " + LocalDate.now().isLeapYear());

		System.out.println("isBefore " + LocalDate.parse("2021-12-11").isBefore(LocalDate.parse("2020-12-11")));
		System.out.println("isAfter " + LocalDate.parse("2021-12-11").isAfter(LocalDate.parse("2020-12-11")));

		System.out.println("StartOfDay " + LocalDate.parse("2021-12-11").atStartOfDay());

		System.out.println("firstDayOfMonth " + LocalDate.parse("2021-12-11").with(TemporalAdjusters.firstDayOfMonth()));

	}

}
