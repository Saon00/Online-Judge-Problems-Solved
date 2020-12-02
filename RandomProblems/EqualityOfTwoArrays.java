// Java Array Exercises: Test the equality of two arrays
public class Solution {
	public static void main(String[] args) {

		int[] array1 = { 1, 2, 4, 6, 8, 6 };
		int[] array2 = { 1, 2, 4, 6, 8, 6, 3, 1 };
		int[] array3 = { 1, 2, 4, 34, 8, 6 };
		int[] array5 = { 1, 2, 4, 34, 8, 6 };
		int[] array4 = { 1, 2, 4, 6, 8, 8, 3, 1 };

		equalityChecking(array1, array2);
		equalityChecking(array2, array3);
		equalityChecking(array5, array3);
		equalityChecking(array5, array4);

	}

	public static void equalityChecking(int[] array1, int[] array2) {
		boolean equal = true;

		if (array1.length == array2.length) {
			for (int i = 0; i < array1.length; i++) {
				if (array1[i] != array2[i]) {
					equal = false;
				}
			}
		} else {
			equal = false;
		}

		if (equal) {
			System.out.println("Equal");
		} else {
			System.out.println("Not equal");
		}
	}
}
