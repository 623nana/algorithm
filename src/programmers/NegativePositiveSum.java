package programmers;

public class NegativePositiveSum {

  public static void main(String[] args) {
    System.out.println(solution(new int[]{4, 7, 12}, new boolean[]{true, false, true}));
    System.out.println(solution(new int[]{1, 2, 3}, new boolean[]{false, false, true}));
  }

  public static int solution(int[] absolutes, boolean[] signs) {
    int answer = 0;

    for (int i = 0; i < absolutes.length; i++) {
      if (!signs[i]) {
        absolutes[i] = absolutes[i] * -1;
      }
      answer += absolutes[i];
    }
    return answer;
  }
}
