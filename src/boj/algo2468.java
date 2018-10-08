package boj;

import java.util.Scanner;

/* 2018-10-05 */

public class algo2468 {
    static int map[][];
    static boolean visited[][];
    static int N;
    static int dx[] = {1, -1, 0, 0};
    static int dy[] = {0, 0, 1, -1};

    public static void main(String [] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        N = scan.nextInt();
        map = new int[N][N];
        int max = 0;
        int min = 123135;
        int rslt = 1;

        for(int i = 0; i<N; i++){
            for(int j = 0; j<N; j++){
                map[i][j] = scan.nextInt();
                max = max < map[i][j] ? map[i][j] : max;
                min = min > map[i][j] ? map[i][j] : min;
            }
        }

        for(int i = min; i<=max; i++){
            visited = new boolean[N][N];
            int cnt = 0;
            for(int j = 0; j<N; j++){
                for(int k = 0; k<N; k++){
                    if(map[j][k] > i && !visited[j][k]) {
                        cnt++;
                        dfs(j, k, i);
                    }
                }
            }
            rslt = rslt < cnt ? cnt : rslt;
        }
        System.out.println(rslt);
    }

    static void dfs(int x, int y, int h){
        visited[x][y] = true;
        for(int i = 0; i<4; i++){
            int ax = x + dx[i];
            int ay = y + dy[i];
            if(ax >= 0 && ay >= 0 && ax < N && ay < N){
                if(map[ax][ay] > h && !visited[ax][ay]){
                    dfs(ax, ay, h);
                }
            }
        }
    }
}
