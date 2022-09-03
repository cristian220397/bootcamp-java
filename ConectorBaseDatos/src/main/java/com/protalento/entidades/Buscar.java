package com.protalento.entidades;

import java.time.LocalDateTime;

public class Buscar {
	private String Texto;
	private String URL;
	private LocalDateTime Fecha;
	private String contenidohtml;
	
	
	
	
	public Buscar() {
		super();
	}
	public Buscar(String texto, String uRL, LocalDateTime fecha, String contenidohtml) {
		super();
		Texto = texto;
		URL = uRL;
		Fecha = fecha;
		this.contenidohtml = contenidohtml;
	}
	/**
	 * @return the texto
	 */
	public String getTexto() {
		return Texto;
	}
	/**
	 * @param texto the texto to set
	 */
	public void setTexto(String texto) {
		Texto = texto;
	}
	/**
	 * @return the uRL
	 */
	public String getURL() {
		return URL;
	}
	/**
	 * @param uRL the uRL to set
	 */
	public void setURL(String uRL) {
		URL = uRL;
	}
	/**
	 * @return the fecha
	 */
	public LocalDateTime getFecha() {
		return Fecha;
	}
	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(LocalDateTime fecha) {
		Fecha = fecha;
	}
	/**
	 * @return the contenidohtml
	 */
	public String getContenidohtml() {
		return contenidohtml;
	}
	/**
	 * @param contenidohtml the contenidohtml to set
	 */
	public void setContenidohtml(String contenidohtml) {
		this.contenidohtml = contenidohtml;
	}
	@Override
	public String toString() {
		return "Buscar [Texto=" + Texto + ", URL=" + URL + ", Fecha=" + Fecha + ", contenidohtml=" + contenidohtml
				+ "]";
	} 
	
	
}
	
	
	
	
	
	
	
