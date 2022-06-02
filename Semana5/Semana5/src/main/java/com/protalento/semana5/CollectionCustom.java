package com.protalento.semana5;

import java.util.Arrays;

public class CollectionCustom<T> {
	private T[] dato;

	public CollectionCustom(T[] dato) {
		super();
		this.dato = dato;
	}

	public CollectionCustom() {

	}

	public void addFirst(T persona) {
		for (int i = dato.length - 1; i > 0; i--) {
			if (dato[i] == null && dato[i - 1] != null) {
				dato[i] = dato[i - 1];
				dato[i - 1] = null;
			}
		}
		int aux2=0;
		for(int i=0; i<dato.length;i++) {
			if(dato[i]!=null) {
				aux2=aux2+1;	
			  }
		  }
		  if(aux2<dato.length) {dato[0] = persona;}		  
	}
	public void addLast(T persona) {
		  
		 
		  int aux=0;

		  if(dato[dato.length-1]==null) {
			  dato[dato.length-1]=persona;
			  aux=1;
		  }
		  else {
			  aux=2;		  
		  }
		  int contador=2;
		  
		  for(int i=0; i<dato.length-1;i++) {
			
			  if(aux==2 && dato[i]==null && dato[i+1]!=null) {
				  
				  dato[i]=dato[i+1];
				  dato[i+1]=null;	 
			  } 
		  }
		  
		  int aux2=0;
		  for(int i=0; i<dato.length;i++) {
			  if(dato[i]!=null) {
				  aux2=aux2+1;	
			  }
		  }
		  if(aux2<dato.length) {dato[dato.length-1]=persona;}		  
		  }    
	public void add(T persona) {

		for (int i = 0; i < dato.length; i++) {
			if (dato[i] == null) {
				dato[i] = persona;
				break;
			}
		}
	}
	public void size() {
		System.out.println("El array tiene un tamaño de:"+dato.length);
	}
	public  T remove(T persona) {
		for(int i=0; i<dato.length;i++) {
			if(dato[i]==persona) {
				dato[i]=null;		
			}
		}
		return persona;
	}
	public void removeAll() {
		for(int i=0; i<dato.length;i++) {
			if(dato[i]!=null) {
				dato[i]=null;
		    }	
		}
	}
	public void empty() {
		 int aux3=0;
		  for(int i=0; i<dato.length;i++) {
			  if(dato[i]==null) {
				  aux3=aux3+1;	
			  }
		  }
			  if(aux3==dato.length) {
			  
			  System.out.println(true);
			  
			  }
			  else {
				  System.out.println(false);
			  }	
	}

	/**
	 * @return the dato
	 */
	public T[] getDato() {
		return dato;
	}

	/**
	 * @param dato the dato to set
	 */
	public void setDato(T[] dato) {
		this.dato = dato;
	}

	@Override
	public String toString() {
		return Arrays.toString(dato);
	}

}
