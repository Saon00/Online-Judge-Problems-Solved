package uri;
import java.util.*;

public class MainClass {
	public static void main(String[] args) {
	
		Scanner input=new Scanner(System.in);
		
		float a,b,c;
		a=input.nextFloat();
		b=input.nextFloat();
		c=input.nextFloat();
		if(((a+b)>c) && ((a+c)>b) && ((b+c)>a)) {
			float perimetro=a+b+c;
			String area2=String.format("Perimetro = %.1f",perimetro);
			System.out.println(area2);
			
		}
		else {
			
			float area=((a+b)*c)/2;
			String area1=String.format("Area = %.1f",area);
			System.out.println(area1);
		}
		
		
		
		}
	}

	
 
