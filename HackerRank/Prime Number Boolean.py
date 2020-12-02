# Saon Sikder
# Dhaka, Bangladesh

import java.util.Scanner;

public class MainClass {

	public static boolean prime_num(int num) {

		if (num == 1) {
			return false;
		} else if (num == 2) {
			return true;
		} else {
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					return false;
				}
			}
			return true;
		}

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Type a Number :");
		int num = scan.nextInt();

		System.out.println(prime_num(num));

	}

}
