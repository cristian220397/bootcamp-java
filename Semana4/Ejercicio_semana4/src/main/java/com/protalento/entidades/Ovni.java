package com.protalento.entidades;

public class Ovni extends Volador {
	private String nombrePlaneta;
	private String velocidadMax;
	private int cantidadMarcianos;
	
	public Ovni() {
		super();
	}
	public Ovni(String nombre, String horaAterrizaje, int horasVolando, String nombrePlaneta, String velocidadMax,
			int cantidadMarcianos) {
		super(nombre, horaAterrizaje, horasVolando);
		this.nombrePlaneta = nombrePlaneta;
		this.velocidadMax = velocidadMax;
		this.cantidadMarcianos = cantidadMarcianos;
	}
	/**
	 * @return the nombrePlaneta
	 */
	public String getNombrePlaneta() {
		return nombrePlaneta;
	}
	/**
	 * @param nombrePlaneta the nombrePlaneta to set
	 */
	public void setNombrePlaneta(String nombrePlaneta) {
		this.nombrePlaneta = nombrePlaneta;
	}
	/**
	 * @return the velocidadMax
	 */
	public String getVelocidadMax() {
		return velocidadMax;
	}
	/**
	 * @param velocidadMax the velocidadMax to set
	 */
	public void setVelocidadMax(String velocidadMax) {
		this.velocidadMax = velocidadMax;
	}
	/**
	 * @return the cantidadMarcianos
	 */
	public int getCantidadMarcianos() {
		return cantidadMarcianos;
	}
	/**
	 * @param cantidadMarcianos the cantidadMarcianos to set
	 */
	public void setCantidadMarcianos(int cantidadMarcianos) {
		this.cantidadMarcianos = cantidadMarcianos;
	}
	@Override
	public String toString() {
		return "Ovni [" + getNombre() + "," + getHoraAterrizaje()
				+ "," + getHorasVolando() + "," + nombrePlaneta + ","
				+ velocidadMax + "," + cantidadMarcianos + "]";
	}
	@Override
	public void ordenAterrizaje() {
		System.out.println("La "+this.getNombre()+" es autorizada para aterrizar");
		
	}
	
	

}
