package com.example.baekjoon.problem.Loop;

import java.util.Scanner;

public class Loop_solve3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        int total = sc.nextInt();
        int n = sc.nextInt();

        for(int i=1; i<=n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            sum += (a * b);
        }
        if( total == sum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
