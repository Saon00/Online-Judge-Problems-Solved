package uri;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		int km=input.nextInt();
		float litre=input.nextFloat();
		
		float result=km/litre;
		String avg=String.format("%.3f km/l",result);
		System.out.println(avg);
		
		
	}

}
