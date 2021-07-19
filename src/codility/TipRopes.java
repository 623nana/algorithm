package codility;

public class TipRopes {

  public static void main(String[] args) {
    System.out.println(solution(4, new int[] {1, 2, 3, 4, 1, 1, 3}));
  }

  public static int solution(int K, int[] A) {
    int answer = 0;
    int ropeLen = 0;

    for (int l : A) {
      ropeLen += l;
      if (ropeLen >= K) {
        answer++;
        ropeLen = 0;
      }
    }

    return answer;
  }
}
