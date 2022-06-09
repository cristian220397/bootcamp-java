package com.protalento.entidades;

public class Empleado {
	private int id;
	private String id_empleado;
	private String nombre_empleado;
	private String numero_telefono;
	private String id_jefe;
	private String nombre_jefe;
	public Empleado(int id, String id_empleado, String nombre_empleado, String numero_telefono, String id_jefe,
			String nombre_jefe) {
		super();
		this.id = id;
		this.id_empleado = id_empleado;
		this.nombre_empleado = nombre_empleado;
		this.numero_telefono = numero_telefono;
		this.id_jefe = id_jefe;
		this.nombre_jefe = nombre_jefe;
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
	 * @return the id_empleado
	 */
	public String getId_empleado() {
		return id_empleado;
	}
	/**
	 * @param id_empleado the id_empleado to set
	 */
	public void setId_empleado(String id_empleado) {
		this.id_empleado = id_empleado;
	}
	/**
	 * @return the nombre_empleado
	 */
	public String getNombre_empleado() {
		return nombre_empleado;
	}
	/**
	 * @param nombre_empleado the nombre_empleado to set
	 */
	public void setNombre_empleado(String nombre_empleado) {
		this.nombre_empleado = nombre_empleado;
	}
	/**
	 * @return the numero_telefono
	 */
	public String getNumero_telefono() {
		return numero_telefono;
	}
	/**
	 * @param numero_telefono the numero_telefono to set
	 */
	public void setNumero_telefono(String numero_telefono) {
		this.numero_telefono = numero_telefono;
	}
	/**
	 * @return the id_jefe
	 */
	public String getId_jefe() {
		return id_jefe;
	}
	/**
	 * @param id_jefe the id_jefe to set
	 */
	public void setId_jefe(String id_jefe) {
		this.id_jefe = id_jefe;
	}
	/**
	 * @return the nombre_jefe
	 */
	public String getNombre_jefe() {
		return nombre_jefe;
	}
	/**
	 * @param nombre_jefe the nombre_jefe to set
	 */
	public void setNombre_jefe(String nombre_jefe) {
		this.nombre_jefe = nombre_jefe;
	}
	@Override
	public String toString() {
		return "Empleado [id=" + id + ", id_empleado=" + id_empleado + ", nombre_empleado=" + nombre_empleado
				+ ", numero_telefono=" + numero_telefono + ", id_jefe=" + id_jefe + ", nombre_jefe=" + nombre_jefe
				+ "]";
	}
	
	

}
