package programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;

public class Kakao2018_Q1 {

  public static void main(String[] args) {
    System.out.println(solution("FRANCE", "french"));
    System.out.println(solution("handshake", "shake hands"));
    System.out.println(solution("aa1+aa2", "AAAA12"));
    System.out.println(solution("E=M*C^2", "e=m*c^2"));
  }

  public static int solution(String str1, String str2) {
    ArrayList<String> list1 = new ArrayList<>();
    ArrayList<String> list2 = new ArrayList<>();
    ArrayList<String> set = new ArrayList<>();
    ArrayList<String> union = new ArrayList<>();

    // 두개씩 영문자만 남겨서 일단 넣기..
    for(int i = 0; i < str1.length() - 1; i++) {
      if (Pattern.matches("^[a-zA-Z]*$", str1.substring(i, i+2))) {
        list1.add(str1.substring(i, i+2).toLowerCase());
      }
    }

    for(int i = 0; i < str2.length() - 1; i++) {
      if (Pattern.matches("^[a-zA-Z]*$", str2.substring(i, i+2))) {
        list2.add(str2.substring(i, i+2).toLowerCase());
      }
    }

    // 정렬이 꼭 필요 할까?
//    Collections.sort(list1);
//    Collections.sort(list2);

    // 다중집합 고려해주기
    // 교집합
    // list1을 순환하면서 list2에 있으면 list2에서 삭제하고 그 원소 교집합에 넣기
    for(String s : list1) {
      if (list2.contains(s)) {
        set.add(s);
        list2.remove(s);
      }
    }

    // 합집합 구하기
    // 일단 list1 먼저 넣고, list2 남은 원소 넣기
    union.addAll(list1);
    union.addAll(list2);

    double answer = union.size() == 0 ? 65536 : Math.floor(((set.size() / (double) union.size()) * 65536));
    return (int) answer;
  }

}
