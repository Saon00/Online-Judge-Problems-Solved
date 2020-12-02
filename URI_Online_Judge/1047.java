package uri;


import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		int starthour=input.nextInt();
		int startmin=input.nextInt();
		int endhour=input.nextInt();
		int endmin=input.nextInt();
		
		int durationhour= endhour-starthour;
		int durationmin= endmin-startmin;
	if(starthour==endhour && startmin==endmin) {
		System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
	}
	else if(durationhour>0 && durationmin>=0) {
		String ans1=String.format("O JOGO DUROU %d HORA(S) E %d MINUTO(S)",durationhour,durationmin);
		System.out.println(ans1);
	}
	else if(durationhour>0 && durationmin<0) {
		int newmin1=durationmin+60;
		int newhour1=durationhour-1;
		String ans2=String.format("O JOGO DUROU %d HORA(S) E %d MINUTO(S)",newhour1,newmin1);
		System.out.println(ans2);
	}
	else if(durationhour<0 && durationmin<0) {
		int newhour2=durationhour+24-1;
		int newmin2=durationmin+60;
		String ans3=String.format("O JOGO DUROU %d HORA(S) E %d MINUTO(S)",newhour2,newmin2);
		System.out.println(ans3);
	}
	else if(durationhour<0 && durationmin>0) {
		int newhour3=durationhour+24;
		String ans4=String.format("O JOGO DUROU %d HORA(S) E %d MINUTO(S)",newhour3,durationmin);
		System.out.println(ans4);
	}
	else if(durationhour==0 && durationmin>0) {
		//int newhour4=durationhour+24;
		String ans5=String.format("O JOGO DUROU 0 HORA(S) E %d MINUTO(S)",durationmin);
		System.out.println(ans5);
	}
	else if(durationhour==0 && durationmin<0) {
		int newmin4=durationmin+60;
		String ans4=String.format("O JOGO DUROU 23 HORA(S) E %d MINUTO(S)",newmin4);
		System.out.println(ans4);
	}
		
	}
		
	}

	
