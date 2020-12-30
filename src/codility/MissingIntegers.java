package codility;

import java.util.HashSet;

public class MissingIntegers {

  public static void main(String[] args) {
    System.out.println(solution(new int[] {1, 3, 6, 4, 1, 2}));
    System.out.println(solution(new int[] {1, 2, 3}));
    System.out.println(solution(new int[] {-1, -2, -3, -4}));
    System.out.println(solution(new int[] {1, 1, 1}));
  }

  public static int solution(int[] A) {
    HashSet<Integer> set = new HashSet<>();

    for(int a : A) {
      set.add(a);
    }

    // 정수 최대 범위까지 돌리기!!
    for(int i = 1; i <= Integer.MAX_VALUE; i++) {
      if(!set.contains(i)) {
        return i;
      }
    }

    return 1;

  }

}
