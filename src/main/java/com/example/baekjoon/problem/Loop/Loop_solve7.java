package com.example.baekjoon.problem.Loop;

import java.io.*;
import java.util.Scanner;


public class Loop_solve7 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println("Case #" + i + ": " + a + " + " + b + " = " + (a+b));
        }

    }
}
