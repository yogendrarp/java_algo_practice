package stacks_queue;

import java.util.Arrays;

public class PerfectSquares279 {
    public int numSquares(int n) {
        int[] dp=new int[n+1];

        Arrays.fill(dp,n);
        dp[0]=0;
        dp[1]=1;
        for(int i=4;i<=n;i++){
            for(int j=1;j*j<=i;j++){
                dp[i]=Math.min(dp[i],1+dp[i-j*j]);
            }
        }
        return dp[n];
    }
}
