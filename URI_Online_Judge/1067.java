package uri;


import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner input=new Scanner(System.in);
		
		int n=input.nextInt();
			
		for(int i=1;i<=n;i++) {
			int s=i%2;
			if(s!=0) {
				System.out.println(i);
			}
		}
	}
		
	}

	
 
