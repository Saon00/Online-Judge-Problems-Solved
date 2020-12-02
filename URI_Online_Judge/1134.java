package uri;
import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner io=new Scanner(System.in);
		
		int alcohol=0,gasoline=0,diesel=0;
		int i,n=0,a;
		
		while(n!=4) {
			a=io.nextInt();
			
			if(a==1) {
				alcohol++;
			}
			else if(a==2) {
				gasoline++;
			}
			else if(a==3) {
				diesel++;
			}
			else if(a==4) {
				n=4;
			}
			
		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: "+alcohol); 
		System.out.println("Gasolina: "+gasoline);
		System.out.println("Diesel: "+diesel);
		
		
		
		
	}
		
	}

	
 
