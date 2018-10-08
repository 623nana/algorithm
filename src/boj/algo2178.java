package boj;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/* 2018-09-29 */

public class algo2178 {
    static int[][] arr;
    static boolean[][] visited;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static int N;
    static int M;

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        M = scan.nextInt();
        scan.nextLine();

        arr = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String str = scan.nextLine();
            for (int j = 0; j < M; j++) {
                arr[i][j] = str.charAt(j) - '0';
                visited[i][j] = false;
            }
        }
        visited[0][0] = true;
        bfs(0, 0);
        System.out.println(arr[N - 1][M - 1]);
    }

    public static void bfs(int x, int y) {
        Queue<Loc> q = new LinkedList<Loc>();
        q.add(new Loc(x, y));

        while (!q.isEmpty()) {
            Loc l = q.poll();
            for (int i = 0; i < 4; i++) {
                int nX = l.x + dx[i];
                int nY = l.y + dy[i];

                if (nX >= 0 && nY >= 0 && nX < N && nY < M) {
                    if (arr[nX][nY] == 1 && !visited[nX][nY]) {
                        q.add(new Loc(nX, nY));
                        arr[nX][nY] = arr[l.x][l.y] + 1;
                        visited[nX][nY] = true;
                    }
                }
            }
        }
    }
}
class Loc {
    int x;
    int y;

    Loc(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
