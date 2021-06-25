package leetcode;

import java.util.HashSet;
import java.util.Set;

public class SingleNumber {

  public static void main(String[] args) {
    System.out.println(solution(new int[] {2, 2, 1}));
    System.out.println(solution(new int[] {4, 1, 2, 1, 2}));
    System.out.println(solution(new int[] {2, 2, 1}));
  }

  public static int solution(int[] nums) {
    Set<Integer> set = new HashSet<>();

    for (int num : nums) {
      if (!set.contains(num)) {
        set.add(num);
      } else {
        set.remove(num);
      }
    }

    return set.iterator().next();
  }

}
