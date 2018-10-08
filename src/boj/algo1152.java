package boj;
/* 2018-08-30 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class algo1152 {
    public static void main(String [] args) throws Exception {
        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );
        String input = reader.readLine().trim(); // 앞뒤 공백이 입력된 경우를 위해 trim() 필요!

        if(input.isEmpty()){ //입력값이 없는 경우 처리를 위해 꼭 필요함.
            System.out.print(0);
        }else {
            System.out.print(input.split(" ").length);
        }
        reader.close();
    }
}
