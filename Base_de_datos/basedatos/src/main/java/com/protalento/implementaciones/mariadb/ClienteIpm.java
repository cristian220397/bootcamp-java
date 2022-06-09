package com.protalento.implementaciones.mariadb;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import com.protalento.entidades.Cliente;
import com.protalento.interfaz.ConexionMariaDB;
import com.protalento.interfaz.DAO;

public class ClienteIpm implements DAO<Cliente,String>, ConexionMariaDB{

	@Override
	public Cliente buscarPorId(String id_cliente) {
		Cliente cliente = null;
		
		
		try {
			Statement sentencia= getConexion().createStatement();
			String sql = "select *from clientes where id_cliente=id_cliente";
			ResultSet resulset = sentencia.executeQuery(sql);
			if(resulset.next()) {
				cliente = new Cliente();
				//cliente.setId_cliente(id_cliente1);
				cliente.setId_cliente(id_cliente);
				cliente.setNombre(resulset.getString("nombre"));
				cliente.setId(resulset.getInt("id"));
				cliente.setCuidad(resulset.getString("cuidad"));
				cliente.setCalle(resulset.getString("calle"));		
				
			}	    		
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return cliente;
	}

	@Override
	public boolean insertar(Cliente cliente) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean modificar(Cliente cliente) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean eliminar(Cliente cliente) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Cliente> listar() {
		// TODO Auto-generated method stub
		return null;
	}

}
