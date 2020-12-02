package uri;


import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		int start=input.nextInt();
		int end=input.nextInt();
		
		int duration = end-start;
		
		 if(duration<0) {
			int dur=24+duration;
			System.out.println("O JOGO DUROU "+dur+" HORA(S)");
		}
		
		 else if(start==end) {
			System.out.println("O JOGO DUROU 24 HORA(S)");
		}
		 else {
			 System.out.println("O JOGO DUROU "+duration+" HORA(S)");
		}
		
	}
		
	}

	
