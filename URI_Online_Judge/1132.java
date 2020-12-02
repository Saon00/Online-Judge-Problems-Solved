package uri;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner io=new Scanner(System.in);
		
		int x,y,sum=0;
		int i;
		x=io.nextInt();
		y=io.nextInt();
		
		if(x>y) {
		
			for(i=y;i<=x;i++) {
				
				if(i%13!=0) {
					sum=sum+i;
				}
			}
		}
		else {
			for(i=x;i<=y;i++) {
				
				if(i%13!=0) {
					sum=sum+i;
				}
			}
		}
		
		
		System.out.println(sum);
		
		
	}
		
	}

	
 
