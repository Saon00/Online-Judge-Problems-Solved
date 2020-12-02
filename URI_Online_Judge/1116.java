package uri;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner input=new Scanner(System.in);
		int i,j,n;
		float x,y;

			n=input.nextInt();
			for(i=1;i<=n;i++) {
				x=input.nextFloat();
				y=input.nextFloat();
				
				if(y==0) {
					System.out.println("divisao impossivel");
				}
				else {
					float result=x/y;
					System.out.println(result);
				}
			}
		
	}
		
	}

	
 
