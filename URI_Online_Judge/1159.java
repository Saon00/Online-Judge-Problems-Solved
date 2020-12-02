package uri;
import java.util.*;

public class MainClass {                                                               //md. saon sikder
	public static void main(String[] args) {
	
		Scanner input=new Scanner(System.in);
		
		int count=0,i,j,k=0,n,sum=0;
		//n=input.nextInt();
		
		while((n=input.nextInt())!=0) {
			if(n%2==0) {
				for(i=n;i<=n+8;i=i+2) {
					sum=sum+i;
				}
				
			}
			else {
				for(i=n+1;i<=n+9;i=i+2) {
					sum=sum+i;
				}
				
			}
			System.out.println(sum);
			sum=0;
			
		}
		
		}
	}

	
 
