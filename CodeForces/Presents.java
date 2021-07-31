// not recommended: 686ms & 24000KB

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Map<Integer, Integer> map = new HashMap<>();
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            map.put(scan.nextInt(), i);
        }
        for (int i : map.keySet()) {
            System.out.print(map.get(i) + " ");
        }
    }
}

// https://codeforces.com/problemset/problem/136/A
