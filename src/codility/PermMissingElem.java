package codility;

public class PermMissingElem {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 4, 3, 6}));
    }
    public static int solution(int[] A) {
        int sum = 0;

        for(int i = 1; i <= A.length + 1; i++) {
            sum += i;
        }

        for(int i = 0; i<A.length; i++) {
            sum -= A[i];
        }
        return sum;
    }
}
