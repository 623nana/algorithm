package boj;
/* 2018-09-04 */

import java.util.Scanner;

public class algo1978 {
    public static void main(String [] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] num = new int[n];
        int cnt = 0;
        int sNum;

        for(int i = 0; i<num.length; i++){
            num[i] = scan.nextInt();
        }

        for(int i = 0; i<num.length; i++){
            sNum = 0;
            for(int j = 1; j<=num[i]; j++){
                if(num[i]%j == 0) {
                    sNum++;
                }
            }
            if(sNum == 2)
                cnt++;
        }

        System.out.print(cnt);
    }
}
