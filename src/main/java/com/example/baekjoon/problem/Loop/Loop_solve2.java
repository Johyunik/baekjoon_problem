package com.example.baekjoon.problem.Loop;

import java.util.Scanner;

public class Loop_solve2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n = sc.nextInt();

        for(int i=1; i<=n; i++) {
            sum += i;

        }
        System.out.println(sum);
    }
}
