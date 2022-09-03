package com.protalento.entidades;

public class Contenidohtml {
	private String contenidohtml;
	

	public Contenidohtml() {
		super();
	}
	

	public Contenidohtml(String contenidohtml) {
		super();
		this.contenidohtml = contenidohtml;
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
		return "Contenidohtml [contenidohtml=" + contenidohtml + "]";
	}
	

}
