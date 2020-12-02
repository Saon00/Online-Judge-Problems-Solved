package uri;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		String nameString=input.nextLine();
		float fixedsalary=input.nextFloat();
		float commission=input.nextFloat();
		
		float result=(float)((commission*15/100)+fixedsalary);
		
		String total=String.format("TOTAL = R$ %.2f",result);
		System.out.println(total);

		
	}

}
