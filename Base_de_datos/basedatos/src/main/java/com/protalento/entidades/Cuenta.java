package com.protalento.entidades;

public class Cuenta {
	private int idc;
	private String idCliente;
	private String id_cuenta;
	private String tipoCuenta;
	private String prestamo;
	private int id_sucursal;
	private String nombreSucursal;
	
	
	public Cuenta(int idc, String idCliente, String id_cuenta, String tipoCuenta, String prestamo, int id_sucursal,
			String nombreSucursal) {
		super();
		this.idc = idc;
		this.idCliente = idCliente;
		this.id_cuenta = id_cuenta;
		this.tipoCuenta = tipoCuenta;
		this.prestamo = prestamo;
		this.id_sucursal = id_sucursal;
		this.nombreSucursal = nombreSucursal;
		
	}


	/**
	 * @return the idc
	 */
	public int getIdc() {
		return idc;
	}


	/**
	 * @param idc the idc to set
	 */
	public void setIdc(int idc) {
		this.idc = idc;
	}


	/**
	 * @return the idCliente
	 */
	public String getIdCliente() {
		return idCliente;
	}


	/**
	 * @param idCliente the idCliente to set
	 */
	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}


	/**
	 * @return the id_cuenta
	 */
	public String getId_cuenta() {
		return id_cuenta;
	}


	/**
	 * @param id_cuenta the id_cuenta to set
	 */
	public void setId_cuenta(String id_cuenta) {
		this.id_cuenta = id_cuenta;
	}


	/**
	 * @return the tipoCuenta
	 */
	public String getTipoCuenta() {
		return tipoCuenta;
	}


	/**
	 * @param tipoCuenta the tipoCuenta to set
	 */
	public void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}


	/**
	 * @return the prestamo
	 */
	public String getPrestamo() {
		return prestamo;
	}


	/**
	 * @param prestamo the prestamo to set
	 */
	public void setPrestamo(String prestamo) {
		this.prestamo = prestamo;
	}


	/**
	 * @return the id_sucursal
	 */
	public int getId_sucursal() {
		return id_sucursal;
	}


	/**
	 * @param id_sucursal the id_sucursal to set
	 */
	public void setId_sucursal(int id_sucursal) {
		this.id_sucursal = id_sucursal;
	}


	/**
	 * @return the nombreSucursal
	 */
	public String getNombreSucursal() {
		return nombreSucursal;
	}


	/**
	 * @param nombreSucursal the nombreSucursal to set
	 */
	public void setNombreSucursal(String nombreSucursal) {
		this.nombreSucursal = nombreSucursal;
	}


	@Override
	public String toString() {
		return "Cuenta [idc=" + idc + ", idCliente=" + idCliente + ", id_cuenta=" + id_cuenta + ", tipoCuenta="
				+ tipoCuenta + ", prestamo=" + prestamo + ", id_sucursal=" + id_sucursal + ", nombreSucursal="
				+ nombreSucursal + "]";
	}
	
	
	

}
