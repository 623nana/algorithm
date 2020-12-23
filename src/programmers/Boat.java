package programmers;

import java.util.Arrays;

public class Boat {

  public static void main(String[] args) {
    System.out.println(solution(new int[] {70, 50, 80, 50}, 100));
  }

  public static int solution(int[] people, int limit) {
    int answer = 0;
    int j = 0;
    //정렬
    Arrays.sort(people);

    // 무게가 많이 나가는 사람 부터 보내기.. 최대 두명!
    for(int i = people.length - 1; j<=i; i--) {
      if (people[i] + people[j] > limit) {
        answer++;
      } else {
        answer++;
        j++;
      }
    }

    return answer;
  }
}
