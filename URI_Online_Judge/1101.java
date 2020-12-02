package uri;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner input=new Scanner(System.in);
		int i,j;
		int m,n;
		
		while(((m=input.nextInt())>0) && ((n=input.nextInt())>0)) {
			int sum=0;
			if(m>n) {
				for(i=n;i<=m;i++) {
					System.out.print(i+" ");
					sum=sum+i;
					
				}
				System.out.println("Sum="+sum);
				
			}
			
			else  {
				for(i=m;i<=n;i++) {
					System.out.print(i+" ");
					sum=sum+i;
					
				}
				System.out.println("Sum="+sum);
				
			}
			
		}
		
		
	}
		
	}

	
 
