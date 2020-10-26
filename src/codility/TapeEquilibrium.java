package codility;

public class TapeEquilibrium {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 1, 2, 4, 3}));
    }
    public static int solution(int[] A) {
        int min = 0;
        int lsum = A[0];
        int rsum = 0;

        if(A.length == 2) {
            return Math.abs(A[0] - A[1]);
        }
        for(int i = 1; i < A.length; i++) {
            rsum += A[i];
        }
        min = Math.abs(lsum - rsum);

        for(int i = 2; i<A.length; i++) {
            lsum += A[i - 1];
            rsum -= A[i - 1];
            if (min > Math.abs(lsum - rsum)) {
                min = Math.abs(lsum - rsum);
            }
        }
        return min;
    }
}
