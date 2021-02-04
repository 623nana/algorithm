package programmers;

import java.util.ArrayList;

public class MakePrime {

  public static void main(String[] args) {
    System.out.println(solution(new int[] {1, 2, 3, 4}));
    System.out.println(solution(new int[] {1, 2, 7, 6, 4}));
  }

  public static int solution(int[] nums) {
    ArrayList<Integer> list = new ArrayList<>();

    boolean[] visited = new boolean[nums.length];
    comb(nums, visited, 0, nums.length, 3, list);
    int answer = 0;

    for(int i = 0; i < list.size(); i++) {
      boolean isPrime = true;
      for(int j = 2; j <= Math.sqrt(list.get(i)); j++) {
        if (list.get(i) % j == 0) {
          isPrime = false;
          break;
        }
      }
      if(isPrime) {
        answer++;
      }
    }
    return answer;
  }

  // 백트래킹
  public static void comb(int[] arr, boolean[] visited, int start, int n, int r, ArrayList<Integer> list) {
    // 다 뽑았다
    if(r == 0) {
      int sum = 0;
      for(int i = 0; i < n; i++) {
        if(visited[i]) {
          sum += arr[i];
        }
      }
      list.add(sum);
      return;
    }

    for(int j = start; j < n; j++) {
      visited[j] = true;
      comb(arr, visited, j + 1, n, r - 1, list);
      visited[j] = false;
    }
  }

}


