// Write a Java program to sort a numeric array and a string array

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int[] intArray = new int[5];
		System.out.println("Enter 5 integers");
		for (int i = 0; i < 5; i++) {
			intArray[i] = scanner.nextInt();
		}
		Arrays.sort(intArray);
		for (int result : intArray) {
			System.out.print(result + " ");
		}
		System.out.println("\nEnter 5 characters");
		char[] c = new char[5];
		for (int i = 0; i < c.length; i++) {

			char ch = scanner.next().charAt(0);
			c[i] = ch;
		}
		Arrays.sort(c);
		for (char result : c) {
			System.out.print(result + " ");
		}

	}
}
