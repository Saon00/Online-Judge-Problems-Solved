package uri;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner input=new Scanner(System.in);
		int i,j;
		int x,y;

		while(((x=input.nextInt())!=0) && ((y=input.nextInt())!=0)) {
				
			if(x>0 && y>0) {
				System.out.println("primeiro");
			}
			else if(x<0 && y>0) {
				System.out.println("segundo");
			}
			else if(x<0 && y<0) {
				System.out.println("terceiro");
			}
			else if(x>0 && y<0) {
				System.out.println("quarto");
			}

		}
		
	}
		
	}

	
 
