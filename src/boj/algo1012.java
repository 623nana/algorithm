package boj;

import java.util.ArrayList;
import java.util.Scanner;

public class algo1012 {
    static int dx[] = {1, -1, 0, 0};
    static int dy[] = {0, 0, 1, -1};
    static int map[][];
    static int M, N, K;
    static int cnt = 0;
    static Scanner scan;
    public static void main(String [] args) throws Exception {
        scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = scan.nextInt();

        while(n-->0){
            cnt = 0;
            list.add(func());
        }
        for(int i : list){
            System.out.println(i);
        }

    }

    public static int func(){
        M = scan.nextInt();
        N = scan.nextInt();
        K = scan.nextInt();
        map = new int[N][M];

        for(int i = 0; i<K; i++){
            int a = scan.nextInt();
            int b = scan.nextInt();
            map[b][a] = 1;
        }

        for(int i = 0; i<N; i++){
            for(int j = 0; j<M; j++){
                if(map[i][j] == 1){
                    cnt++;
                    dfs(i, j);
                }
            }
        }
        return cnt;
    }

    public static void dfs(int x, int y){
        map[x][y] = 0;

        for(int i = 0 ;i < 4; i++){
            int ax = x + dx[i];
            int ay = y + dy[i];

            if(ax>=0 && ay>=0 && ax < N && ay<M){
                if(map[ax][ay] == 1){
                    dfs(ax,ay);
                }
            }
        }
    }
}
