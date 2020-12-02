package uri;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
	float x1=input.nextFloat();
	float y1=input.nextFloat();	
	float x2=input.nextFloat();
	float y2=input.nextFloat();
	
	float formula=(float) (Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2)));
	String result=String.format("%.4f",formula);
	System.out.println(result);
	
	
	}

}
