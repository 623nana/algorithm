package boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 2018-09-21 */
public class algo1992 {
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] map = new int[n][n];

        for(int i = 0; i < n; i++){
            String[] input = br.readLine().split("");
            for(int j = 0; j < n; j++){
                map[i][j] = Integer.parseInt(input[j]);
            }
        }

        solve(0, 0, map, n);

    }

    public static void solve(int start, int end, int[][] map, int size){
        for(int i = start; i < start + size; i++){
            for(int j = end; j < end + size; j++){
                if(map[start][end] != map[i][j]){
                    //점을 꼭 왼위-오른위-왼아래-오른아래로 해줘야 올바른 값이 나옴!
                    System.out.print("(");
                    solve(start, end, map, size/2);
                    solve(start, end + size/2, map, size/2);
                    solve(start + size/2, end, map, size/2);
                    solve(start + size/2, end + size/2, map,size/2);
                    System.out.print(")");
                    return;
                }
            }
        }
        System.out.print(map[start][end]);
    }
}
