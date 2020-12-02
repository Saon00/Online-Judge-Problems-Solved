package uri;


import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		Scanner input=new Scanner(System.in);
		
			int num=input.nextInt();
			float a,b,c,math1;
			
			
			for(int i=1;i<=num;i++) {
				
				a=input.nextFloat();
				b=input.nextFloat();
				c=input.nextFloat();
				
				 math1=(a*2+b*3+c*5)/10;
				 System.out.printf("%.1f\n",math1);
				
			}
		
	}
		
	}

	
 
