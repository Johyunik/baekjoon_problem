package com.example.baekjoon.problem.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array_solve3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int N = sc.nextInt();
        int[] array = new int[N];

        for(int i=0; i<array.length; i++) {
            array[i] = sc.nextInt();
        }

        sc.close();
        Arrays.sort(array);
        System.out.print(array[0] + " " + array[N - 1]);
    }
}
