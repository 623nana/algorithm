package programmers;

public class ExOfNum {

  public static void main(String[] args) {
    System.out.println(solution(15));
  }

  public static int solution (int K) {
    int answer = 0;

    for(int i = K; i >= 1; i--) {
      int sum = 0;
      for(int j = i; j >= 1; j--) {
        sum += j;
        if (sum == K) {
          answer++;
          break;
        } else if (sum < K) {
          continue;
        } else {
          break;
        }
      }
    }

    return answer;
  }

}
