package com.protalento.jdbc.interfaces;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public final class AdministradorDeConexionMariaDB {
	
	public static final InputStream PATH = Thread.currentThread().getContextClassLoader().getResourceAsStream("basededatos.properties");
	
	public Connection getConexion() {
		Connection conexion = null;
		Properties propiedades = new Properties();
		try {
			propiedades.load(PATH);
			String DRIVER = propiedades.getProperty("db_driver");
			String URL= propiedades.getProperty("db_url");
			String USUARIO= propiedades.getProperty("db_usuario");
			String CLAVE = propiedades.getProperty("db_clave");
			
			Class.forName(DRIVER);
			conexion = DriverManager.getConnection(URL, USUARIO, CLAVE);
					
					
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conexion;
		
		
	}
	
	public static void main(String[] args) {
		new AdministradorDeConexionMariaDB().getConexion();
	}
	
	
	
	
	
	
	
	
	 

}
