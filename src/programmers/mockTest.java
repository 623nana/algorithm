package programmers;

import java.util.ArrayList;
import java.util.List;

/* 2020-11-03 */
public class mockTest {
  public static void main(String[] args) {
    solution(new int[] {1, 2, 3, 4, 5});
  }

  public static int[] solution(int[] numbers) {
    List<Integer> answer = new ArrayList<>();
    int[] stu1 = new int[] {1, 2, 3, 4, 5};
    int[] stu2 = new int[] {2, 1, 2, 3, 2, 4, 2, 5};
    int[] stu3 = new int[] {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

    int[] cor = new int[] {0, 0, 0};

    for(int i = 0; i < numbers.length; i++) {
      if(numbers[i] == stu1[i % 5])
        cor[0]++;
      if(numbers[i] == stu2[i % 8])
        cor[1]++;
      if(numbers[i] == stu3[i % 10])
        cor[2]++;
    }

    // 0번 째가 최대값, 크면 max에 넣고 삭제
    int max = cor[0];
    answer.add(1);

    for(int i = 1; i<cor.length; i++) {
      if(max < cor[i]) {
        answer.remove(answer.size()-1);
        answer.add(i+1);
        max = cor[i];
      } else if(max == cor[i]) {
        answer.add(i+1);
      }
    }
    return answer.stream().sorted().mapToInt(Integer::intValue).toArray();
  }

}
