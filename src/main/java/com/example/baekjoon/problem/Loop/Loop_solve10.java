package com.example.baekjoon.problem.Loop;

import java.util.Scanner;

public class Loop_solve10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a == 0 && b == 0) {
                return;
            }

            System.out.println(a+b);


        }
    }
}
