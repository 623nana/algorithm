import java.util.Scanner;

/* 2018-09-14 */

public class algo2675 {
    public static void main(String [] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] a = new int [n];
        String[] b = new String[n];

        for(int i = 0; i < n ; i++){
            a[i] = scan.nextInt();
            b[i] = scan.next();
        }

        for(int i = 0; i<n; i++){
            func(a[i], b[i]);
            System.out.println();
        }


    }

    public static void func(int n, String input){

        String[] arr = input.split("");

        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<n ; j++) {
                System.out.print(arr[i]);
            }
        }
    }
}
