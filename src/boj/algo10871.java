package boj;

import java.util.Scanner;

/* 2018-09-14 */
public class algo10871 {
    public static void main(String [] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        int input = scan.nextInt();

        int[] arr = new int[num];

        for(int i = 0; i<arr.length; i++){
            arr[i] = scan.nextInt();
        }

        for(int i = 0; i<arr.length; i++){
            if(arr[i] < input)
                System.out.print(arr[i] + " ");
        }
    }
}
