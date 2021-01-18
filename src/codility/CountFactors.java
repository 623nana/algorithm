package codility;

public class CountFactors {

  public static void main(String[] args) {
    System.out.println(solution(25));
    System.out.println(solution(24));
  }

  public static int solution(int N) {
    int answer = 0;
    int sq = (int) Math.sqrt(N);

    for(int i = 1; i <= sq; i++) {
      if ( N % i == 0 ) {
        answer++;
      }
    }
    answer = answer * 2;

    if (sq * sq == N) {
      answer = answer - 1;
    }

    return answer;
  }

}
