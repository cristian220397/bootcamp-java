package com.protalento.jdbc.utilidades;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public final  class Fechas {
	public static final String PATRON_FECHA="yyy-MM-dd";
	public static final String PATRON_FECHA_HORA="yyy-MM-dd HH:ss";
	
	private Fechas() {
		
			
		}
	public static LocalDate getLocalDate(String fecha) {
		return LocalDate.parse(fecha, DateTimeFormatter.ofPattern(PATRON_FECHA));
		
		
	}
	public static LocalDateTime getLocalDatetime(String fecha) {
		return LocalDateTime.parse(fecha, DateTimeFormatter.ofPattern(PATRON_FECHA_HORA));
		}
	
	public static String getString(LocalDate fecha) {
		return fecha.format(DateTimeFormatter.ofPattern(PATRON_FECHA));
		}
	public static String getString(LocalDateTime fecha) {
		return fecha.format(DateTimeFormatter.ofPattern(PATRON_FECHA_HORA));
		}
		

	

}
