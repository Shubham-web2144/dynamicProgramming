package com.DSALGO;

public class Main {


    public static void main(String[] args) {
	// write your code here
        printFib(0,1,5);
        System.out.println("-----");
        fib(5);
        System.out.println("-----");
        System.out.println(printFibDy(5));
    }
    static void printFib(int a, int b, int n) {
        if(n < b) return;
        int s = a + b;
        System.out.print(s + " ");
        printFib(b,s,n);
    }
    static void fib(int n) {
        int a = 0;
        int b = 1;
        int sum = 0;
        while (b < n) {
            sum = a + b;
            System.out.print(sum + " ");
            a = b;
            b = sum;
        }
    }
    static int printFibDy(int n) {
        int DP[] = new int[n+1];
        DP[0] = 0;
        DP[1] = 1;
        for(int i = 2; i <= n; i++) {
            DP[i] = DP[i - 1] + DP[i - 2];
        }
        return DP[n];
    }
}
