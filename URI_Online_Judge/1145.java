package uri;
// happy
import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner io=new Scanner(System.in);
		
		int i,n,m;
		n=io.nextInt();
		m=io.nextInt();
		
		for(i=1;i<=m;i++) {
			System.out.print(i);
			if(i%n==0) {
				System.out.println();
			}
			else {
				System.out.print(" ");
			}
		}
		
	}
		
	}

	
 
