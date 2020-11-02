package programmers;

import java.util.ArrayList;
import java.util.List;

/* 2020-11-02 */
public class Kakao2019_Q1 {
  public static void main(String[] args) {
    System.out.println(solution(new int[][]{{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}}, new int[]{1,5,3,5,1,2,1,4}));

  }
  public static int solution(int[][] board, int[] moves) {
    List<Integer> list = new ArrayList<>();
    int cnt = 0;
    // 해당 위치로 이동해서
    for(int i = 0; i<moves.length; i++) {
      // 0이 나올 때 까지 반복
      for(int j = 0; j<board.length; j++) {
        if(board[j][moves[i]-1] != 0) {
          // 같은지 판별
          if(list.size() == 0) {
            list.add(board[j][moves[i]-1]);
          } else if(list.get(list.size() - 1) == board[j][moves[i]-1]) {
            list.remove(list.size() - 1);
            cnt += 2;
          } else {
            list.add(board[j][moves[i]-1]);
          }
          board[j][moves[i]-1] = 0;
          break;
        }
      }
    }
    return cnt;
  }
}
