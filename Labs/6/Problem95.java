import java.util.Calendar;
import java.util.GregorianCalendar;
public class Problem95 {

	public static void main(String[] args) {
		// John Kendrat CMPT 220
       Calendar calendar1 = new GregorianCalendar();
		System.out.println("The current year is " + calendar1.get(Calendar.YEAR));
		System.out.println("The current month is " + calendar1.get(Calendar.MONTH));
		System.out.println("The current day is " + calendar1.get(Calendar.DAY_OF_MONTH));
		
		calendar1.setTimeInMillis(1234567898765L);
		System.out.println("The year is " + calendar1.get(Calendar.YEAR));
		System.out.println("The month is " + calendar1.get(Calendar.MONTH));
		System.out.println("The day is " + calendar1.get(Calendar.DAY_OF_MONTH));
		
	}
	

}

