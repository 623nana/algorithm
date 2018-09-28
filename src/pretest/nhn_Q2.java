package pretest;

import java.io.*;
import java.util.*;

public class nhn_Q2 {
    static final int[] dCol = {-1, 0, 1, 0};
    static final int[] dRow = {0, 1, 0, -1};
    static int N;
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());

        ArrayList<Integer> list = new ArrayList<Integer>();

        int[][] map = new int[N][N];
        boolean[][] check = new boolean[N][N];

        for(int i = 0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j<N; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int name = 0;

        for(int i = 0; i<N; i++){
            for(int j = 0; j<N; j++){
                if(!check[i][j] && map[i][j]!=0){
                    name++;
                    int cnt = dfs(i, j, name, 0, check, map);
                    list.add(cnt);
                }
            }
        }

        if(list.size() == 0){
            System.out.print(name);
        } else {
            Collections.sort(list);
            System.out.print(name + "\n");
            for(int i = 0; i<list.size(); i++){
                if(i != (list.size()-1)){
                    System.out.print(list.get(i) + " ");
                } else {
                    System.out.print(list.get(i));
                }
            }
        }
    }

    static int dfs(int dx, int dy, int name, int cnt, boolean[][] check, int[][] map){
        cnt++;
        check[dx][dy] = true;

        for(int i = 0; i<4; i++){
            int nextRow =  dx + dRow[i];
            int nextCol = dy + dCol[i];

            if(nextRow < 0 || nextRow >= N || nextCol < 0 || nextCol >= N) continue;
            if(map[nextRow][nextCol] == 0) continue;
            if(check[nextRow][nextCol]) continue;

            cnt = dfs(nextRow, nextCol, name, cnt, check, map);
        }

        return cnt;
    }
}
