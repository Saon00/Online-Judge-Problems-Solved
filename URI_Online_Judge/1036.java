package uri;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		double a,b,c,x1,x2;
		
		a=input.nextDouble();
		b=input.nextDouble();
		c=input.nextDouble();
		
		if(a==0 || (b*b-4*a*c)<0) {
			System.out.println("Impossivel calcular");
		}
		else {
			x1=(double)((-b+Math.sqrt(b*b-4*a*c))/(2*a));
			x2=(double)((-b-Math.sqrt(b*b-4*a*c))/(2*a));
			

			
			String R1=String.format("R1 = %.5f",x1);
			String R2=String.format("R2 = %.5f",x2);
			
			System.out.println(R1);
			System.out.println(R2);
		}
		
	}

}
