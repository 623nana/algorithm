package boj;

import java.util.ArrayList;
import java.util.Scanner;

/* 2018-10-21 */
/*
*   종료 조건이 집에와서 보니 좀 다르게 짠 것 같다..ㅜ
*   일단 테케 맞기는 했는데 설마 이거 때문에 걸리면 어떡하지-ㅅ-;;
* */
public class algo16234 {
    static int N;
    static int L;
    static int R;
    static int dx[] = {1, -1, 0, 0};
    static int dy[] = {0, 0, 1, -1};
    static int map[][];
    static boolean visited[][];
    static int stop[][];
    static int arr[][];
    static int time;
    static int t = 0;
    static int b;
    static ArrayList<Dot> list;
    public static void main(String [] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        L = sc.nextInt();
        R = sc.nextInt();

        map = new int[N][N];
        for(int i = 0; i<N ;i++){
            for(int j = 0; j<N; j++){
                map[i][j] = sc.nextInt();
            }
        }

        boolean check = false;

        while(check == false){
            // 1. 체크
            stop = new int[N][N];
            for(int i = 0; i<N; i++){
                for(int j = 0; j<N; j++){
                    if(stop[i][j] == 0){
                        check(i, j);
                    }
                }
            }
            b = 0;
            // 2. 종료조건
            for(int i = 0 ; i <N ; i++){
                for(int j = 0; j<N; j++){
                    b+=stop[i][j];
                }
            }

            if(b == 0){
                check = true;
                break;
            } else{
                check = false;
            }

            // 3. 지역 나누기
            t = 0;
            visited = new boolean[N][N];
            arr = new int[N][N];
            for(int i = 0; i<N; i++){
                for(int j = 0; j<N; j++){
                    if(!visited[i][j]){
                        t++;
                        dfs(i, j, t);
                    }
                }
            }
            visited = new boolean[N][N];
            for(int i = 0; i<N; i++){
                for(int j = 0; j<N; j++){
                    if(!visited[i][j]){
                        list = new ArrayList<>();
                        sDfs(i, j);
                        fill(list);
                    }
                }
            }
            time++;
        }

        System.out.println(time);
    }

    static void fill(ArrayList<Dot> list){
        int sum = 0;
        for(Dot a : list){
            sum += map[a.x][a.y];
        }
        for(Dot a : list){
            map[a.x][a.y] = sum/list.size();
        }
    }
    static void check(int x, int y){
        for(int i = 0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx>=0 && ny>=0 && nx<N && ny<N){
                if(stop[nx][ny] == 0) {
                    if (Math.abs(map[x][y] - map[nx][ny]) >= L && Math.abs(map[x][y] - map[nx][ny]) <= R) {
                        stop[nx][ny] = 1;
                        check(nx, ny);
                    }
                }
            }
        }
    }

    static void dfs(int x, int y, int t){
        arr[x][y] = t;
        for(int i = 0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx>=0 && ny>=0 && nx<N && ny<N){
                if(!visited[nx][ny]){
                    if (Math.abs(map[x][y] - map[nx][ny]) >= L && Math.abs(map[x][y] - map[nx][ny]) <= R) {
                        visited[nx][ny] = true;
                        dfs(nx, ny, t);
                    }
                }
            }
        }
    }
    static void sDfs(int x, int y){
        for(int i = 0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx>=0 && ny>=0 && nx<N && ny<N){
                if(!visited[nx][ny]){
                    if(arr[x][y] == arr[nx][ny]){
                        list.add(new Dot(nx, ny));
                        visited[nx][ny] = true;
                        sDfs(nx, ny);
                    }
                }
            }
        }
    }
}

class Dot{
    int x;
    int y;
    Dot(int x, int y){
        this.x = x;
        this.y = y;
    }
}

