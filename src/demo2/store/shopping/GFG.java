package demo2.store.shopping;

//Java program to demonstrate
//LocalDateTime.now() method

import java.time.*;

public class GFG {
	public static void main(String[] args)
	{

		// create an LocalDateTime object
		LocalDateTime lt
			= LocalDateTime.now();
		LocalTime thisTime = LocalTime.now();
		LocalDateTime current = LocalDateTime.now();
		LocalDateTime different = current.withMinute(14).withDayOfMonth(3).plusHours(12);
		int year = current.getYear();
		boolean before = current.isBefore(different);

		// print result
		System.out.println("LocalDateTime : " + lt);
		System.out.println("current : " + current);
		System.out.println("different : " + different);
		System.out.println("before : " + before);
		System.out.println("year : " + year);
		
		
	}
}

