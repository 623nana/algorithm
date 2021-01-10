package programmers;

import java.util.ArrayList;

public class Kakao2018_Cache {

  public static void main(String[] args) {
    System.out.println(solution(3, new String[] {"Jeju", "Pangyo", "Seoul"
        , "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"}));
    System.out.println(solution(5, new String[] {"Jeju", "Pangyo", "Seoul", "NewYork", "LA"
        , "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"}));
    System.out.println(solution(5, new String[] {"Jeju", "jeju", "jeju"}));

  }

  public static int solution(int cacheSize, String[] cities) {
    int answer = 0;
    ArrayList<String> list = new ArrayList<>();

    if (cacheSize == 0) {
      return 5 * cities.length;
    }


    for(String s : cities) {
      // hit인 경우
      if (list.contains(s.toLowerCase())) {
        list.remove(s.toLowerCase());
        list.add(s.toLowerCase());
        answer += 1;
      } else {
        // miss 인 경우
        if(list.size() == cacheSize) {
          list.remove(0);
        }
        list.add(s.toLowerCase());
        answer += 5;
      }
    }
    return answer;
  }

}
