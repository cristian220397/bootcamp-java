package practica_semanal_semana2;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {
	
	

	public static void main(String[] args) {
		Date current_day= new Date();
		SimpleDateFormat DateFormat= new SimpleDateFormat("dd/MM/YYYY");
		String current_date=getday(current_day,"dd");
		String current_month=getmonth(current_day,"MM");
		String current_year=getyear(current_day,"YYYY");
		int current_year1= Integer.parseInt(current_year);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("INGRESA AÑO: ");
		int year = sc.nextInt();
		boolean validaraño = Validateyear(year, current_year1);
	    System.out.println(validaraño);
		
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("INGRESA MES: ");
		int month = sc.nextInt();
		boolean validarmes = Validatemonth(month);
	    System.out.println(validarmes);
		
		Scanner sc3 = new Scanner(System.in);
		System.out.println("INGRESA DIA: ");
		int day = sc3.nextInt();
		boolean validardias = ValidateDays(month,day,year);
	    System.out.println(validardias);
		
		
		
		
		
		
		
		
	
			
		
		
		
		

	}

	
	public static String getday(Date date, String formato) {
		SimpleDateFormat DateFormat= new SimpleDateFormat(formato);
		//System.out.println(DateFormat.format(date));
		return DateFormat.format(date);
			
		
	}
	public static String getmonth(Date date, String formato) {
		SimpleDateFormat DateFormat= new SimpleDateFormat(formato);
		//System.out.println(DateFormat.format(date));
		return DateFormat.format(date);
		
	}
	public static String getyear(Date date, String formato) {
		SimpleDateFormat DateFormat= new SimpleDateFormat(formato);
		//System.out.println(DateFormat.format(date));
		return DateFormat.format(date);
	}
	public static boolean Validatemonth(int month) {
		if (month >= 1 && month <= 12) {return true;}
		return false;
	}
	public static boolean Validateyear(int year,int current_year1) {
		if (year >=1900 && year <=current_year1) {return true;}
		return false;
	}
	
    public static boolean ValidateDays( int month , int day,int year) {
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) { 
			if (day >= 1 && day<= 31 ) {return true;}
			return false;
		
		}
		else if (month == 4 || month == 6 || month == 9 || month == 11 ) {
			if (day >= 1 && day<= 30) {return true;}
			return false;
			
		}
		else {
			if (month == 2 && year % 4 == 0 ) {
				if (day >= 1 && day <=29) {return true;}
				return false;
			}
			else {
				if (day>=1 && day<=28) {return true;}
				return false;
			}
			
			
			
			
		}
	
		
		
	}

}
