package Application;
import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
	

	public static void main(String[] args) {
		ListStudents objeto = new ListStudents();
		int option;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println(
					"Menu Principal\n"
					+"1. Ingresar Alumno\n"		
					+"2. Mostrar lista de estudiantes\n"
					+"3. Alumno/s con la calificación mas alta\n"
					+"4. Alumno/s con la calificación mas baja\n"
					+"5. Alumnos que promocionan, aquellos que obtubieron un promerdio >= 7\n"
					+"6. Alumnos que deben recursar la materia, aquellos que obtuvieron un promedio < 7\n"
					+"7. Salir");
		    option = sc.nextInt(); 
			
			switch(option) {
				case 1:
					objeto.agregar_alumnos();
					break;
				case 2:
					objeto.obtener_alumnos();
					break;
				case 3:
					objeto.obtener_alumnos_calificacion_mas_alta();
					break;
				case 4:
					objeto.obtener_alumnos_calificacion_mas_baja();
					break;
				case 5:
					objeto.alumnos_promocionan();
					break;
				case 6:
					objeto.alumnos_recursan();
					break;
				case 7:
					System.out.println("Gracias por utilizar nuestros servicios");
					break;
				default:
					System.out.println("Ingreso una opcion incorrecta");
					break;				
			}
		}while(option!=7);		
	}

}
