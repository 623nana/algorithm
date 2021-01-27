package codility;

import java.util.HashMap;

public class EquiLeader {

  public static void main(String[] args) {
    System.out.println(solution(new int[]{4, 3, 4, 4, 4, 2}));
  }

  public static int solution(int[] A) {
    int answer = 0;

    // Leader 구하기
    HashMap<Integer, Integer> map = new HashMap<>();
    int maxCnt = 0;
    int leader = 0;

    for (int a : A) {
      if (!map.containsKey(a)) {
        map.put(a, 1);
      } else {
        int count = map.get(a) + 1;
        map.put(a, count);
        if (maxCnt < count) {
          maxCnt = count;
          leader = a;
        }
      }
    }

    if (maxCnt == 0) {
      return 0;
    }

    // 새로운 배열 만들어서..leader 값이랑 같으면 1 다르면 0
    int[] counter = new int[A.length];
    for (int i = 0; i < A.length; i++) {
      if (A[i] == leader) {
        counter[i] = 1;
      } else {
        counter[i] = 0;
      }
    }

    int leftLen = 0;
    int rightLen = A.length;
    int leftCnt = 0;
    int rightCnt = map.get(leader);

    for (int i = 0; i < A.length; i++) {
      leftCnt += counter[i];
      rightCnt -= counter[i];
      leftLen++;
      rightLen--;

      if ((leftCnt > leftLen / 2) && (rightCnt > rightLen / 2)) {
        answer++;
      }
    }

    return answer;
  }

}
