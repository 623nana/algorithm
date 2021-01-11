package programmers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Kakao2019_OpenChat {

  public static void main(String[] args) {
    System.out.println(solution(new String[] {"Enter uid1234 Muzi", "Enter uid4567 Prodo"
        , "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"}));
  }

  public static String[] solution(String[] record) {
    HashMap<String, String> map = new HashMap<>();
    List<String> list = new ArrayList<>();

    for(int i = 0; i < record.length; i++) {
      String[] words = record[i].split(" ");
      if (record[i].startsWith("E") || record[i].startsWith("C")) {
        map.put(words[1], words[2]);
      }
      if (record[i].startsWith("E") || record[i].startsWith("L")) {
        list.add(words[0] + " " + words[1]);
      }
    }

    String[] answer = new String[list.size()];

    for(int i = 0; i < list.size(); i++) {
      String[] sp = list.get(i).split(" ");
      if (sp[0].equals("Enter")) {
        answer[i] = map.get(sp[1]) + "님이 들어왔습니다.";
      } else {
        answer[i] = map.get(sp[1]) + "님이 나갔습니다.";
      }
    }
    return answer;
  }
}
