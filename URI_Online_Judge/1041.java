package uri;


import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		float x=input.nextFloat();
		float y=input.nextFloat();
		
		if(x==0 && y==0) {
			System.out.println("Origem");
		}
		else if(y==0) {
			System.out.println("Eixo X");
		}
		else if(x==0) {
			System.out.println("Eixo Y");
		}
		else if(x>0 && y>0) {
			System.out.println("Q1");
		}
		else if(x<0 && y>0) {
			System.out.println("Q2");
		}
		else if(x<0 && y<0) {
			System.out.println("Q3");
		}
		else if(x>0 && y<0) {
			System.out.println("Q4");
		}
	
	}
		
	}

	
