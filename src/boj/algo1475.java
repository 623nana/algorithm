package boj;
/* 2018-09-03 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class algo1475 {
    public static void main(String [] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] num = new int[10];

        String input = reader.readLine();
        input = input.replace('9', '6');
        int max = 0;

        for(int i = 0; i<input.length(); i++){
            num[input.charAt(i) - '0']++;
        }

        num[6] = num[6] / 2 + num[6] % 2;

        for(int i : num){
            max = Math.max(max, i);
        }

        System.out.print(max);

    }
}
