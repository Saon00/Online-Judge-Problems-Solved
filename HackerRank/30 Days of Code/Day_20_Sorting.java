import java.util.*;

public class MainClass_1118 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}
		int swapNumber = 0;
		for (int lastIndex = a.length - 1; lastIndex > 0; lastIndex--) {
			for (int i = 0; i < lastIndex; i++) {
				if (a[i] > a[i + 1]) {
					swap(a, i, i + 1);
					swapNumber++;
				}
			}
		}
		System.out.printf("Array is sorted in %d swaps.\n", swapNumber);
		System.out.println("First Element: " + a[0]);
		System.out.println("Last Element: " + a[a.length - 1]);
	}

	public static void swap(int array[], int i, int j) {
		if (i == j) {
			return;
		}
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
}
