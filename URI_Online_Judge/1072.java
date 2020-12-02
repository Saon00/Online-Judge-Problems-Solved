package uri;
import java.util.*;

public class MainClass {
	public static void main(String[] args) {
	
		Scanner input=new Scanner(System.in);
		
		int howmany,n1,n2,loopend=0,in=0,out=0;
		howmany=input.nextInt();
		
		for(int i=1;i<=howmany;i++) {
			n1=input.nextInt();
			if(n1>=10 && n1<=20) {
				in++;
			}
			else {
				out++;
			}
		}
		
		System.out.println(in+" in");
		System.out.println(out+" out");
		
		
		}
	}

	
 
