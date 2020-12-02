package uri;
import java.util.*;

public class MainClass {
	public static void main(String[] args) {
	
		Scanner input=new Scanner(System.in);
		int m,n,sum=0,i,j;
		m=input.nextInt();
		do {
			
			n=input.nextInt();
			
		}while(n<=0);
		
		for(i=1,j=m;i<=n;i++,j++) {
			sum=sum+j;
		}
		System.out.println(sum);
		
		}
	}

	
 
