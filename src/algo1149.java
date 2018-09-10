
/* 2018-09-10 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class algo1149 {
    public static void main(String [] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(reader.readLine());
        int[][] rgb = new int[3][n+1];
        int r, g, b = 0;

        for(int i = 1; i<=n; i++){
            st = new StringTokenizer(reader.readLine());
            r = Integer.parseInt(st.nextToken());
            g = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            rgb[0][i] = Math.min(rgb[1][i-1], rgb[2][i-1]) + r;
            rgb[1][i] = Math.min(rgb[0][i-1], rgb[2][i-1]) + g;
            rgb[2][i] = Math.min(rgb[0][i-1], rgb[1][i-1]) + b;
        }
        System.out.print(Math.min(rgb[0][n], Math.min(rgb[1][n],rgb[2][n])));
    }
}
