package boj;

import java.util.Scanner;

/* 2018-10-30 */

public class algo14503 {
    static int N;
    static int M;
    static int map[][];
    static int cnt = 1;
    static int dx[] = {-1, 0, 1, 0};
    static int dy[] = {0, 1, 0, -1};
    public static void main(String [] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        map = new int[N][M];
        int r = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        for(int i = 0; i<N;i++){
            for(int j = 0; j<M; j++){
                map[i][j] = sc.nextInt();
            }
        }
        dfs(r, c, d);
        System.out.print(cnt);

   }

   static void dfs(int x, int y, int d){
        // 1. 현재 위치 청소
        map[x][y] = 2;
        for(int i = 0; i<4; i++){
            d = (d + 3) % 4; // 2. 왼쪽으로 회전
            // 왼쪽으로 이동하는 좌표
            int nx = x + dx[d];
            int ny = y + dy[d];
            // 왼쪽으로 청소가 가능한 경우, 왼쪽으로 이동하고 왼쪽 방향으로 회전
            if(nx >= 0 && ny >= 0 && nx < N && ny < M && map[nx][ny] == 0){
                cnt++;
                dfs(nx, ny, d);
                return;
            }
        }

        int back = (d + 2) % 4; // 후진 반대방향으로
       int nx = x + dx[back];
       int ny = y + dy[back];
       if(nx >= 0 && ny >= 0 && nx < N && ny < M && map[nx][ny] != 1){
           // 네방향 모두 청소가 되어있는 경우, 방향 유지하고 후진
           dfs(nx, ny, d);
       }
   }

}
