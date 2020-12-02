package uri;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		
		
		int x=input.nextInt();
		int y=input.nextInt();
		
		//float price=x*y;
		if(x==1) {
			float price=4*y;
			System.out.printf("Total: R$ %.2f\n",price);
		}
		
		else if(x==2) {
			float price=(float) (4.50*y);
			System.out.printf("Total: R$ %.2f\n",price);
		}
		
		else if(x==3) {
			float price=5*y;
			System.out.printf("Total: R$ %.2f\n",price);
		}
		
		else if(x==4) {
			float price=2*y;
			System.out.printf("Total: R$ %.2f\n",price);
		}
		
		else if(x==5) {
			float price=(float) 1.50*y;
			System.out.printf("Total: R$ %.2f\n",price);
		}
		
	}

	}
