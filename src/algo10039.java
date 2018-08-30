import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 2018-08-30 */

public class algo10039 {
    public static void main(String [] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[5];
        int rslt = 0;
        for(int i = 0; i<arr.length; i++){
            arr[i] = Integer.parseInt(reader.readLine());
        }

        for(int i = 0; i<arr.length; i++){
            arr[i] = arr[i]<40 ? 40 : arr[i];
            rslt+=arr[i];
        }

        System.out.print(rslt/5);

        reader.close();

    }
}
