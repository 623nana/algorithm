import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* 2018-09-18 */

public class algo11050 {
    public static void main(String [] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());

        int n = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        System.out.print(comb(n, r));

    }
    public static int comb(int n, int r){
        if(n == r || r == 0) return 1;
        else return comb(n-1, r-1) + comb(n-1, r);
    }
}
