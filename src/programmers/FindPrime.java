package programmers;

import java.util.HashSet;

public class FindPrime {
  public static void main(String[] args) {
//    System.out.println(solution("011"));
    System.out.println(solution("17"));
  }

  public static int solution(String s) {
    int answer = 0;
    HashSet<Integer> set = new HashSet<>();
    String[] str = s.split("");

    for (int i = 1; i <= s.length(); i++) {
      perm(str, 0, str.length, i, set);
    }

    for (int n : set) {
      boolean isPrime = true;
      for (int i = 2; i <= Math.sqrt(n); i++) {
        if (n % i == 0) {
          isPrime = false;
          break;
        }
      }
      if (isPrime) {
        answer++;
      }
    }
    return answer;
  }

  // n개 중 r개를 뽑는 경우
  public static void perm(String[] arr, int depth, int n, int r, HashSet<Integer> set) {
    if (depth == r) {
      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < r; i++) {
        sb.append(arr[i]);
      }

      int number = Integer.parseInt(sb.toString());
      if (number > 1) {
        set.add(number);
      }
      return;
    }

    for (int i = depth; i < n; i++) {
      swap(arr, depth, i);
      perm(arr, depth + 1, n, r, set);
      swap(arr, depth, i);
    }
  }

  public static void swap(String[] arr, int depth, int i) { //두 배열의 값을 바꾸는 Swap 함수
    String temp = arr[depth];
    arr[depth] = arr[i];
    arr[i] = temp;
  }

}
