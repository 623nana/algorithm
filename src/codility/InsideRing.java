package codility;

public class InsideRing {

  public static void main(String[] args) {
    System.out.println(solution(1, 3, new int[] {0, 1, 2, -2, 3}, new int[] {0, 1, 4, 1, 0}));
    System.out.println(solution(2, 4, new int[] {4, 0, 1, -2}, new int[] {-4, 4, 3, 0}));
  }

  public static int solution(int inner, int outer, int[] X, int[] Y) {
    int answer = 0;

    for (int i = 0; i < X.length; i++) {
      double radius = Math.sqrt(Math.pow(X[i], 2) + Math.pow(Y[i], 2));
      if (radius > inner && radius < outer) {
        answer++;
      }
    }

    return answer;
  }
}
