import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 2018-08-30 */

public class algo2920 {
    public static void main(String [] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean rslt = true;
        int[] arr = new int[8];
        String[] input = reader.readLine().split(" ");

        for(int i = 0; i<arr.length; i++){
            arr[i] = Integer.parseInt(input[i]);
        }

        for(int i = 1; i<arr.length; i++){
            if(arr[0] == 1 ){
                if(arr[i-1]+1 == arr[i]){
                    rslt = true;
                } else {
                    rslt = false;
                    break;
                }
            } else {
                if(arr[i-1]-1 == arr[i]){
                    rslt = true;
                } else {
                    rslt = false;
                    break;
                }
            }
        }

        if(arr[0] == 1 && rslt == true){
            System.out.print("ascending");
        }else if(arr[0] == 8 && rslt == true){
            System.out.print("descending");
        }else{
            System.out.print("mixed");
        }

        reader.close();

    }
}
