package uri;

// My answer shows 15% error.But I don't find any mistake. Can you inform me the error ?

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc=new Scanner(System.in);
		
		String name1=sc.nextLine();
		String name2=sc.nextLine();
		String name3=sc.nextLine();
		
		if(name1.equals("vertebrado")) {
			
			if(name2.equals("ave")) {
				
				if(name3.equals("carnivoro")) {
					System.out.println("aguia");
				}
				else {
					System.out.println("pomba");
				}
				
				
			}
			
			else if (name2.equals("mamifero")) {
				
				if(name3.equals("onivoro")) {
					System.out.println("homem");
				}
				else {
					System.out.println("vaca");
				}
				
				
			}
		
			
			
			
		}
		
		else if(name1.equals("invertebrado")) {
			
			if(name2.equals("inseto")) {
				
				if(name3.equals("hematofago")) {
					System.out.println("pulga");
				}
				else {
					System.out.println("lagarta");
				}
				
			}
			
			else if(name2.equals("anelideo")) {
				if(name3.equals("hematofoga")) {
					System.out.println("sanguessuga");
				}
				else {
					System.out.println("minhoca");
				}
			}
			
		}
		
	
		
	}
		
	}

	
 
