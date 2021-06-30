package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindNumDisappeared {

  public static void main(String[] args) {
    System.out.println(solution(new int[]{1, 1}));
    System.out.println(solution(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
  }

  public static List<Integer> solution(int[] nums) {
    Set<Integer> set = new HashSet<>();
    List<Integer> answer = new ArrayList<>();
    int len = nums.length;

    for (int num : nums) {
      set.add(num);
    }

    for (int i = 1; i <= len; i++) {
      if (!set.contains(i)) {
        answer.add(i);
      }
    }
    return answer;
  }

}
