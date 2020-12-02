package uri;


import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		float salary=input.nextFloat();
		
		float math,beton;
		
		if(salary>=0 && salary<=400.00) {
		math=(salary*15)/100;
		beton=salary+math;
		System.out.printf("Novo salario: %.2f\n",beton);
		System.out.printf("Reajuste ganho: %.2f\n",math);
		System.out.println("Em percentual: 15 %");
		}
		
		if(salary>=400.01 && salary<=800.00) {
			math=(salary*12)/100;
			beton=salary+math;
			System.out.printf("Novo salario: %.2f\n",beton);
			System.out.printf("Reajuste ganho: %.2f\n",math);
			System.out.println("Em percentual: 12 %");
			}
		
		if(salary>=800.01 && salary<=1200.00) {
			math=(salary*10)/100;
			beton=salary+math;
			System.out.printf("Novo salario: %.2f\n",beton);
			System.out.printf("Reajuste ganho: %.2f\n",math);
			System.out.println("Em percentual: 10 %");
			}
		
		if(salary>=1200.01 && salary<=2000.00) {
			math=(salary*7)/100;
			beton=salary+math;
			System.out.printf("Novo salario: %.2f\n",beton);
			System.out.printf("Reajuste ganho: %.2f\n",math);
			System.out.println("Em percentual: 7 %");
			}
		
		if(salary>2000.00) {
			math=(salary*4)/100;
			beton=salary+math;
			System.out.printf("Novo salario: %.2f\n",beton);
			System.out.printf("Reajuste ganho: %.2f\n",math);
			System.out.println("Em percentual: 4 %");
			}
	}
		
	}

	
