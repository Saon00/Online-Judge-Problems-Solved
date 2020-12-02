package uri;

// happy

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner io=new Scanner(System.in);
		
		int inter,gremio,interwin=0,gremiowin=0,loop=0,totalmatch=1,draw=0,confirmation;
		int sum=0;
		while(loop!=2) {
			
			inter=io.nextInt();
			gremio=io.nextInt();
			
			if(inter>gremio) {
				interwin++;
			}
			else if(inter<gremio){
				gremiowin++;
			}
			else {
				draw++;
			}
			System.out.println("Novo grenal (1-sim 2-nao)");
			confirmation=io.nextInt();
			if(confirmation!=2) {
				totalmatch=totalmatch+1;
				loop=0;
				
			}
			else {
				loop=2;
			}
		}
		System.out.println(totalmatch+" grenais");
		System.out.println("Inter:"+interwin);
		System.out.println("Gremio:"+gremiowin);
		System.out.println("Empates:"+draw);
		if(interwin>gremiowin) {
			System.out.println("Inter venceu mais");
		}
		else if(interwin<gremiowin) {
			System.out.println("Gremio venceu mais");
		}
		else {
			System.out.println("Não houve vencedor");
		}
		
		
	}
		
	}

	
 
