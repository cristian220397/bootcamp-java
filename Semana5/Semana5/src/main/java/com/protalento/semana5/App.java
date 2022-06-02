package com.protalento.semana5;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	
		
		  String[] collection = new String[10]; CollectionCustom<String> personas = new
		  CollectionCustom<String>(collection);
		  personas.add("carlos");
		  personas.add("robert"); 
		  personas.addFirst("camila"); 
		  personas.addFirst("norma");
		  personas.addLast("sergio");
		  personas.addLast("jose");
		  personas.addLast("federico");
		  personas.addLast("pedro");
		  personas.addLast("emma");
		  personas.addLast("saul");
		  personas.remove("robert"); 
		  personas.size();
		  personas.removeAll();
		  personas.empty();
    	  System.out.println(personas.toString());
    	
    	
    	
    	
    
    	
    
    	
    	
    	
    
    }
}
