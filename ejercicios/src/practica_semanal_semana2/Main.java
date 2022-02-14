package practica_semanal_semana2;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Main {

	public static void main(String[] args) {
		Date current_day= new Date();
		SimpleDateFormat DateFormat= new SimpleDateFormat("dd/MM/YYYY");
		System.out.println(DateFormat.format(current_day));
		String current_date=getday(current_day,"dd/MM");
		
		
		
	
			
		
		
		
		

	}
	
	public static String getday(Date date, String formato) {
		SimpleDateFormat DateFormat= new SimpleDateFormat(formato);
		System.out.println(DateFormat.format(date));
		return DateFormat.format(date);
		
		
		
	}

}
