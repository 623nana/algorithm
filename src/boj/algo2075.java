package boj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/* 2018-11-12 */

public class algo2075 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i< N; i++){
            for(int j = 0 ; j<N; j++){
                int a = sc.nextInt();
                list.add(a);
            }
        }
        Collections.sort(list);
        System.out.println(list.get(list.size()-N));
    }
}
