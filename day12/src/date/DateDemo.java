package date;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.MonthDay;
import java.time.OffsetDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {

		LocalDate date=LocalDate.now();
		System.out.println("today's date is :"+date);	

		int day=date.getDayOfMonth();
		int month=date.getMonthValue();
		int year=date.getYear();
		System.out.println(day+" "+month+" "+ year);

		LocalDate birthday=LocalDate.of(1995, 6, 28);
		
		System.out.println(birthday);
		
		LocalTime current=LocalTime.now();
		System.out.println(current);
		
		LocalTime time=current.plusHours(2);
		System.out.println(time);
		MonthDay birth=MonthDay.of(birthday.getMonthValue(), birthday.getDayOfMonth());
		MonthDay current2=MonthDay.from(date);
		System.out.println(current2);
		LocalDate next=date.plus(1,ChronoUnit.WEEKS);
		System.out.println(next);
		LocalDate nextyear=date.plus(1,ChronoUnit.YEARS);
		System.out.println(nextyear);
		
		Clock clock=Clock.systemUTC();
		System.out.println(clock);
		
		Clock clock2=Clock.systemDefaultZone();
		System.out.println(clock2);
		
		if(birthday.isBefore(date))
		{
			System.out.println("before");
		}
		if(birthday.isAfter(date))
		{
			System.out.println("after");
		}
		
		ZoneId zoneId=ZoneId.of("Asia/Calcutta");
		
		LocalDateTime localDateTime=LocalDateTime.now();
		ZonedDateTime zonedDateTime=ZonedDateTime.of(localDateTime, zoneId);
		System.out.println(zonedDateTime);
		
		LocalDate fixed=LocalDate.of(2017, Month.JUNE, 30);
		LocalDate today=LocalDate.now();
		
		Period months=Period.between(fixed, today);
		System.out.println(months.getMonths());

		
	LocalDateTime localDateTime2=LocalDateTime.of(2019, Month.AUGUST, 20, 8,20);
		
		ZoneOffset zoneOffset=ZoneOffset.of("+05:30");
		OffsetDateTime offsetDateTime=OffsetDateTime.of(localDateTime2, zoneOffset);
		System.out.println(offsetDateTime);
		

		Instant instant=Instant.now();
		System.out.println(instant);
		
		String date2="19950628";
		LocalDate l2=LocalDate.parse(date2, DateTimeFormatter.BASIC_ISO_DATE);
		System.out.println(l2);
		
		try {
			String birth2="Jan 10 1985";
			
			DateTimeFormatter form=DateTimeFormatter.ofPattern("MMM dd yyyy");
			LocalDate birth3=LocalDate.parse(birth2, form);
			System.out.println(birth3);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		try {
			DateTimeFormatter d=DateTimeFormatter.ofPattern("dd MMM YYYY");
			String sdate=date.format(d);
			System.out.println(sdate);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

		
		
		//
//		switch (day) {
//
//		case 0:
//			System.out.println("sunday");
//			break;
//		case 1:
//			System.out.println("monday");
//			break;
//		case 2:
//			System.out.println("tuesday");
//			break;
//		case 3:
//			System.out.println("wednesday");
//			break;
//		case 4:
//			System.out.println("thursday");
//			break;
//		case 5:
//			System.out.println("friday");
//			break;
//		case 6:
//			System.out.println("satday");
//			break;
//
//		}
//
	}

}
