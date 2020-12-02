import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class MainClass {
	
	public static String findDay(int month, int day, int year) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.MONTH, month-1);
        cal.set(Calendar.DAY_OF_MONTH, day);
        cal.set(Calendar.YEAR, year);
        return cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US).toUpperCase();
    }
	
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int month = scanner.nextInt();
		int day = scanner.nextInt();
		int year = scanner.nextInt();
		System.out.println(findDay(month, day, year));
		
		
	}
}
