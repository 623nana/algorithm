package programmers;

import java.util.Arrays;

public class HIndex {

  public static void main(String[] args) {
    System.out.println(solution(new int[] {3, 0, 6, 1, 5}));
  }

  public static int solution(int[] citations) {
    int answer = 0;

    Arrays.sort(citations);

    for (int i = citations.length; i >= 1; i--) {
      int l = 0;
      int s = 0;
      for (int j = 0; j < citations.length; j++) {
        if (citations[j] >= i) {
          l++;
        } else {
          s++;
        }
      }
      if ( l >= i && s <= i) {
        // 최대값을 찾도록 !!
        answer = Math.max(answer, i);
      }
    }
    return answer;
  }

}
