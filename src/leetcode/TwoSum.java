package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSum {

  public static void main(String[] args) {
    System.out.println(Arrays.toString(solution(new int[]{2, 7, 11, 15}, 9)));
    System.out.println(Arrays.toString(solution(new int[]{3, 2, 4}, 6)));
    System.out.println(Arrays.toString(solution(new int[]{3, 3}, 6)));
  }

  public static int[] solution(int[] nums, int target) {
    List<Integer> result = new ArrayList<>();

    for (int i = 0; i < nums.length; i++) {
      int temp = target;
      temp = target - nums[i];
      for (int j = i + 1; j < nums.length; j++) {
        int temp2 = temp - nums[j];
        if (temp2 == 0) {
          result.add(i);
          result.add(j);
          break;
        }
      }
    }

    return result.stream().mapToInt(Integer::intValue).toArray();

  }

}
