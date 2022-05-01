package interview;

import java.time.LocalDate;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Java_date {
	
	//To display the current date,we have to import

		public static void main(String[] args) {
			// To print the current Date 
			LocalDate aajkadate=LocalDate.now();      // create a Date object.
			System.out.println(aajkadate);
			System.out.println();
			
			// To print the current Time
			LocalTime aajkatime=LocalTime.now();      // create a Time object
			System.out.println(aajkatime);
			System.out.println();
			
			// To print the current Date and Time.
			LocalDateTime dono=LocalDateTime.now();
			System.out.println(dono);
			
			System.out.println();
			
			// To change the Date Format.
			// first make the Date Format by using DateTimeFormatter object
			DateTimeFormatter ok=DateTimeFormatter.ofPattern("dd-mm-yyyy hh-mm-ss");
			
			//connect the Format and LocalDateTime by String.
			String okay=dono.format(ok);
			
			System.out.println(okay);
			
		}
}
