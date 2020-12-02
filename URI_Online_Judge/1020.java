package uri;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		int days=input.nextInt();
		int year=days/365;
		int carry=days%365;
		int month=carry/30;
		int day=carry%30;
		
		System.out.println(year+" ano(s)");
		System.out.println(month+" mes(es)");
		System.out.println(day+" dia(s)");
		
		
	
	
	}

}
