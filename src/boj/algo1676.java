package boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* 2018-09-19 */

public class algo1676 {
    public static void main(String [] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());

        int n = Integer.parseInt(st.nextToken());
        int cnt = 0;
        int num = 0;

        for(int i = 1; i<=n; i++){
            num = i;
            while(num%2 == 0 || num% 5 ==0) {
                if (num % 2 == 0) num /= 2;
                if (num % 5 == 0) {
                    num /= 5;
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
