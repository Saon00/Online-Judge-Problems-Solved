package uri;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner input=new Scanner(System.in);
		float A,B,C;
		A=input.nextFloat();
		B=input.nextFloat();
		C=input.nextFloat();
		float sum=(float) (((A*2)+(B*3)+(C*5))/(10));
		String media=String.format("MEDIA = %.1f",sum);
		System.out.println(media);
	}

}
