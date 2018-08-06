import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 2018-08-06 */

public class algo1026 {
    public static void main(String [] args) throws Exception {

        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );
        int n = Integer.parseInt(reader.readLine());
        int[] A = new int[n];
        int[] B = new int[n];

        String[] a = reader.readLine().split(" ");
        String[] b = reader.readLine().split(" ");

        for(int i = 0; i<a.length; i++){
            A[i] = Integer.parseInt(a[i]);
            B[i] = Integer.parseInt(b[i]);
        }

        Arrays.sort(A);
        Arrays.sort(B);
        int rslt = 0;
        for(int i = 0; i<A.length; i++){
            rslt+=A[i]*B[A.length-1-i];
        }

        System.out.print(rslt);

    }
}
