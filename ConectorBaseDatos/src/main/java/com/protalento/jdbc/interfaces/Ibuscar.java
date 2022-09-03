package com.protalento.jdbc.interfaces;

import com.protalento.entidades.Buscar;

public interface Ibuscar extends DAOGenerico<Buscar,String> {
	Buscar burcarporTextoURL(String Texto, String URL);

}
