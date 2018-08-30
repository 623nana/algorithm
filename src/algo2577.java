
/* 2018-08-30 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class algo2577 {
    public static void main(String [] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(reader.readLine());
        int B = Integer.parseInt(reader.readLine());
        int C = Integer.parseInt(reader.readLine());

        int[] arr = new int[10];

        String s = Integer.toString(A*B*C);

        for(int i = 0; i<s.length(); i++){
            arr[(s.charAt(i) - '0')]++;
        }

        for(int i = 0; i<10; i++){
            System.out.println(arr[i]);
        }
    }
}
