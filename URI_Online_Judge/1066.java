package uri;


import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		int i,n,even=0,odd=0,positive=0,negative=0;
		
		for(i=1;i<=5;i++) {
			
			n=input.nextInt();
			if(n%2==0) {
				even++;
			}
			if(n%2!=0) {
				odd++;
			}
			if(n>0) {
				positive++;
			}
			if(n<0) {
				negative++;
			}
		}
		
		
		
		  System.out.println(even+" valor(es) par(es)");
		  System.out.println(odd+" valor(es) impar(es)");
		  System.out.println(positive+" valor(es) positivo(s)");
		  System.out.println(negative+" valor(es) negativo(s)");
	}
		
	}

	
 
