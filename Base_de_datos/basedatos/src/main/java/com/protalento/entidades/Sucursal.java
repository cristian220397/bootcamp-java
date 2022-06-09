package com.protalento.entidades;

public class Sucursal {
	private int id;
	private String nombre_sucursal;
	private String cuidad;
	
	
	public Sucursal(int id, String nombre_sucursal, String cuidad) {
		super();
		this.id = id;
		this.nombre_sucursal = nombre_sucursal;
		this.cuidad = cuidad;
	}


	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}


	/**
	 * @return the nombre_sucursal
	 */
	public String getNombre_sucursal() {
		return nombre_sucursal;
	}


	/**
	 * @param nombre_sucursal the nombre_sucursal to set
	 */
	public void setNombre_sucursal(String nombre_sucursal) {
		this.nombre_sucursal = nombre_sucursal;
	}


	/**
	 * @return the cuidad
	 */
	public String getCuidad() {
		return cuidad;
	}


	/**
	 * @param cuidad the cuidad to set
	 */
	public void setCuidad(String cuidad) {
		this.cuidad = cuidad;
	}


	@Override
	public String toString() {
		return "Sucursal [id=" + id + ", nombre_sucursal=" + nombre_sucursal + ", cuidad=" + cuidad + "]";
	}
	
	

}
