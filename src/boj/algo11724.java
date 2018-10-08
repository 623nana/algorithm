package boj;

import java.util.Scanner;

/* 2018-10-02 */

public class algo11724 {
    static int map[][];
    static boolean visited[];
    static int N;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int M = sc.nextInt();
        map = new int[N][N];
        visited = new boolean[N];

        for(int i = 0 ; i < M; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            map[a-1][b-1] = map[b-1][a-1] = 1;
        }
        int cnt = 0;
        for(int i = 0; i<N; i++){
            if(!visited[i]){
                cnt++;
                dfs(i);
            }
        }
        System.out.print(cnt);
    }

    public static void dfs(int x){
        visited[x] = true;
        for(int i = 0; i<N; i++){
            if(map[x][i] == 1 && !visited[i]){
                dfs(i);
            }
        }
    }
}
