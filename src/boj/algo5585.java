package boj;

import java.util.Scanner;

/* 2018-11-18 */

public class algo5585 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int rslt = 0;
        int i = 0;
        int check = 0;

        int[] change = {500, 100, 50, 10, 5, 1};

        N = 1000 - N;

        while(true){
            check = N/change[i];
            rslt+=check;

            if(check == 0){
                i++;
                continue;
            }
            N = N%change[i];
            if(N == 0) break;
        }

        System.out.print(rslt);
    }
}
