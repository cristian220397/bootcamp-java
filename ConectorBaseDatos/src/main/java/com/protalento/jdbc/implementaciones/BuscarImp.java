package com.protalento.jdbc.implementaciones;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;

import com.protalento.entidades.Buscar;
import com.protalento.jdbc.interfaces.AdministradorDeConexionMariaDB;
import com.protalento.jdbc.interfaces.Ibuscar;
import com.protalento.jdbc.utilidades.Fechas;


public class BuscarImp implements Ibuscar  {
	private PreparedStatement preparedStatementBuscarPorID;
	private PreparedStatement preparedStatementInsertar;
	private PreparedStatement preparedStatementEliminar;
	private PreparedStatement preparedStatementModificar;
	private PreparedStatement preparedStatementListar;
	private PreparedStatement preparedStatementBurcarporTextoURL;
	private AdministradorDeConexionMariaDB administradorDeConexionMariaDB;
	
	public BuscarImp() {
		administradorDeConexionMariaDB = new AdministradorDeConexionMariaDB();
	}
	

	@Override
	public Buscar buscarPorID(String Texto) {
		Buscar buscar = null;
		String sql = "select texto,url,fecha from busquedas_recientes";
		try {
			preparedStatementBuscarPorID = administradorDeConexionMariaDB.getConexion().prepareStatement(sql);
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return buscar;
	}

	@Override
	public boolean insertar(Buscar buscar) {
		String sql="insert into busquedas_recientes(texto,url,fecha) values(?,?,?)";
		try {
			if (null == preparedStatementInsertar) {
				preparedStatementInsertar = administradorDeConexionMariaDB.getConexion().prepareStatement(sql);
			}
			preparedStatementInsertar.setString(1,buscar.getTexto());
			preparedStatementInsertar.setString(2,buscar.getURL());
			preparedStatementInsertar.setString(3, Fechas.getString(buscar.getFecha()));
			
			return preparedStatementInsertar.executeUpdate() == 1;
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		return false;
	}

	@Override
	public boolean modificar(Buscar buscar) {
		return false;
	}

	@Override
	public boolean eliminar(Buscar buscar) {
		return false;
	}

	@Override
	public List<Buscar> listar() {
		return null;
	}

	@Override
	public Buscar burcarporTextoURL(String Texto, String URL) {
		return null;
	}
	public static void main(String[] args) {
	
		//Buscar buscar = new Buscar("holis","https://www.google5.com/",LocalDateTime.now(),"hfh");
		
		Buscar buscar = new Buscar();
		System.out.println(buscar);
		Ibuscar ibuscar = new BuscarImp();
		ibuscar.insertar(buscar);
	} 

}
