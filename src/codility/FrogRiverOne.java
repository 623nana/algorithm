package codility;

import java.util.HashSet;

/* 2020-10-27 */

public class FrogRiverOne {
    public static void main(String[] args) {
        System.out.println(solution(5, new int[]{1, 3, 1, 4, 2, 3, 5, 4}));
    }
    public static int solution(int X, int[] A) {
        HashSet<Integer> set = new HashSet<>();

        for(int i = 1; i <= X; i++) {
            set.add(i);
        }

        for(int i = 0; i<A.length; i++) {
            set.remove(A[i]);
            if(set.size() == 0) {
                return i;
            }
        }

        return -1;
    }
}
