package boj;

/* 2018-10-08 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class algo10026 {
    static int N;
    static int dx[] = {1, -1, 0, 0};
    static int dy[] = {0, 0, 1, -1};
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        int[][] map = new int[N][N];
        int[][] iMap = new int[N][N];
        boolean[][] visited = new boolean[N][N];
        boolean[][] iVisited = new boolean[N][N];

        for(int i = 0; i<N; i++){
            String[] str = br.readLine().split("");
            for(int j = 0; j<N; j++){
                if(str[j].equals("R")) {
                    map[i][j] = 0;
                    iMap[i][j] = 0;
                } else if(str[j].equals("G")) {
                    map[i][j] = 1;
                    iMap[i][j] = 0;
                } else {
                    map[i][j] = 2;
                    iMap[i][j] = 2;
                }
            }
        }

        int cnt = 0;
        int iCnt = 0;

        for(int i = 0 ; i<N; i++){
            for(int j = 0; j<N; j++){
                if(!visited[i][j]){
                    cnt++;
                    dfs(i, j, visited, map);
                }
            }
        }

        for(int i = 0 ; i<N; i++){
            for(int j = 0; j<N; j++){
                if(!iVisited[i][j]){
                    iCnt++;
                    dfs(i, j, iVisited, iMap);
                }
            }
        }

        System.out.print(cnt + " " + iCnt);
    }

    static void dfs(int x, int y, boolean visited[][], int map[][]){
        visited[x][y] = true;

        for(int i = 0; i < 4; i++){
            int ax = x + dx[i];
            int ay = y + dy[i];
            if(ax>=0 && ay>=0 && ax < N&& ay < N){
                if(map[ax][ay] == map[x][y] && !visited[ax][ay]){
                    dfs(ax,ay, visited, map);
                }
            }
        }
    }
}
