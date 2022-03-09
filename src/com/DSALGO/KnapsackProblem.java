package com.DSALGO;
import java.util.Scanner;

public class KnapsackProblem {
    static int knapSack(int n, int val[],int wts[], int cap) {
        int dp[][] = new int[n+1][cap+1];
        for(int i = 1; i < dp.length; i++) {
            for(int j = 1; j < dp[i].length; j++) {
                if(j >= wts[i-1]) {
                    if(dp[i-1][j - wts[i-1]] + val[i-1] > dp[i-1][j]) {
                        dp[i][j] = dp[i-1][j-wts[i-1]] + val[i-1];
                    }
                    else {
                        dp[i][j] = dp[i-1][j];
                    }
                }
            }
        }
        return dp[n][cap];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int val[] = {20,50,60,35,40};
       int wts[] = {3,1,2,5,4};
       int res = knapSack(val.length,val,wts,10);
        System.out.println(res);
    }
}
