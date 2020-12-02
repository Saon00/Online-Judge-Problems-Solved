package uri;


import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		int a=input.nextInt();
		int b=input.nextInt();
		
		int c=b%a;
		int d=a%b;
		if(c==0 || d==0) {
			System.out.println("Sao Multiplos");
		}
		else {
			System.out.println("Nao sao Multiplos");
		}
	
	}
		
	}

	
