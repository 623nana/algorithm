package codility;

public class PassingCars {

  public static void main(String[] args) {
    System.out.println(solution(new int[] {0, 1, 0, 1, 1}));
  }

  public static int solution(int[] A) {
    // write your code in Java SE 8
    int len = A.length;
    int cntZero = 0;
    int answer = 0;

    for(int i = 0; i < len; i++) {
      if(A[i] == 0) {
        cntZero++;
      } else {
        // 1 이전에 나온 0의 갯수들을 더해줌
        answer += cntZero;
        if(answer > 1_000_000_000) {
          return -1;
        }
      }
    }
    return answer;
  }

}
