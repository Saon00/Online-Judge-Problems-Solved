package uri;
// I can find my fault. It was a portugese spelling mistake. It is the update version and it was accepted

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner input=new Scanner(System.in);
			
			int num;
			int i;
			int count=0;
			
			
			
			for(i=1;i<6;i++) {
				
				 num=input.nextInt();
				
				 if(num%2==0) {
					 count++;
					
				 }
				
			}
			System.out.println(count+" valores pares");
			
	}
		
	}

	
 
