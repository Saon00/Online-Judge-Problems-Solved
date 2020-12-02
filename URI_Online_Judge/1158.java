package uri;
/*  this code will show Time limit exceeded. But the output is Correct.
  happy
*/
import java.util.*;
public class MainClass { 													//md. saon sikder
	public static void main(String[] args) {
	
		Scanner input=new Scanner(System.in);
		
		int count=0,i,j,k=0,n,sum=0;
		n=input.nextInt();
		
		for(j=1;j<=n;j++) {
		int a=input.nextInt();
		int b=input.nextInt();
			if(count==b) {
				count=1;
			}
			else {
				count=3;
			}
		while(count!=n) {
			
			if(a%2==0) {
				for(k=1,i=a+1;k<b+1;k++,i=i+2) {
					sum=sum+i;
				}
			}
			else {
				for(k=1,i=a;k<b+1;k++,i=i+2) {
					sum=sum+i;
				}
			}
			System.out.println(sum);
			sum=0;
			count=2;
		}

		
		}
		}
	}

	
 
