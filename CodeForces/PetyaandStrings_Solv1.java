import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String name1 = scan.nextLine().toLowerCase();
        String name2 = scan.nextLine().toLowerCase();
        String[] arr = {name1, name2};

        if (name1.equalsIgnoreCase(name2))
            System.out.println(0);
        else {
            Arrays.sort(arr, String.CASE_INSENSITIVE_ORDER);

            if (arr[1].equals(name1))
                System.out.println(1);
            else
                System.out.println(-1);
        }
        
    }
}

// https://codeforces.com/problemset/problem/112/A
