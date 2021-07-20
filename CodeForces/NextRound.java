
import java.util.Scanner;

public class NextRound {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt(), k = scan.nextInt();
        int count = 0;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
            if (arr[i] >= arr[k - 1] && arr[i] != 0)
                count++;
        }

        System.out.println(count);

    }
}
