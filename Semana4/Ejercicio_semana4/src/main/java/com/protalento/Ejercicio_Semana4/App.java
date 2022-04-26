package com.protalento.Ejercicio_Semana4;

import com.protalento.entidades.Avion;
import com.protalento.entidades.Helicoptero;
import com.protalento.entidades.Ovni;
import com.protalento.entidades.Superman;
import com.protalento.entidades.Volador;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Avion avion = new Avion("Boeing 7500","7:30 am",4,50,1126,"American Airlines");
        avion.ordenAterrizaje();
        
        Helicoptero helicoptero = new Helicoptero("Havoc", "11:20 am", 2,"Verde","Sikorsky","Super Cobra","Militar");
        helicoptero.ordenAterrizaje();
        
        Ovni ovni = new Ovni("Nave espacial Marvin", "5:00 pm",20,"Marte","50000 km/h",100);
        ovni.ordenAterrizaje();
        
        Superman superman = new Superman("Clark kent","2:00 am",3,"Krypton","Roja", "1.85 metros","La Kriptonita");
        superman.ordenAterrizaje();
        
      
        
        
       
        
        
        
        
        
    }
}
