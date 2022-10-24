package demo2.store.shopping;

	// Java program to demonstrate
	// ZoneId.from() method

	import java.time.*;
	import java.time.ZonedDateTime;

	public class ZoneID{
		public static void main(String[] args)
		{

			// create TemporalAccessor object
			ZonedDateTime zoneddatetime
				= ZonedDateTime.parse("2018-10-25T23:12:31.123+02:00[Europe/Paris]");
			ZoneId london = ZoneId.of("Europe/London");
			ZoneId LA	= ZoneId.of("America/Los_Angeles");
			LocalDateTime sometime = LocalDateTime.of(2022, Month.OCTOBER,1,07,14);
			ZonedDateTime londonTime = ZonedDateTime.of(sometime,london);
			ZonedDateTime laTime = londonTime.withZoneSameInstant(LA);

			// get ZoneId from this TemporalAccessor
			ZoneId response = ZoneId.from(zoneddatetime);

			// print result
			System.out.println("Zone Id got from "
							+ "TemporalAccessor object \n"
							+ zoneddatetime + "\nis " + response);
			System.out.println("Time in LA : " + laTime);
		
		}
	}


