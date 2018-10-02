import java.util.ArrayList;
import java.util.Scanner;

/* 2018-10-02 */
// 너무 느린 것 같기도..ㅜㅜ

public class algo10451 {
    static int map[][];
    static int N;
    static Scanner sc;
    public static void main(String [] args) throws Exception {
        sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int T = sc.nextInt();

        while(T-->0){
            list.add(cnt());
        }
        for(int i : list){
            System.out.println(i);
        }
    }

    public static int cnt(){
        N = sc.nextInt();
        int cnt = 0;
        map = new int[N][N];

        for(int i = 0; i<N; i++){
            int a = sc.nextInt();
            map[i][a-1] = 1;
        }

        for(int i = 0; i<N; i++){
            for(int j = 0; j<N; j++){
                if(map[i][j] == 1){
                    cnt++;
                    dfs(i, j);
                }
            }
        }
        return cnt;
    }
    public static void dfs(int x, int y){
       map[x][y] = 0;
       for(int i = 0; i<N; i++){
           if(map[y][i] == 1){
               dfs(y, i);
           }
       }
    }
}
