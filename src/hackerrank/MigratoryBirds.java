package hackerrank;

import java.util.HashMap;
import java.util.Map;

public class MigratoryBirds {

  public static void main(String[] args) {
    System.out.println(solution(new int[] {1, 4, 4, 4, 5, 3, 3, 3}));
  }

  public static int solution(int[] nums) {
    Map<Integer, Integer> map = new HashMap<>();
    int max = 0;
    int answer = 0;

    for (int num : nums) {
      if (!map.containsKey(num)) {
        map.put(num, 1);
      } else {
        int cnt = map.get(num);
        map.put(num, cnt + 1);
      }
    }

    for (Integer key : map.keySet()) {
      if (max < map.get(key)) {
        max = map.get(key);
        answer = key;
      }
    }

    return answer;
  }
}
