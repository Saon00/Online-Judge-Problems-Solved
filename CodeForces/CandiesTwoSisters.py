t = int(input())

while t > 0:
    n = int(input())
    if n < 3:
        print(0)
    else:
        if n % 2 != 0:
            a = (n // 2) + 1
            print(int(n - a))
        else:
            a = (n / 2) + 1
            print(int(n - a))
    t -= 1

# https://codeforces.com/problemset/problem/1335/A

""" Java-Collected

import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        while (t-- > 0) {
            System.out.println((scan.nextInt() - 1) / 2);
        } } }
"""
