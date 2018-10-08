package boj;
/* 2018-09-05 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class algo1260 {

    private static int n, m, v;
    private static int[][] map;
    private static boolean[] visited;

    public static void main(String [] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().trim().split(" ");
        n = Integer.parseInt(input[0]);
        m = Integer.parseInt(input[1]);
        v = Integer.parseInt(input[2]);

        map = new int [n+1][n+1];
        visited = new boolean[n+1];
        while(m-->0){
            input = reader.readLine().trim().split(" ");
            int x = Integer.parseInt(input[0]);
            int y = Integer.parseInt(input[1]);
            map[x][y] = map[y][x] = 1;
        }

        dfs(v, n);
        System.out.println();
        visited = new boolean[n+1];

        bfs(v, n);


    }

    /* 깊이우선탐색, 스택 or 재귀를 이용 */
    public static void dfs(int k, int n){
        if(visited[k]){
            return;
        }

        visited[k] = true;
        System.out.print(k+" ");

        for(int i = 1; i<=n; i++){
            if(map[k][i] == 1){
                dfs(i, n);
            }
        }
    }

    public static void bfs(int k, int n){
        Queue<Integer> q = new LinkedList<>();

        q.offer(k);
        while(!q.isEmpty()){
            int tmp = q.poll();
            visited[tmp] = true;
            System.out.print(tmp + " ");
            for(int i = 1; i<=n; i++){
                if(map[tmp][i] == 1 && !visited[i]){
                    System.out.print("i는" + i + " ");
                    q.offer(i);
                    visited[i] = true;
                }
            }
        }
    }
}
