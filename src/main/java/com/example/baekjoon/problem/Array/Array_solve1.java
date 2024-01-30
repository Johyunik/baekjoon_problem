package com.example.baekjoon.problem.Array;

import java.util.Scanner;

public class Array_solve1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] array = new int[n];

        for(int i=0; i<array.length; i++) {
            int v = sc.nextInt();
            array[i] = v;
        }

        int count = 0;
        int search = sc.nextInt();
        for(int k=0; k<array.length; k++) {
            if(search == array[k]) {
                count++;
            }
        }

        System.out.println(count);

    }
}
