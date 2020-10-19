package codility;

/* 2020-10-19 */

public class CyclicRotation {
    public static void main(String [] args) throws Exception {
        solution(new int[]{3, 8, 9, 7, 6}, 3);
    }

    public static int[] solution(int[] A, int K) {
        int[] newArr = new int[A.length];

        for(int i = 0; i < A.length; i++) {
            int idx = (i + K) % A.length;
            newArr[idx] = A[i];
        }
        for(int a : newArr) {
            System.out.print(a);
        }
        return newArr;
    }
}
