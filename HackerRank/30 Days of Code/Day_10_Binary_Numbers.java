# for int[] go to leetcode fun with array

import java.util.Scanner;

public class MainClass_1118 {
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		
		int decimal = scanner.nextInt();
		String binary = Integer.toBinaryString(decimal);
//		System.out.println(binary);
		int number = 0;
		int maxNumber=0;
		String[] binaryString = binary.split("0");
		for(int i=0;i<binaryString.length;i++) {
			if(number<binaryString[i].length()) {
				number=binaryString[i].length();
			}
		}
		System.out.println(number);
		scanner.close();
		
	}
	
}
