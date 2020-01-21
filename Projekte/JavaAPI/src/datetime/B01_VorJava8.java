package datetime;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class B01_VorJava8 {

	
	public static void main(String[] args) {

		/*
		 * Nicht in der OCA-Prüfung:
		 */
		
		Date date = new Date();
		
		Calendar calendar = Calendar.getInstance();
		
		DateFormat df = DateFormat.getDateInstance();
		System.out.println(date);//Mon Dec 23 09:52:19 CET 2019
		System.out.println(calendar);//java.util.GregorianCalendar[time=157................
		System.out.println(df);//java.text.SimpleDateFormat@57402459
		
		
	}

}
