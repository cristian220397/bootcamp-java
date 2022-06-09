package com.protalento.basedatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.protalento.entidades.Cliente;
import com.protalento.implementaciones.mariadb.ClienteIpm;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    Cliente cliente;
    ClienteIpm clienteIpm = new ClienteIpm();
    cliente = clienteIpm.buscarPorId("1.241.331.440");
    System.out.println(cliente);
        
    }
}
