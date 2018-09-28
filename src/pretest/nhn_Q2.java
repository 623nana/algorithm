package pretest;

import java.io.*;
import java.util.*;

public class nhn_Q2 {

    static int N, cnt, ax, ay;
    static int map[][];
    static int dx[] = {1, -1, 0, 0};
    static int dy[] = {0, 0, 1, -1};

    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<Integer>();
        map = new int[N][N];

        for(int i = 0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j<N; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int name = 0;
        for(int i = 0; i<N; i++){
            for(int j = 0; j<N; j++){
                if(map[i][j]!=0){
                    name++;
                    cnt = 0;
                    int a = dfs(i, j, name);
                    list.add(a);
                }
            }
        }

        if(list.size() == 0){
            System.out.println(name);
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

    static int dfs(int x, int y, int name){
        cnt++;
        map[x][y] = 0;
        for(int i = 0; i<4; i++){
            ax = x + dx[i];
            ay = y + dy[i];
            if(ax>=0 && ay>=0 && ax<N && ay<N) {
                if (map[ax][ay] == 1) {
                    dfs(ax, ay, name);
                }
            }
        }
        return cnt;
    }
}
