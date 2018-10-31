package boj;

import java.util.Arrays;
import java.util.Scanner;

/* 2018-10-31 */

public class algo1759 {
    static boolean[] visited;
    static char[] arr;
    static int L;
    static int C;
    public static void main(String [] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        L = sc.nextInt();
        C = sc.nextInt();

        arr = new char[C];
        visited = new boolean[C];

        for(int i = 0; i< arr.length; i++){
            arr[i] = sc.next().charAt(0);
        }
        Arrays.sort(arr);
        dfs(0, 0, 0, 0);

    }
    static void dfs(int v, int len, int con, int vo){
        if(len == L && con >= 2 && vo >= 1){
            print();
        }
        for( int i = v; i < C; i++){
            visited[i] = true;
            dfs(i+1, len+1, con + (!check(arr[i]) ? 1 : 0), vo+ (!check(arr[i]) ? 0 : 1));
            visited[i] = false;
        }

    }

    static void print(){
        for(int i = 0; i < C ; i++){
            if(visited[i]){
                System.out.print(arr[i]);
            }
        }
        System.out.println();
    }

    static boolean check(char a){
        if(a == 'a' || a == 'e' || a == 'i' || a == 'o' || a =='u')
            return true;
        else
            return false;
    }
}
