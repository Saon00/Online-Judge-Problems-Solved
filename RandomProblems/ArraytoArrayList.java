import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
	public static void main(String[] args) {

		String[] nameArray = { "Saon", "Badhon", "Srabon", "Sikder", "Lamia" };
		for (String result : nameArray) {
			System.out.print(result + " ");
		}
		ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(nameArray));
		System.out.println("\n" + arrayList);

	}
}
