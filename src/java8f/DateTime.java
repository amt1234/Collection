package java8f;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZonedDateTime;

public class DateTime {

	public static void main(String[] args) {
		LocalDate d = LocalDate.of(2018, 10, 9);
		System.out.println(d);

		LocalTime t = LocalTime.now();
		System.out.println(t);

		LocalTime t1 = LocalTime.of(1, 45, 30);
		System.out.println(t1);
		
		ZonedDateTime z=ZonedDateTime.now();
		System.out.println(z+" ");

	}

}
