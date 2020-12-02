package uri;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		float number=input.nextFloat();
		
		if(number>=0 && number<=25.0000 ) {
			System.out.println("Intervalo [0,25]");
		}
		else if (number>=25.00001 && number<=50.0000000) {
			System.out.println("Intervalo (25,50]");
		}
		
		else if (number>=50.00001 && number<=75.0000000) {
			System.out.println("Intervalo (50,75]");
		}
		
		else if (number>=75.00001 && number<=100.0000000) {
			System.out.println("Intervalo (75,100]");
		}
		
		else {
			System.out.println("Fora de intervalo");
		}
		
	}

}
