package com.protalento.entidades;

public class Avion extends Volador{
	private int cantidadAsientos;
	private int numeroVuelo;
	private String aerolinea;
	
	public Avion() {
		super();
	}
	public Avion(String nombre, String horaAterrizaje, int horasVolando, int cantidadAsientos, int numeroVuelo,
			String aerolinea) {
		super(nombre, horaAterrizaje, horasVolando);
		this.cantidadAsientos = cantidadAsientos;
		this.numeroVuelo = numeroVuelo;
		this.aerolinea = aerolinea;
	}
	/**
	 * @return the cantidadAsientos
	 */
	public int getCantidadAsientos() {
		return cantidadAsientos;
	}
	/**
	 * @param cantidadAsientos the cantidadAsientos to set
	 */
	public void setCantidadAsientos(int cantidadAsientos) {
		this.cantidadAsientos = cantidadAsientos;
	}
	/**
	 * @return the numeroVuelo
	 */
	public int getNumeroVuelo() {
		return numeroVuelo;
	}
	/**
	 * @param numeroVuelo the numeroVuelo to set
	 */
	public void setNumeroVuelo(int numeroVuelo) {
		this.numeroVuelo = numeroVuelo;
	}
	/**
	 * @return the aerolinea
	 */
	public String getAerolinea() {
		return aerolinea;
	}
	/**
	 * @param aerolinea the aerolinea to set
	 */
	public void setAerolinea(String aerolinea) {
		this.aerolinea = aerolinea;
	}
	@Override
	public String toString() {
		return "Avion [" + getNombre() + "," + getHoraAterrizaje()
				+ "," + getHorasVolando() + "," + cantidadAsientos
				+ "," + numeroVuelo + "," + aerolinea + "]";
	}
	@Override
	public void ordenAterrizaje() {
		System.out.println("El Avion "+this.getNombre()+" es autorizado para aterrizar");
		
	}
	
	

}
