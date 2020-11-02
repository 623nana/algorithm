package programmers;

import java.util.HashSet;

/* 2020-11-02 */
public class SumNum {
  public static void main(String[] args) {
    solution(new int[]{2,1,3,4,1});
  }
  public static int[] solution(int[] numbers) {
    HashSet<Integer> set = new HashSet<>();

    for(int i = 0; i<numbers.length; i++) {
      for(int j = i + 1; j < numbers.length; j++) {
        int tmp = numbers[i] + numbers[j];
        set.add(tmp);
      }
    }
    return set.stream().sorted().mapToInt(Integer::intValue).toArray();
  }

}
