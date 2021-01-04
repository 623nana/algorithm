package programmers;

public class Carpet {

  public static void main(String[] args) {
    System.out.println(solution(24, 24));
  }

  public static int[] solution(int brown, int yellow) {
    int[] answer = new int[2];

    int k = ((brown / 2) - 2);
    int sq = (int) Math.sqrt(yellow);

    // 정사각형인 경우
    if (sq == k) {
      answer[0] = (int) Math.sqrt(brown + yellow);
      answer[1] = (int) Math.sqrt(brown + yellow);
      return answer;
    }

    for(int i = 1; i <= sq; i++) {
      if ( yellow % i == 0 ) {
        int l = yellow / i;
        if ( (i + l) * 2 + 4 == brown ) {
          answer[1] = i + 2;
          answer[0] = l + 2;
          break;
        }
      }
    }

    return answer;
  }
}
