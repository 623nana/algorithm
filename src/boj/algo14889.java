package boj;

import java.util.Scanner;

/* 2018-10-16 */

public class algo14889 {
    static int N;
    static int[][] arr;
    static boolean[] check;
    static int ans = Integer.MAX_VALUE;
    public static void main(String [] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        arr = new int[N+1][N+1];
        for(int i = 1; i<=N; i++){
            for(int j = 1; j<=N; j++){
                arr[i][j] = scan.nextInt();
            }
        }

        check = new boolean[N+1];
        dfs(0,0);
        System.out.println(ans);
    }

    static void dfs(int v, int depth){
        if(depth == N/2){
            makeTeam();
        } else {
            for (int i = v + 1; i <= N; i++) {
                if(!check[i]){
                    check[i] = true;
                    dfs(i, depth+1);
                }
            }
        }
        check[v] = false;
    }

    static void makeTeam(){
        int[] a = new int[N/2+1];
        int[] b = new int[N/2+1];
        int aIdx = 1;
        int bIdx = 1;

        for(int i = 1; i<=N; i++){
            if(check[i])
                a[aIdx++] = i;
            else
                b[bIdx++] = i;
        }

        int teamA = getScore(a);
        int teamB = getScore(b);
        int diffScore = Math.abs(teamA - teamB);
        ans = Math.min(ans, diffScore);
    }

    static int getScore(int[] input){
        int rslt = 0;
        for(int i = 1; i<=N/2; i++){
            for(int j = i+1; j<=N/2; j++){
                rslt+=arr[input[i]][input[j]];
                rslt+=arr[input[j]][input[i]];
            }
        }
        return rslt;
    }
}
