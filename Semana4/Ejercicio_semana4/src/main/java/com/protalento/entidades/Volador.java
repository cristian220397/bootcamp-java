package com.protalento.entidades;

import com.protalento.interfaces.Operador;

public abstract class Volador implements Operador{
	private String nombre;
	private String horaAterrizaje;
	private int horasVolando;
	
	
	public Volador() {
		super();
	}
	public Volador(String nombre, String horaAterrizaje, int horasVolando) {
		super();
		this.nombre = nombre;
		this.horaAterrizaje = horaAterrizaje;
		this.horasVolando = horasVolando;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the horaAterrizaje
	 */
	public String getHoraAterrizaje() {
		return horaAterrizaje;
	}
	/**
	 * @param horaAterrizaje the horaAterrizaje to set
	 */
	public void setHoraAterrizaje(String horaAterrizaje) {
		this.horaAterrizaje = horaAterrizaje;
	}
	/**
	 * @return the horasVolando
	 */
	public int getHorasVolando() {
		return horasVolando;
	}
	/**
	 * @param horasVolando the horasVolando to set
	 */
	public void setHorasVolando(int horasVolando) {
		this.horasVolando = horasVolando;
	}
	@Override
	public String toString() {
		return "Volador [" + nombre + "," + horaAterrizaje + "," + horasVolando
				+ "]";
	}
	
	
	
	

}
