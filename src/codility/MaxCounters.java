package codility;

public class MaxCounters {

  public static void main(String[] args) {
    System.out.println(solution(5, new int[] {3, 4, 4, 6, 1, 4, 4}));
  }
  public static int[] solution(int N, int[] A) {
    // write your code in Java SE 8
    int[] newArr = new int[N];
    int currentMax = 0;
    int lastMax = 0;

    for(int i = 0; i < A.length; i++) {
      if ( A[i] == N + 1 ) {
        lastMax = currentMax;
      } else {
        int idx = A[i] - 1;
        if (newArr[idx] < lastMax) {
          newArr[idx] = lastMax + 1;
        } else {
          newArr[idx]++;
        }
        currentMax = Math.max(newArr[idx], currentMax);
      }
    }

    // max count는 나중에 한번만 실행해주기
    for(int i = 0; i < N; i++) {
      if(newArr[i] < lastMax) {
        newArr[i] = lastMax;
      }
    }
    return newArr;
  }
}
