package hackerrank;

public class DrawingBook {

  public static void main(String[] args) {
    System.out.println(solution(7, 6));
  }

  public static int solution(int n, int p) {
    int answer = 0;

    // 앞에서 부터 셌을 때
    int front = p / 2;
    // 뒤에서 부터 셌을 때
    // n이 짝수인 경우랑 홀수인 경우 분기
    int back = 0;
    if (n % 2 == 0 && p % 2 != 0) {
      back = (n - p + 1) / 2;
    } else {
      back = (n - p) / 2;
    }
    answer = Math.min(front, back);

    return answer;
  }

}
