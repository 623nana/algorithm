package boj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/* 2018-11-13 */

public class algo5543 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] ham = new int[3];

        for(int i = 0; i<ham.length; i++){
            ham[i] = sc.nextInt();
        }
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i<3; i++){
            list.add(ham[i]+b1-50);
            list.add(ham[i]+b2-50);
        }

        Collections.sort(list);

        System.out.println(list.get(0));
    }
}
