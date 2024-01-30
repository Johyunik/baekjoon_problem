package com.example.baekjoon.problem.Array;

import java.util.Scanner;

public class Array_solve2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int X = sc.nextInt();
        int[] A = new int[N];

        for(int i=0; i<A.length; i++) {
            A[i] = sc.nextInt();
        }

        for(int k=0; k<A.length; k++) {
            if(A[k] < X) {
                System.out.print(A[k] + " ");
            }
        }
    }
}
