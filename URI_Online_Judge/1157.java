package uri;
import java.util.*;

public class MainClass {
	public static void main(String[] args) {
	
		Scanner input=new Scanner(System.in);
		int num,i;
		num=input.nextInt();
		for(i=1;i<=num;i++) {
			if(num%i==0) {
				System.out.println(i);
			}
		}
		
		}
	}

	
 
