package uri;
import java.util.Scanner;
//happy
public class MainClass_1071 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		
		int n=input.nextInt();
		int m=input.nextInt();
		int sum=0;
		int sub=0;
		int tempmax = 0;
		int tempmin=Math.min(n,m);
		if(tempmin==n) {
			tempmax=m;
		}
		if(tempmin==m) {
			tempmax=n;
		}
		for(int i=tempmin+1;i<tempmax;i++) {
			if(i%2!=0) {
				sum=sum+i;
				
			}		
		}
		System.out.println(sum);	
		
	}

}
