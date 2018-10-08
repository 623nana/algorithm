package boj;
/* 2018-09-04 */

import java.util.ArrayList;
import java.util.Scanner;

public class algo2581 {
    public static void main(String [] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();
        ArrayList list = new ArrayList();

        int sCnt;
        int sum = 0;

        for(int i = n; i <= m; i++){
            sCnt = 0;
            for(int j = 1; j<=i; j++){
                if(i%j == 0) sCnt++;
            }
            if(sCnt == 2) {
                list.add(i);
                sum+= i;
            }
        }

        if(list.size() == 0){
            System.out.print("-1");
        } else {
            System.out.println(sum);
            System.out.println(list.get(0));
        }
    }
}
