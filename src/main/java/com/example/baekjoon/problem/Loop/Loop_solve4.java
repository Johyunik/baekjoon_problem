package com.example.baekjoon.problem.Loop;

import java.util.Scanner;

public class Loop_solve4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=0; i<n/4; i++) {
            System.out.print("long ");
        }
        System.out.println("int");
    }
}
