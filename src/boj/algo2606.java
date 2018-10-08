package boj;

import java.io.*;
import java.util.StringTokenizer;

/* 2018-09-28 */

public class algo2606 {

    private static int pc,link;
    private static int[][] map;
    private static boolean[] visited;
    private static int cnt = 0;

    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        pc = Integer.parseInt(br.readLine());
        link = Integer.parseInt(br.readLine());

        map = new int[pc+1][pc+1];
        visited = new boolean[pc+1];

        for(int i = 0; i<link; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            map[a][b] = map[b][a] = 1;
        }
        dfs(1);
        System.out.print(cnt);
    }

    public static void dfs(int k){
        visited[k] = true;
        for(int i = 1; i<visited.length; i++){
            if(map[k][i] == 1 && visited[i] == false){
                cnt++;
                dfs(i);
            }
        }
    }
}

