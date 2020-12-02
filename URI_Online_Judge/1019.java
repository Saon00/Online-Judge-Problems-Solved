package uri;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		int sec=input.nextInt();
		int hour=sec/3600;
		int minutes=(sec-(3600*hour))/60;
		int seconds=sec-(3600*hour)-(60*minutes);
		
		System.out.println(hour+":"+minutes+":"+seconds);
	
	
	}

}
