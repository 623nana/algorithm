package hackerrank;

public class SaveThePrisoner {

  public static void main(String[] args) {
    System.out.println(solution(4, 7, 4));
  }

  public static int solution (int n, int m, int s) {
    int candy = m % n;
    // s + candy - 1 이 n 보다 큰 경우 존재, n으로 나눈 몫을 구해줘야함,,!!
    if ((s + candy - 1) % n == 0) {
      return n;
    } else {
      return (s + candy - 1) % n;
    }
  }

}
