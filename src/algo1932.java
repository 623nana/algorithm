
/* 2018-09-11 */

import java.util.Scanner;

public class algo1932 {
    public static void main(String [] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[][] dp = new int[n+1][n+1];
        int rslt = 0;

        for(int i = 1; i<=n; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i][j] = scan.nextInt();
                if(j == 1)
                    dp[i][j] = dp[i-1][j] + dp[i][j];
                else if(j == i)
                    dp[i][j] = dp[i-1][j-1] + dp[i][j];
                else
                    dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-1]) + dp[i][j];

                rslt = rslt < dp[i][j] ? dp[i][j] : rslt;
            }
        }

        System.out.print(rslt);
    }
}
