package programmers;

public class SumOfDivisor {

  public static void main(String[] args) {
    solution(13, 17);
  }

  public static int solution(int left, int right) {
    int sum = 0;
    for (int i = left; i <= right; i++) {
      int cnt = 0;
      for(int j = 1; j <= Math.sqrt(i); j++) {
        if (i % j == 0) {
          cnt += j == Math.sqrt(i) ? 1 : 2;
        }
      }

      sum += cnt % 2 != 0 ? i * (-1) : i;
    }
    return sum;
  }
}
