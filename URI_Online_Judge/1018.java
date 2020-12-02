package uri;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		int number=input.nextInt();
		System.out.println(number);
		
		int math100=number/100;
		System.out.println(math100+" nota(s) de R$ 100,00");
		int vagsesh=number%100;
		
		int math50=vagsesh/50;
		System.out.println(math50+" nota(s) de R$ 50,00");
		int vagsesh50=vagsesh%50;
		
		int math20=vagsesh50/20;
		System.out.println(math20+" nota(s) de R$ 20,00");
		int vagsesh20=vagsesh50%20;
		
		int math10=vagsesh20/10;
		System.out.println(math10+" nota(s) de R$ 10,00");
		int vagsesh10=vagsesh20%10;
		
		int math5=vagsesh10/5;
		System.out.println(math5+" nota(s) de R$ 5,00");
		int vagsesh5=vagsesh10%5;
		
		int math2=vagsesh5/2;
		System.out.println(math2+" nota(s) de R$ 2,00");
		int vagsesh2=vagsesh5%2;
	
		int math1=vagsesh2/1;
		System.out.println(math1+" nota(s) de R$ 1,00");
		int vagsesh1=vagsesh2%1;
	
	
	}

}
