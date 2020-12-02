import java.util.Scanner;

public class MainClass_1010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		//intput for product 1
		 
		int p1=scanner.nextInt();
		int q1=scanner.nextInt();
		float pr1=scanner.nextFloat();
		float sum1=q1*pr1;
		//intput for product 2
		int p2=scanner.nextInt();
		int q2=scanner.nextInt();
		float pr2=scanner.nextFloat();
		float sum2=q2*pr2;
		
		float sum=sum1+sum2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f",sum);
		
	}

}
