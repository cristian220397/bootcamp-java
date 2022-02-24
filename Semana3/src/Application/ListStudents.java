package Application;
import java.util.ArrayList;
import java.util.Scanner;


public class ListStudents {
	
	ArrayList<Alumnos> liststudents = new ArrayList();
	
	
	public void agregar_alumnos() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el nombre del alumno: ");
		String name = sc.next();	
		System.out.println("Ingrese el apellido del alumno: ");
		String lastname = sc.next();
		System.out.println("Ingrese el numero de examen: ");
		int nro_examen1 = sc.nextInt();
		System.out.println("Ingrese la 1ra nota del examen: ");
		int nota_examen1 = sc.nextInt();
		System.out.println("Ingrese el numero de examen: ");
		int nro_examen2 = sc.nextInt();
		System.out.println("Ingrese la 2da nota del examen: ");
		int nota_examen2 = sc.nextInt();
		System.out.println("Ingrese el numero de examen: ");
		int nro_examen3 = sc.nextInt();
		System.out.println("Ingrese la 3ra nota del examen: ");
		int nota_examen3 = sc.nextInt();
		
		
		Alumnos alumnos = new Alumnos();
		alumnos.setName(name);
		alumnos.setLastname(lastname);
		alumnos.setNro_examen1(nro_examen1);
		alumnos.setNota_examen1(nota_examen1);
		alumnos.setNro_examen2(nro_examen2);
		alumnos.setNota_examen2(nota_examen2);
		alumnos.setNro_examen3(nro_examen3);
		alumnos.setNota_examen3(nota_examen3);
		liststudents.add(alumnos);
		
		
	}
	
	public void  obtener_alumnos() {
		String list = "";
		for(int i=0; i<liststudents.size(); i++) {
			list += "----------------"+"\n"+"Nombre:"+liststudents.get(i).getName()+"\n";
			list += "Apellido:"+liststudents.get(i).getLastname()+"\n";
			list += "Nro de examen:"+liststudents.get(i).getNro_examen1()+"\n";
			list += "Nota Alumno:"+liststudents.get(i).getNota_examen1()+"\n";
			list += "Nro de examen:"+liststudents.get(i).getNro_examen2()+"\n";
			list += "Nota Alumno:"+liststudents.get(i).getNota_examen2()+"\n";
			list += "Nro de examen:"+liststudents.get(i).getNro_examen3()+"\n";
			list += "Nota Alumno:"+liststudents.get(i).getNota_examen3()+"\n";
		}
		System.out.println(list);
		
	}
	public void obtener_alumnos_calificacion_mas_alta() {
		int mayor=liststudents.get(0).getNota_examen1();
		String name ="";
		String lastname = "";
		for(int i=0;i<liststudents.size();i++) {
			
			if(liststudents.get(i).getNota_examen1()>mayor) {
				mayor =liststudents.get(i).getNota_examen1 ();
				name = liststudents.get(i).getName();
				lastname = liststudents.get(i).getLastname();
			}
			else if(liststudents.get(i).getNota_examen2()>mayor) {
				mayor =liststudents.get(i).getNota_examen2 ();
				name = liststudents.get(i).getName();
				lastname = liststudents.get(i).getLastname();
				
			}
			else if(liststudents.get(i).getNota_examen3()>mayor) {
				mayor =liststudents.get(i).getNota_examen3 ();
				name = liststudents.get(i).getName();
				lastname = liststudents.get(i).getLastname();
				
			}
		}
		System.out.println(name+" "+lastname+" tiene la calificacion mas alta y es:"+mayor);
		
		
		
	}
	public void obtener_alumnos_calificacion_mas_baja() {
		int menor=liststudents.get(0).getNota_examen1();
		String name ="";
		String lastname = "";
		for(int i=0;i<liststudents.size();i++) {
			
			if(liststudents.get(i).getNota_examen1()<menor) {
				menor =liststudents.get(i).getNota_examen1 ();
				name = liststudents.get(i).getName();
				lastname = liststudents.get(i).getLastname();
			}
			else if(liststudents.get(i).getNota_examen2()<menor) {
				menor =liststudents.get(i).getNota_examen2 ();
				name = liststudents.get(i).getName();
				lastname = liststudents.get(i).getLastname();
				
			}
			else if(liststudents.get(i).getNota_examen3()<menor) {
				menor =liststudents.get(i).getNota_examen3 ();
				name = liststudents.get(i).getName();
				lastname = liststudents.get(i).getLastname();
				
			}
		}
		System.out.println(name+" "+lastname+" tiene la nota mas baja y es:"+menor);
	}
	
	public void alumnos_promocionan() {
		int a = 0;
		int b = 0;
		int c = 0;
		int promedio = 0;
	
		for(int i=0;i<liststudents.size();i++) {
			a=liststudents.get(i).getNota_examen1 ();
			b=liststudents.get(i).getNota_examen2 ();
			c=liststudents.get(i).getNota_examen3 ();
			promedio = (a+b+c)/3;
		    if(promedio>=7){
		    	System.out.println(liststudents.get(i).getName()+" "+liststudents.get(i).getLastname()+" promociona con un promedio de:"+promedio);
		    }
		
			
			
		}
		
	}
	
	public void alumnos_recursan() {
		int a = 0;
		int b = 0;
		int c = 0;
		int promedio = 0;
	
		for(int i=0;i<liststudents.size();i++) {
			a=liststudents.get(i).getNota_examen1 ();
			b=liststudents.get(i).getNota_examen2 ();
			c=liststudents.get(i).getNota_examen3 ();
			promedio = (a+b+c)/3;
		    if(promedio<7){
		    	System.out.println(liststudents.get(i).getName()+" "+liststudents.get(i).getLastname()+" recursa con un promedio de:"+promedio);
		    }
		
			
			
	
		
			
		}
	}
	
		
		
		
	

	
	

}

