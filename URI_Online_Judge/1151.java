package uri;
// Fibonacci
import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner input=new Scanner(System.in);
		
		int first=0,second=1;
		int fibo;
		
		int n=input.nextInt();
		System.out.print(first+" "+second);
		for(int i=3;i<=n;i++) {
			
			fibo=first+second;
			System.out.print(" "+fibo);
			first=second;
			second=fibo;
		}
	
		System.out.println();
	}
		
	}

	
 
