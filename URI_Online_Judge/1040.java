package uri;
/* This Solve shows 5% error in Uri. But the outputs are correct.
 * 
 * Thank You
 */

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		float n1=input.nextFloat();
		float n2=input.nextFloat();
		float n3=input.nextFloat();
		float n4=input.nextFloat();
		
		float mediaavg=((n1*2)+(n2*3)+(n3*4)+(n4*1))/(10);
		System.out.println("Media: "+mediaavg);
		
		if(mediaavg>=7.0) {
			System.out.println("Aluno aprovado.");
			
		}
		else if (mediaavg<5.0) {
			System.out.println("Aluno reprovado.");
		}
		else if (mediaavg>=5.0 && mediaavg<=6.9) {
			System.out.println("Aluno em exame.");
			float examscore=input.nextFloat();
			System.out.println("Nota do exame: "+examscore);
			
			float newavg=(mediaavg+examscore)/2;
			if(newavg>=5.0) {
				System.out.println("Aluno aprovado.");
			}
			else if (newavg<=4.9) {
				System.out.println("Aluno reprovado.");
			}
			System.out.println("Media final: "+newavg);
		}
		
		
		
	}

	}
