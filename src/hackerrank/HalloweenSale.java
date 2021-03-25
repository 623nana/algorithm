package hackerrank;

public class HalloweenSale {

  public static void main(String[] args) {
    System.out.println(solution(20, 3, 6, 80));
    System.out.println(solution(20, 3, 6, 85));
  }

  public static int solution(int p, int d, int m, int s) {
    int cnt = 0;

    while(s - p >= 0) {
      s = s - p;
      cnt++;
      if (p - d < m) {
        p = m;
      } else {
        p = p - d;
      }
    }
    return cnt;
  }
}
