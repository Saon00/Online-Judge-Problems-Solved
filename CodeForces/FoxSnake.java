package com.blackosra;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), m = scan.nextInt();
        scan.close();

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= m; col++) {

                // this part is for "#"
                // row%2==1 -> for odd rows, they'll be "####"
                // row%4==0 && col==1 -> for even rows, there will be "#" at the begin
                // row%4==2 && col==m -> for even rows, there will be "#" at the end

                if (row % 2 == 1 || (row % 4 == 0 && col == 1) || (row % 4 == 2 && col == m)) {
                    System.out.print("#");
                } else
                    System.out.print(".");
            }
            System.out.println();
        }
    }
}

// https://codeforces.com/problemset/problem/510/A
