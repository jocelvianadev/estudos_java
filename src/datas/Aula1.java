package datas;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Aula1 {

	public static void main(String[] args) {
		
		LocalDate d1 = LocalDate.now();
		System.out.println("d1: " + d1);
		
		System.out.println("\nCom hora:");
		LocalDateTime d2 = LocalDateTime.now();
		System.out.println("d2: " + d2);
		
		System.out.println("\nCom Instant:");
		Instant d3 = Instant.now();
		System.out.println("Instant: " + d3);
		
		System.out.println("===========DateTimeFormatter============");
		LocalDate dtf1 = LocalDate.parse("2022-12-10");
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(dtf1.format(dtf2));
	}

}
