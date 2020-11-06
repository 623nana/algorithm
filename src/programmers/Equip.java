package programmers;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Equip {

  public static void main(String[] args) {
    solution(new int[] {95, 90, 99, 99, 80, 99}, new int[] {1, 1, 1, 1, 1, 1});
  }

  public static int[] solution(int[] progresses, int[] speeds) {
    // 남은 일 수 계산
    Queue<Integer> q = new LinkedList<>();
    List<Integer> answer = new ArrayList<>();

    // 완료 되는 날 계산
    for(int i = 0; i < progresses.length; i++) {
      q.add(
          (100-progresses[i]) % speeds[i] != 0 ?
          (100-progresses[i]) / speeds[i] + 1 :
          (100-progresses[i]) / speeds[i]
      );
    }

    // 맨 처음 값
    // poll() 요소 꺼내서 반환, peek() 삭제 없이 읽어오기만
    int prevFunc = q.poll();
    int funcs = 1;

    // 그 다음 인덱스가 해당 인덱스보다 작거나 같으면 가능
    while(!q.isEmpty()) {
      int curFunc = q.poll();
      if(prevFunc >= curFunc) {
        funcs++;
      } else {
        answer.add(funcs);
        funcs = 1;
        prevFunc = curFunc;
      }
    }

    answer.add(funcs);

    return answer.stream().mapToInt(Integer::intValue).toArray();
  }

}
