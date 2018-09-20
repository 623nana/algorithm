import java.util.Scanner;

/* 2018-09-20 */

public class algo1780 {
    static int[] rslt = new int[3];
    public static void main(String [] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[][] map = new int[n][n];

        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                map[i][j] = scan.nextInt()+1;
            }
        }

        check(0, 0, n, map);

        for(int i = 0; i<rslt.length; i++){
            System.out.println(rslt[i]);
        }

    }

    public static boolean solve(int start, int end, int[][] map, int size){
        for(int i = start; i < start+size; i++){
            for(int j = end; j < end+size; j++){
                if(map[start][end] != map[i][j])
                    return false;
            }
        }
        rslt[map[start][end]]++;
        return true;
    }

    public static void check(int start, int end, int size, int[][] map){
        if(solve(start, end, map, size))
            return;

        for(int i = 0 ; i<3; i++){
            for(int j = 0 ; j<3; j++){
                check(start + size/3*i, end + size/3*j, size/3, map);
            }
        }
    }
}
