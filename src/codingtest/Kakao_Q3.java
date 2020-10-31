package codingtest;

import java.util.ArrayList;
import java.util.List;

public class Kakao_Q3 {

  public static void main(String[] args) {
    String[] card = new String[]{"ABACDEFG", "NOPQRSTU", "HIJKLKMM"};
    String[] word = new String[]{"GPQM", "GPMZ", "EFU", "MMMNA"};
    solution(card, word);
  }

  public static String[] solution(String[] card, String[] word) {
    List<String> answer = new ArrayList<>();

    for (int i = 0; i < word.length; i++) {
      // Deep copy!!
      String[] cp = card.clone();
      // 방문 체크
      boolean[] visit = new boolean[3];
      int find = 0;
      int cnt = 0;
      for (int j = 0; j < word[i].length(); j++) {
        // 그 알파벳 가져오
        String s = word[i].substring(j, j + 1);
        // 카드 돌면서 비교 있는지
        for (int k = 0; k < card.length; k++) {
          if (cp[k].contains(s)) {
            // 문자열 한개만 삭제! replace -> 포함한거 다 지우게 됨!
            cp[k] = cp[k].replaceFirst(s, "");
            visit[k] = true;
            find++;
          }
        }
      }
      // 판별 다 방문해야 add
      for (boolean chk : visit) {
        if (chk)
          cnt++;
      }
      if (cnt == 3 && find == word[i].length())
        answer.add(word[i]);
    }
    return answer.size() == 0 ? new String[]{"-1"} : answer.toArray(new String[answer.size()]);
  }
}
