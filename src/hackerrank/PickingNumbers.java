package hackerrank;

import java.util.Arrays;
import java.util.List;

public class PickingNumbers {

  public static void main(String[] args) {


  }

  public static int solution(List<Integer> list) {
    // 일단 배열 만들고  idx보고 담아주기
    int[] box = new int[100];

    for(int idx : list) {
      box[idx]++;
    }
    int max = 0;

    for(int i = 0 ; i<box.length; i++) {
      max = Math.max(max, box[i] + box[i+1]);
    }
    return max;
  }
}
