package boj;

import java.util.HashSet;
import java.util.Scanner;

/* 2018-11-09
*
* 흠......
*
* */

public class algo1987 {
    static int R;
    static int C;
    static String map[][];
    static int dx[] = {0, 0, 1, -1};
    static int dy[] = {1, -1, 0, 0};
    static int max = Integer.MIN_VALUE;
    static int cnt = 0;
    static HashSet<String> hash = new HashSet<>();
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        R = sc.nextInt();
        C = sc.nextInt();
        map = new String[R][C];

        for(int i = 0; i<R; i++){
            map[i] = sc.next().split("");
        }

        hash.add(map[0][0]);
        dfs(0, 0);

        System.out.println(max);
    }

    public static void dfs(int x, int y){
        cnt++;
        max = cnt > max ? cnt : max;
        hash.add(map[x][y]);
        for(int i = 0; i<4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && ny >= 0 && nx < R && ny < C) {
                if (!hash.contains(map[nx][ny])) {
                    dfs(nx, ny);
                }

            }
        }
        cnt--;
        hash.remove(map[x][y]);
    }
}
