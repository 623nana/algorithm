package boj;
/* 2018-09-10 */

import java.util.Scanner;

/* 재귀 더하는 방법으로 하면 시간초과 발생..! */
public class algo1003 {
    public static void main(String [] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int[][] fibo = new int[41][2];
        fibo[0][0] = 1;
        fibo[1][1] = 1;

        for(int i = 2 ; i < 41; i++){
            for(int j = 0; j<2; j++){
                fibo[i][j] = fibo[i-1][j] + fibo[i-2][j];
            }
        }

        for(int i = 0; i<n; i++){
            int a = scan.nextInt();
            System.out.println(fibo[a][0]+ " "+ fibo[a][1]);
        }
    }
}
