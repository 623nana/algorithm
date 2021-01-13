package codility;

import java.util.Arrays;

public class MaxProductOfThree {

  public static void main(String[] args) {
    System.out.println(solution(new int[] {-3, 1, 2, -2, 5, 6}));
  }
  public static int solution(int[] A) {
    int answer = 0;
    int len = A.length;

    if (len == 3) {
      return A[0] * A[1] * A[2];
    }

    Arrays.sort(A);
    int f = A[0] * A[1] * A[len-1];
    int b = A[len-1] * A[len-2] * A[len-3];

    answer = Math.max(f, b);

    return answer;
  }

}
