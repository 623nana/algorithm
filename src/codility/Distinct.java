package codility;

import java.util.HashSet;

public class Distinct {

  public static void main(String[] args) {
    System.out.println(solution(new int[] {2, 1, 1, 2, 3, 1}));
  }

  public static int solution(int[] A) {
    HashSet<Integer> set = new HashSet<>();

    for(int a : A) {
      set.add(a);
    }
    return set.size();
  }
}
