package programmers;

import java.util.HashSet;
import java.util.Set;

public class EngWords {

  public static void main(String[] args) {
    System.out.println(solution(2, new String[] {"hello", "one", "even", "never", "now", "world", "draw"}));
  }

  public static int[] solution(int n, String[] words) {
    int[] answer = new int[] {0, 0};
    int order = 1;
    Set<String> set = new HashSet<>();
    set.add(words[0]);

    for(int i = 1; i < words.length; i++) {
      int len = words[i-1].length();
      order++;
      if(words[i-1].substring(len-1, len).equals(words[i].substring(0, 1))
          && !set.contains(words[i])) {
        set.add(words[i]);
      } else {
        answer[0] = order % n == 0 ? n : order % n;
        answer[1] = order % n == 0 ? order / n : (order / n ) + 1;
        break;
      }
    }

    return answer;
  }

}
