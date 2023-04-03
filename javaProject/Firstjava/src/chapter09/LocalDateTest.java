package chapter09;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateTest {

	public static void main(String[] args) {
		
		LocalDate now = LocalDate.now();
		System.out.println(now); // 2023-04-03
		System.out.println(now.getYear()); // 2023
		System.out.println(now.getMonthValue()); // 4
		System.out.println(now.getDayOfMonth()); // 3
		
		LocalDate nextDay1 = now.plusDays(1);
		System.out.println(nextDay1); // 2023-04-04
		LocalDate nextDay2 = now.plusMonths(1);
		System.out.println(nextDay2); // 2023-05-03
		LocalDate nextDay3 = now.plusYears(1);
		System.out.println(nextDay3); // 2024-04-03
		
		
		LocalDateTime now2 = LocalDateTime.now();
		System.out.println(now2); // 2023-04-03T18:00:49.170219900
		System.out.println(now2.getHour()); // 17
		System.out.println(now2.getMinute()); // 9
		System.out.println(now2.getSecond()); // 40
		
		LocalDate day2 = LocalDate.of(2023, 12, 25);
		System.out.println(day2); // 2023-12-25
		
		LocalDateTime day3 = LocalDateTime.of(2023, 06, 03, 17, 50, 30);
		System.out.println(day3); // 2023-06-03T17:50:30
		
		LocalDate day4 = LocalDate.parse("2024-12-25");
		System.out.println(day4); // 2024-12-25
		
	}

}
