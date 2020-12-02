package uri;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner input=new Scanner(System.in);
		float a,b;
		float count=0,sum=0,avg=0;
		
		while(count!=2) {
			
			a=input.nextFloat();
			if(a>=0 && a<=10) {
				sum=sum+a;
				count++;
			}
			else {
				System.out.println("nota invalida");
			}
		}
		avg=sum/2;
		String media=String.format("media = %.2f",avg);
		System.out.println(media);
		
	}
		
	}

	
 
