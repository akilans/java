package com.example.java;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.sound.midi.Soundbank;

public class DateExample {
	
	public static void main(String[] args){
		
		
		// Old version of Java till 1.7
		
		Date d1 = new Date();
		System.out.println(d1);
		
		GregorianCalendar gc = new GregorianCalendar(1988,1,29);
		gc.add(GregorianCalendar.DATE, 1); // Add one day to the date
		Date d2 = gc.getTime(); // Date instance of GC
		System.out.println(d2);
		
		DateFormat dateFormat = DateFormat.getDateInstance();
		System.out.println(dateFormat.format(d2));
		
		
		// New version of Java 1.8
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		
		LocalDate ld = LocalDate.of(1988, 1, 29);
		System.out.println(ld);
		
		DateTimeFormatter dtF = DateTimeFormatter.ofPattern("d/M/yyyy");
		System.out.println(dtF.format(ld));
				
				
	}

}
