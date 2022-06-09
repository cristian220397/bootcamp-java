package com.protalento.entidades;

public class Cliente {
	private int id ;
	private String id_cliente;
	private String nombre;
	private String calle;
	private String cuidad;
	
	
	public Cliente() {
		
	}
	
	
	public Cliente(int id,String id_cliente, String nombre, String calle, String cuidad) {
		super();
		this.id = id;
		this.id_cliente = id_cliente;
		this.nombre = nombre;
		this.calle = calle;
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
	 * @return the id_cliente
	 */
	public String getId_cliente() {
		return id_cliente;
	}


	/**
	 * @param id_cliente the id_cliente to set
	 */
	public void setId_cliente(String id_cliente) {
		this.id_cliente = id_cliente;
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
	 * @return the calle
	 */
	public String getCalle() {
		return calle;
	}


	/**
	 * @param calle the calle to set
	 */
	public void setCalle(String calle) {
		this.calle = calle;
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
		return "Cliente [id=" + id + ", id_cliente=" + id_cliente + ", nombre="
				+ nombre + ", calle=" + calle + ", cuidad=" + cuidad + "]";
	}
	
	
	
	

}

