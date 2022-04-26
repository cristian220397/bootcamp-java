package com.protalento.entidades;

public class Superman extends Volador {
	private String planetaNacimiento;
	private String colorCapa;
	private String estatura;
	private String debilidad;
	
	
	
	public Superman() {
		super();
	}
	public Superman(String nombre, String horaAterrizaje, int horasVolando, String planetaNacimiento, String colorCapa,
			String estatura, String debilidad) {
		super(nombre, horaAterrizaje, horasVolando);
		this.planetaNacimiento = planetaNacimiento;
		this.colorCapa = colorCapa;
		this.estatura = estatura;
		this.debilidad = debilidad;
	}
	/**
	 * @return the planetaNacimiento
	 */
	public String getPlanetaNacimiento() {
		return planetaNacimiento;
	}
	/**
	 * @param planetaNacimiento the planetaNacimiento to set
	 */
	public void setPlanetaNacimiento(String planetaNacimiento) {
		this.planetaNacimiento = planetaNacimiento;
	}
	/**
	 * @return the colorCapa
	 */
	public String getColorCapa() {
		return colorCapa;
	}
	/**
	 * @param colorCapa the colorCapa to set
	 */
	public void setColorCapa(String colorCapa) {
		this.colorCapa = colorCapa;
	}
	/**
	 * @return the estatura
	 */
	public String getEstatura() {
		return estatura;
	}
	/**
	 * @param estatura the estatura to set
	 */
	public void setEstatura(String estatura) {
		this.estatura = estatura;
	}
	/**
	 * @return the debilidad
	 */
	public String getDebilidad() {
		return debilidad;
	}
	/**
	 * @param debilidad the debilidad to set
	 */
	public void setDebilidad(String debilidad) {
		this.debilidad = debilidad;
	}
	@Override
	public String toString() {
		return "Superman [" + getNombre() + "," + getHoraAterrizaje()
				+ "," + getHorasVolando() + "," + planetaNacimiento
				+ "," + colorCapa + "," + estatura + "," + debilidad + "]";
	}
	@Override
	public void ordenAterrizaje() {
		System.out.println("Superman "+this.getNombre()+" es autorizado para aterrizar");
		
	}
	
	
	

}
