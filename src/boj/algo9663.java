package boj;

import java.util.Scanner;
/* 2018-10-15 */
public class algo9663 {
    static int N, ans;
    static int col[];
    public static void main(String [] args) throws Exception {
     Scanner scan = new Scanner(System.in);
     N = scan.nextInt();

     for(int i = 1; i<=N; i++){
         col = new int[15];
         col[1] = i;

         dfs(1);
     }
     System.out.println(ans);
    }

    static void dfs(int row){
        if(row == N)
            ++ans;
        else {
            for(int i = 1; i<=N; i++){
                col[row+1] = i;
                if(isPossible(row+1))
                    dfs(row+1);
                else
                    col[row+1] = 0;
            }
        }
        col[row] = 0;
    }

    static boolean isPossible(int c){
        for(int i = 1; i<c; i++){
            //같은 행
            if(col[i] == col[c])
                return false;
            //대각선
            if(Math.abs(col[i] - col[c]) == Math.abs(i - c))
                return false;
        }
        return true;
    }
}
