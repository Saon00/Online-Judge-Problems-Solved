package uri;
import java.util.*;

public class MainClass {
	public static void main(String[] args) {
	
		Scanner input=new Scanner(System.in);
		int age=0,count=0;
		float sum=0;
		float math=0;
		
		while((age=input.nextInt())>=0) {
			sum=sum+age;
			count++;
			 
		}
		math=sum/count;
		System.out.printf("%.2f\n",math);
		
		}
	}

	
 
