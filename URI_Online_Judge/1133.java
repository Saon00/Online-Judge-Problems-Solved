package uri;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner io=new Scanner(System.in);
		
		int x,y;
		int i;
		x=io.nextInt();
		y=io.nextInt();
		
		if(x>y) {
		
			for(i=y+1;i<x;i++) {
				
				if(i%5==2 || i%5==3) {
					System.out.println(i);
				}
			}
		}
		else {
			for(i=x+1;i<y;i++) {
				
				if(i%5==2 || i%5==3) {
					System.out.println(i);
				}
			}
		}
		
		
		
		
		
	}
		
	}

	
 
