package uri;


import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		float num;
		int i;
		int count=0;
		float sum=0;
		
		for(i=1;i<=6;i++) {
			
			 num=input.nextFloat();
			 
			 if(num>0) {
				 count++;
				 sum=sum+num;
			 }
			
		}
		System.out.println(count+" valores positivos");
		System.out.printf("%.1f\n",sum/count);
		
		
	}
		
	}

	
 
