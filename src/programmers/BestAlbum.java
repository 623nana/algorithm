package programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class BestAlbum {

  public static void main(String[] args) {
    System.out.println(solution(new String[]{"classic", "pop", "classic", "classic", "pop"},
        new int[]{500, 600, 150, 800, 2500}));
  }

  public static int[] solution(String[] genres, int[] plays) {
    HashMap<String, Integer> map = new HashMap<>();

    for (int i = 0; i < genres.length; i++) {
      if (!map.containsKey(genres[i])) {
        map.put(genres[i], plays[i]);
      } else {
        map.put(genres[i], map.get(genres[i]) + plays[i]);
      }
    }

    // keyList, value 값이 큰 순으로 정렬
    ArrayList<String> keyList = new ArrayList<>(map.keySet());
    Collections.sort(keyList, (o1, o2) -> (map.get(o2).compareTo(map.get(o1))));

    ArrayList<Integer> answers = new ArrayList<>();

    for (int i = 0; i < keyList.size(); i++) {
      int firstIdx = 0;
      int secondIdx = 0;
      int max = 0;
      // 가장 많이 재생
      for (int j = 0; j < genres.length; j++) {
        if (genres[j].equals(keyList.get(i))) {
          if (max < plays[j]) {
            max = plays[j];
            firstIdx = j;
          }
        }
      }

      max = 0;
      // 두번째로 많이 재생
      for (int j = 0; j < genres.length; j++) {
        if (genres[j].equals(keyList.get(i))) {
          if (j != firstIdx && max < plays[j]) {
            max = plays[j];
            secondIdx = j;
          }
        }
      }
      answers.add(firstIdx);
      // 곡이 한번만 재생되는 경우
      if (max != 0) {
        answers.add(secondIdx);
      }
    }

    return answers.stream().mapToInt(Integer::intValue).toArray();
  }
}
