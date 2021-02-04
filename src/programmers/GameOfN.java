package programmers;

import java.util.ArrayList;

public class GameOfN {

  public static void main(String[] args) {
    System.out.println(solution(2, 4, 2, 1));
    System.out.println(solution(16, 16, 2, 1));
    System.out.println(solution(16, 16, 2, 2));
  }

  public static String solution(int n, int t, int m, int p) {
    ArrayList<String> list = new ArrayList<>();
    list.add("0");
    int num = 1;

    // 모든 n 진법으로 구해서 넣기
    while (list.size() <= (m * t)) {
      StringBuilder sb = new StringBuilder();
      int k = num;
      // n 진법
      while (k > 0) {
        int l = k % n;
        k = k / n;
        if (l >= 10 && l <= 15) {
          sb.insert(0, Integer.toHexString(l).toUpperCase());
        } else {
          sb.insert(0, l);
        }
      }
      for (int i = 0; i < sb.length(); i++) {
        list.add(sb.substring(i, i + 1));
      }
      num++;
    }

    String answer = "";
    // 최초의 인덱스
    int idx = p - 1;
    while (t != answer.length()) {
      answer += list.get(idx);
      idx = idx + m;
    }
    return answer;
  }

}
