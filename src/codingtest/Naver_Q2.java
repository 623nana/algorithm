package codingtest;
/*
*
* 2020-12-31
* 양수 음수 둘다 존재하는 수 중에 가장 큰 값 찾기, 절대값이 같은 수
* 모두 양수인 경우, 모두 음수인 경우를 고려하지 못했음ㅠㅠ 열받어,,
*
* */
import java.util.Arrays;

public class Naver_Q2 {

  public static void main(String[] args) {
    System.out.println(solution(new int[] {3, 2, -2, 5, -3}));
    System.out.println(solution(new int[] {1, 2, 3, 4}));
    System.out.println(solution(new int[] {1, 2, -1, 3, 4}));
    System.out.println(solution(new int[] {1, 1, 3, 3}));
  }

  public static int solution(int[] A) {
    Arrays.sort(A);

    // 길이가 1이면 불가능, 모두 다 음수이거나 모두 다 양수인 경우 불가능
    if ((Math.abs(A[0]) >= A[A.length - 1]) || A.length == 1 || A[A.length - 1] <= 0 || A[0] >= 0) {
      return 0;
    }

    int maxValue = 0;
    for(int i = A.length - 1; i > 0; i--) {
      if(Math.abs(A[0]) == A[i]) {
        maxValue = A[i];
        break;
      }
    }
    return maxValue;
  }

}
