package com.example.baekjoon.calculation;


import java.util.Scanner;

public class If_solve {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int M = sc.nextInt();
        int M2 = sc.nextInt();

        H += M2 / 60;
        M += M2 % 60;

        if ( M >= 60 ) {
            H += 1;
            M -= 60;
        }

        if ( H >= 24 ) {
            H -= 24;
        }
        System.out.println(H + " " +  M);
    }
}
