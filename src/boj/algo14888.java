package boj;

import java.util.Scanner;

public class algo14888 {
    static int[] arr;
    static boolean[] visited;
    static int[] op;
    static int N, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
    public static void main(String [] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        arr = new int[N];
        visited = new boolean[N];
        op = new int[N-1];
        int idx = 0;

        for(int i = 0 ; i < arr.length; i++)
            arr[i] = sc.nextInt();

        for(int i = 0; i < 4; i++){
            int cnt = sc.nextInt();
            for(int j = 0; j<cnt; j++){
                op[idx++] = i+1;
            }
        }

        dfs(0, 1, arr[0], 0);
        System.out.println(max);
        System.out.println(min);

    }

    static void dfs(int v, int idx, int num, int len){
        int rslt = 0;
        // 부호 다 뽑았으면 계산하기
        if(len == N-1){
            max = num > max ? num : max;
            min = num < min ? num : min;
        } else {
            for(int i = 0 ; i < N-1; i++){
                if(!visited[i]){
                    switch(op[i]){
                        case 1:
                            rslt = num + arr[idx];
                            break;
                        case 2:
                            rslt = num - arr[idx];
                            break;
                        case 3:
                            rslt = num * arr[idx];
                            break;
                        case 4:
                            rslt = num / arr[idx];
                            break;
                    }
                    visited[i] = true;
                    dfs(i, idx+1, rslt, len+1);
                }
            }
        }
        visited[v] = false;
    }
}
