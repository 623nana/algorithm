package boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 2018-09-12 */

public class algo1463 {
    public static void main(String [] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        int[] dp = new int[n+1];

        for(int i = 2; i<=n; i++){
            //일단 1을 뺀 횟수를 넣어주고 시작
            dp[i] = dp[i-1] + 1;
            //1을 빼는 방법보다 나누는 방법이 더 적으면 그걸로 바꿔줌
            if(i%2 == 0 && dp[i/2] + 1 < dp[i])
                dp[i] = dp[i/2] + 1;
            //3도 마찬가지
            if(i%3 == 0 && dp[i/3] + 1 < dp[i])
                dp[i] = dp[i/3] + 1;
        }

        System.out.print(dp[n]);

    }
}
