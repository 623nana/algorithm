package leetcode;

import java.util.HashSet;
import java.util.Set;

/*
 * Sliding window 알고리즘
 * 문자열에 (i, j) -> 중복이 나타나면 i를 증가시켜 다시 탐색
 * */
public class LongestSubstringWithoutRepeatChar {

  public static void main(String[] args) {
    System.out.println(solution("abcabcbb"));
    System.out.println(solution("au"));
  }

  public static int solution(String s) {
    if (s.isEmpty()) {
      return 0;
    }

    int answer = 1;
    int i = 0;
    int j = 1;
    int len = s.length();

    Set<Character> set = new HashSet<>();
    while (i < len && j < len) {
      if (!set.contains(s.charAt(j)) && s.charAt(i) != s.charAt(j)) {
        set.add(s.charAt(j));
        answer = Math.max(answer, j - i + 1);
        j++;
      } else {
        set = new HashSet<>();
        i++;
        j = i + 1;
      }
    }
    return answer;
  }
}
