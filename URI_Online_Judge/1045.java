package uri;
import java.util.*;
//uri says this code has 10% error, but my all output was right.Can you help me to find the faults ?
public class MainClass {
	public static void main(String[] args) {
	
		Scanner input=new Scanner(System.in);
		
		double a,b,c;
		a=input.nextDouble();
		b=input.nextDouble();
		c=input.nextDouble();
		double tempA=Math.max(a,Math.max(b,c));
		double tempB=0;
		double tempC=0;
		if(tempA==a) {
			tempB=Math.max(b, c);
			tempC=Math.min(b, c);
		}
		 if(tempA==b) {
			tempB=Math.max(a, c);
			tempC=Math.min(a, c);
		}
		 if(tempA==c) {
			tempB=Math.max(a, b);
			tempC=Math.min(a, b);
		}
		
		 if(tempA>=(tempB+tempC)) {
			 System.out.println("NAO FORMA TRIANGULO");
		 }
		  if((tempA*tempA)==((tempB*tempB)+(tempC*tempC))) {
			 System.out.println("TRIANGULO RETANGULO");
		 }
		  if((tempA*tempA)>((tempB*tempB)+(tempC*tempC))) {
			 System.out.println("TRIANGULO OBTUSANGULO");
		 }
		  if((tempA*tempA)<((tempB*tempB)+(tempC*tempC))) {
			 System.out.println("TRIANGULO ACUTANGULO");
		 }
		  if(tempA==tempB && tempB==tempC && tempA==tempC) {
			  System.out.println("TRIANGULO EQUILATERO");
		  }
		  if((tempA==tempB && tempA!=tempC) || ((tempA==tempC) && tempA!=tempB) || ((tempB==tempC) && tempB!=tempA)) {
			  System.out.println("TRIANGULO ISOSCELES");
		  }
		
		
		}
	}

	
 
