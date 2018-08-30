
/* 2018-08-30 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class algo8958 {
    public static void main(String [] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String[] input = null;
        int[] rslt = new int[n];

        for(int i = 0; i < n; i++){
            input = reader.readLine().split("");
            rslt[i] = func(input);
        }

        for(int i = 0; i < n; i++){
            System.out.println(rslt[i]);
        }

        reader.close();
    }

    public static int func(String[] arr){
        int rslt = 0;
        int[] a = new int[arr.length];

        a[0] = arr[0].equals("O")? 1 : 0;

        for(int i = 1; i<arr.length; i++){
            if(arr[i-1].equals("O") && arr[i].equals("O")){
                a[i] = a[i-1]+1;
            }else if(!arr[i].equals("O")){
                a[i] = 0;
            }else{
                a[i] = 1;
            }
        }

        for(int i = 0; i<a.length; i++){
            rslt += a[i];
        }
        return rslt;
    }
}
