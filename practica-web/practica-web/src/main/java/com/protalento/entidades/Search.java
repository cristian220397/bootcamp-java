package com.protalento.entidades;

public class Search {
	private String texto;
	private String direccion;
	private String contenidohtml;
	public Search() {
		super();
	}
	public Search(String texto, String direccion, String contenidohtml) {
		super();
		this.texto = texto;
		this.direccion = direccion;
		this.contenidohtml = contenidohtml;
	}
	/**
	 * @return the texto
	 */
	public String getTexto() {
		return texto;
	}
	/**
	 * @param texto the texto to set
	 */
	public void setTexto(String texto) {
		this.texto = texto;
	}
	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}
	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
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
		return "Search [texto=" + texto + ", direccion=" + direccion + ", contenidohtml=" + contenidohtml + "]";
	}
	

}
