package boj;
/* 2018-09-02 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class algo2941 {
    public static void main(String [] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] cro = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        String input = reader.readLine();

        for(int i = 0; i<cro.length; i++){
            //input내에 있는 cro에 해당하는 문자열을 모두 'a'로 바꿈.
            input = input.replace(cro[i], "a");
        }

        System.out.print(input.length());
    }
}
