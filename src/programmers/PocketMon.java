package programmers;

import java.util.HashSet;
import java.util.Set;

public class PocketMon {

  public static void main(String[] args) {
    System.out.println(solution(new int[] {3, 1, 2, 3}));
    System.out.println(solution(new int[] {3, 3, 3, 2, 2, 4}));
    System.out.println(solution(new int[] {3, 3, 3, 2, 2, 2}));
  }

  public static int solution (int[] nums) {
    int k = nums.length / 2;
    Set<Integer> set = new HashSet<>();

    for(int i : nums) {
      set.add(i);
    }

    return set.size() >= k ? k : set.size();
  }
}
