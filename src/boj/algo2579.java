package boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* 2018-09-11 */

public class algo2579 {
    public static void main(String [] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(reader.readLine());
        int[] stair = new int[n+1];
        int[] dp = new int[n+1];

        for(int i = 1; i<=n;i++){
            st = new StringTokenizer(reader.readLine());
            stair[i] = Integer.parseInt(st.nextToken());
        }

        dp[1] = stair[1];
        //거꾸로 생각해서 그런건가,,,어차피 최소가 안나오니까..?
        if(n>=2) dp[2] = dp[1] + stair[2]; // 2번째 계단은 무조건 1번째 계단을 밟는건가..?

        for(int i = 3; i<=n; i++){
            dp[i] = Math.max(dp[i-2] + stair[i], dp[i-3] + stair[i-1] + stair[i]);
        }

        System.out.println(dp[n]);

    }
}
