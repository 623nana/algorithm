package boj;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Arrays;
import java.util.Scanner;

/* 2018-10-03 */

public class algo11403 {
    static int N = 0;
    static int map[][];
    static int path[][];
    static int c[];
    public static void main(String [] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        map = new int[N][N];
        path = new int[N][N];
        c = new int[N];
        for(int i = 0; i<N; i++){
            for(int j = 0; j<N; j++){
                map[i][j] = scan.nextInt();
            }
        }

        for(int i = 0; i<N; i++){
            dfs(i);
            for(int j = 0; j<N; j++){
                path[i][j] = c[j];
            }
            Arrays.fill(c, 0);
        }

        for(int i = 0; i<N; i++){
            for(int j = 0; j<N; j++){
                System.out.print(path[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void dfs(int v){
        //int n = map.length-1;
        for(int i = 0; i<N; i++){
            if(map[v][i] == 1 && c[i] == 0){
                c[i] = 1;
                dfs(i);
            }
        }
    }
}
