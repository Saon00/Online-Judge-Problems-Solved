package uri;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		double R=input.nextDouble();
		
		double result=(double) ((4*3.14159*Math.pow(R,3))/3);
		String volume=String.format("VOLUME = %.3f",result);
		System.out.println(volume);

		
	}

}
