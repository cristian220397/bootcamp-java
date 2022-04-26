package com.protalento.entidades;

public class Helicoptero extends Volador {
	private String color;
	private String marca;
	private String modelo;
	private String tipo;
	
	
	
	public Helicoptero() {
		super();
	}
	
	
	public Helicoptero(String nombre, String horaAterrizaje, int horasVolando, String color, String marca,
			String modelo, String tipo) {
		super(nombre, horaAterrizaje, horasVolando);
		this.color = color;
		this.marca = marca;
		this.modelo = modelo;
		this.tipo = tipo;
	}
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}
	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}
	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}
	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}
	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		return "Helicoptero [" + getNombre() + "," + getHoraAterrizaje()
				+ "," + getHorasVolando() + "," + color + "," + marca + ","
				+ modelo + "," + tipo + "]";
	}
	@Override
	public void ordenAterrizaje() {
		System.out.println("El Helicoptero "+this.getNombre()+" es autorizado para aterrizar");
		
	}
	
	

}
