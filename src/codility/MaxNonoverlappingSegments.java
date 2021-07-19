package codility;

public class MaxNonoverlappingSegments {

  public static void main(String[] args) {
    System.out.println(solution(new int[]{1, 3, 7, 9, 9}, new int[]{5, 6, 8, 9, 10}));
  }

  public static int solution(int[] A, int[] B) {
    int len = A.length;
    if (len < 1) {
      return 0;
    }
    int answer = 1;
    int end = B[0];

    for (int i = 1; i < len; i++) {
      if (end < A[i]) {
        answer++;
        end = B[i];
      }
    }

    return answer;
  }

}
