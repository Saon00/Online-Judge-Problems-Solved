import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String name1 = scan.nextLine().toLowerCase();
        String name2 = scan.nextLine().toLowerCase();

        if (name1.equalsIgnoreCase(name2)) System.out.println(0);
        else {
            for (int i = 0; i < name1.length(); i++) {
                if (name1.charAt(i) < name2.charAt(i)) {
                    System.out.println(-1);
                    break;
                } if (name1.charAt(i) >  name2.charAt(i)) {
                    System.out.println(1);
                    break;
                }
            }
        }

    }
}

// https://codeforces.com/problemset/problem/112/A
