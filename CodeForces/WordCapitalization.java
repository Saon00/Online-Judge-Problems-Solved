import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        System.out.println(Character.toUpperCase(line.charAt(0)) + line.substring(1));

    }
}

// https://codeforces.com/problemset/problem/281/A
