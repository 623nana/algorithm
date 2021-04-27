package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

  public static List<List<Integer>> solution(int[] nums) {
    List<List<Integer>> answer = new ArrayList<>();

    perm(nums, 0, nums.length, nums.length, answer);

    return answer;
  }

  // n개 중 r개를 뽑는 경우
  public static void perm(int[] arr, int depth, int n, int r, List<List<Integer>> answer) {
    if (depth == r) {
      List<Integer> list = new ArrayList<>();
      for (int i = 0; i < r; i++) {
        list.add(arr[i]);
      }
      answer.add(list);
      return;
    }

    for (int i = depth; i < n; i++) {
      swap(arr, depth, i);
      perm(arr, depth + 1, n, r, answer);
      swap(arr, depth, i);
    }
  }

  public static void swap(int[] arr, int depth, int i) { //두 배열의 값을 바꾸는 Swap 함수
    int temp = arr[depth];
    arr[depth] = arr[i];
    arr[i] = temp;
  }
}
