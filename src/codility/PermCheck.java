package codility;

import java.util.Arrays;

/* 2020-10-26 */

public class PermCheck {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{4, 1, 3}));
    }

    public static int solution(int[] A) {
        Arrays.sort(A);
        for(int i = 0; i < A.length; i++) {
            if(A[i] != i+1) {
                return 0;
            }
        }
        return 1;
    }
}
