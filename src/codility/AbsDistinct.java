package codility;

import java.util.HashSet;
import java.util.Set;

public class AbsDistinct {

  public static void main(String[] args) {
    solution(new int[]{-5, -3, -1, 0, 3, 6});
  }

  public static int solution(int[] A) {
    Set<Integer> set = new HashSet<>();

    for (int num : A) {
      set.add(Math.abs(num));
    }

    System.out.println(set.size());

    return set.size();
  }
}
