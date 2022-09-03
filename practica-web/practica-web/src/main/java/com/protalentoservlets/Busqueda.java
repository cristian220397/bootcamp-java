package com.protalentoservlets;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.protalento.entidades.Buscar;
import com.protalento.entidades.Contenidohtml;
import com.protalento.entidades.Search;

/**
 * Servlet implementation class Busqueda
 */
public class Busqueda extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Busqueda() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//String texto = request.getParameter("texto");
		//String direccion = request.getParameter("direccion");
		//Search search = new Search(texto,direccion,null);
		//System.out.println(search);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
		Search search = new Search();
		search.setTexto(request.getParameter("texto"));
		search.setDireccion(request.getParameter("direccion"));
		search.setContenidohtml(requestURLBodyResponse( search.getDireccion()));
		System.out.println(search.toString());
		//insertIntoDataBase(webSearch);
		
		
		request.setAttribute("search", search);
		
		dispatcher.forward(request, response);
		//System.out.println("From Post");
		
	}
	public String requestURLBodyResponse(String direccion) {
		HttpClient client = HttpClient.newHttpClient();
		   
		HttpRequest request = HttpRequest.newBuilder()
			         .uri(URI.create(direccion))
			         .build();
		   
		HttpResponse<String> response = null;
		try {
			response = client.send(request, BodyHandlers.ofString());
		} catch (IOException e) { 
			e.printStackTrace();
		} catch (InterruptedException e) { 
			e.printStackTrace();
		} 
		
		return response.body();
	}

}
 