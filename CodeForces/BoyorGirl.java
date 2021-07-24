import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println(scan.nextLine().chars().distinct().count() % 2 == 0 ? "CHAT WITH HER!" : "IGNORE HIM!");

    }
}

// https://codeforces.com/problemset/problem/236/A
