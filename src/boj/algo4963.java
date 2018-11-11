package boj;

import java.util.Scanner;

/* 2018-11-11 */

public class algo4963 {
    static int map[][];
    static boolean visited[][];
    static int dx[] = {0, 0, 1, -1, 1, -1, 1, -1};
    static int dy[] = {1, -1, 0, 0, -1, 1, 1, -1};
    static int w;
    static int h;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        while (true) {
            w = sc.nextInt();
            h = sc.nextInt();

            if(w == 0 && h ==0) break;

            map = new int[h][w];
            visited = new boolean[h][w];

            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    map[i][j] = sc.nextInt();
                }
            }
            int cnt = 0;

            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (!visited[i][j] && map[i][j] == 1) {
                        cnt++;
                        dfs(i, j);
                    }
                }
            }
            sb.append(cnt + "\n");
        }
        System.out.print(sb);
    }

    static void dfs(int x, int y){
        visited[x][y] = true;
        for(int i = 0; i<8; i++){
            int nx = dx[i] + x;
            int ny = dy[i] + y;
            if(nx >= 0 && ny >= 0 && nx < h && ny < w){
                if(visited[nx][ny] == false && map[nx][ny] == 1){
                    dfs(nx, ny);
                }
            }
        }
    }
}
