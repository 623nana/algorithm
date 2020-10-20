package codility;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 2020-10-20 */

public class OddOccurrencesInArray {
    public static void main(String [] args) throws Exception {
        solution(new int[]{9, 3, 9, 3, 9, 7, 9});
    }

    public static int solution(int[] A) {
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < A.length; i++) {
            if(!set.contains(A[i])) {
                set.add(A[i]);
                continue;
            }

            set.remove(A[i]);
        }

        Iterator<Integer> iter = set.iterator();
        return iter.next();

    }
}
