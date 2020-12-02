package uri;
import java.util.*;
//happy
public class MainClass {  //md. saon sikder
	public static void main(String[] args) {
	
		Scanner input=new Scanner(System.in);
		int x,z,sum=0,i,count=1;
		x=input.nextInt();
		if(x<0) {
			count=0;
		}
		else {
		do {
			z=input.nextInt();	
		}while(z<=x);
		
		for(i=x;i<=z;i++) {
			sum=sum+i;
			if(sum<z) {
				count++;
			}
			else {
				break;
			}
		}
		}
		System.out.println(count);
		
		
		
		}
	}

	
 
