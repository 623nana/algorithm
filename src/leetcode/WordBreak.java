package leetcode;

import java.util.Arrays;
import java.util.List;

public class WordBreak {

  public static void main(String[] args) {
    System.out.println(solution("leetcode", Arrays.asList("leet", "code")));
    System.out.println(solution("catsandog", Arrays.asList("cats", "dog", "sand", "and", "cat")));
  }

  public static boolean solution(String s, List<String> wordDict) {
    int len = s.length();
    boolean[] dp = new boolean[len + 1];
    dp[0] = true;

    for (int i = 1; i <= len; i++) {
      for (int j = i - 1; j >= 0; j--) {
        String subString = s.substring(j, i);
        if (dp[j] && wordDict.contains(subString)) {
          dp[i] = true;
          break;
        }
      }
    }

    return dp[s.length()];
  }

}
