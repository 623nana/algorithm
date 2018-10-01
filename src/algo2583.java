import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/* 2018-10-01 */

public class algo2583 {
    static int dx[] = {1, -1, 0, 0};
    static int dy[] = {0, 0, 1, -1};
    static int map[][];
    static boolean visited[][];
    static int M;
    static int N;
    static int area;
    public static void main(String [] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        M = sc.nextInt();
        N = sc.nextInt();
        int K = sc.nextInt();
        int startX = 0;
        int startY = 0;
        int endX = 0;
        int endY = 0;
        int cnt = 0;
        ArrayList<Integer> list = new ArrayList<>();

        map = new int[M][N];
        visited = new boolean[M][N];

        for(int i = 0; i<M; i++){
            for(int j = 0; j<N; j++){
                map[i][j] = 1;
            }
        }

        while(K-->0){
            startX = sc.nextInt();
            startY = sc.nextInt();
            endX = sc.nextInt();
            endY = sc.nextInt();
            draw(startX, startY, endX, endY);
        }

        for(int i = 0; i<M; i++){
            for(int j = 0; j<N; j++){
                if(map[i][j] != 0){
                    cnt++;
                    area = 0;
                    list.add(dfs(i,j));
                }
            }
        }
        Collections.sort(list);
        System.out.println(cnt);
        for(int i : list){
            System.out.print(i + " ");
        }
    }

    public static void draw(int startX, int startY, int endX, int endY){
        for(int i = 0; i<endY - startY; i++){
            for(int j = 0; j<endX - startX; j++){
                map[startY+i][startX+j] = 0;
            }
        }
    }

    public static int dfs(int x, int y){
        area++;
        visited[x][y] = true;
        map[x][y] = 0;
        for(int i=0; i<4;i++){
            int aX = x + dx[i];
            int aY = y + dy[i];
            if(aX >= 0 && aY >= 0 && aX<M && aY<N){
                if(map[aX][aY] == 1 && !visited[aX][aY]){
                    visited[aX][aY] = true;
                    dfs(aX,aY);
                }
            }
        }
        return area;
    }
}
