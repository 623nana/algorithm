package boj;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* 2018-11-17 */

public class algo14891 {
    static String w1[] = new String[8];
    static String w2[] = new String[8];
    static String w3[] = new String[8];
    static String w4[] = new String[8];

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        w1 = sc.next().split("");
        w2 = sc.next().split("");
        w3 = sc.next().split("");
        w4 = sc.next().split("");

        int K = sc.nextInt();

        for (int i = 0; i < K; i++) {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();

            switch (n1) {
                case 1:
                    rA(n2);
                    break;
                case 2:
                    rB(n2);
                    break;
                case 3:
                    rC(n2);
                    break;
                case 4:
                    rD(n2);
                    break;
            }
        }

        int ans = 0;
        ans += w1[0].equals("1") ? 1 : 0;
        ans += w2[0].equals("1") ? 2 : 0;
        ans += w3[0].equals("1") ? 4 : 0;
        ans += w4[0].equals("1") ? 8 : 0;

        System.out.println(ans);


    }

    static void rA(int d) {
        HashMap<String[], Integer> map = new HashMap<>();
        map.put(w1, d);

        if (!w1[2].equals(w2[6])) {
            map.put(w2, -d);
            if (!w2[2].equals(w3[6])) {
                map.put(w3, d);
                if (!w3[2].equals(w4[6])) {
                    map.put(w4, -d);
                }
            }
        }
        for(Map.Entry<String[], Integer> e : map.entrySet()){
            rotate(e.getKey(), e.getValue());
        }
    }

    static void rB(int d) {
        HashMap<String[], Integer> map = new HashMap<>();
        map.put(w2, d);

        if (!w2[6].equals(w1[2])) {
            map.put(w1, -d);
        }
        if (!w2[2].equals(w3[6])) {
            map.put(w3, -d);
            if (!w3[2].equals(w4[6])) {
                map.put(w4, d);
            }
        }
        for(Map.Entry<String[], Integer> e : map.entrySet()){
            rotate(e.getKey(), e.getValue());
        }
    }

    static void rC(int d) {
        HashMap<String[], Integer> map = new HashMap<>();
        map.put(w3, d);

        if (!w3[2].equals(w4[6])) {
            map.put(w4, -d);
        }

        if (!w3[6].equals(w2[2])) {
            map.put(w2, -d);
            if (!w2[6].equals(w1[2])) {
                map.put(w1, d);
            }
        }
        for(Map.Entry<String[], Integer> e : map.entrySet()){
            rotate(e.getKey(), e.getValue());
        }
    }

    static void rD(int d) {
        HashMap<String[], Integer> map = new HashMap<>();
        map.put(w4, d);

        if (!w4[6].equals(w3[2])) {
            map.put(w3, -d);
            if (!w3[6].equals(w2[2])) {
                map.put(w2, d);
                if (!w2[6].equals(w1[2])) {
                    map.put(w1, -d);
                }
            }
        }
        for(Map.Entry<String[], Integer> e : map.entrySet()){
            rotate(e.getKey(), e.getValue());
        }
    }

    static void rotate(String[] arr, int d) {
        String tmp[] = new String[8];
        if (d == 1) {
            for (int i = 0; i < 7; i++) {
                tmp[i + 1] = arr[i];
            }
            tmp[0] = arr[7];

            for (int i = 0; i < 8; i++) {
                arr[i] = tmp[i];
            }
        }
        if (d == -1) {
            for (int i = 1; i < 8; i++) {
                tmp[i - 1] = arr[i];
            }
            tmp[7] = arr[0];

            for (int i = 0; i < 8; i++) {
                arr[i] = tmp[i];
            }
        }
    }
}