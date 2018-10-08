package boj;

import java.util.Scanner;

/* 2018-09-02 */

public class algo2908 {
    public static void main(String [] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        String[] a = scan.next().split("");
        String[] b = scan.next().split("");

        int n = Integer.parseInt(a[2])*100+Integer.parseInt(a[1])*10+Integer.parseInt(a[0]);
        int m = Integer.parseInt(b[2])*100+Integer.parseInt(b[1])*10+Integer.parseInt(b[0]);

        System.out.print((n>m)? n: m);

    }
}
