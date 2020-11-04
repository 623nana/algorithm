package programmers;

/* 2020-11-04 */
public class Exercise {
  public static void main(String[] args) {
    System.out.println(solution(5, new int[] {2, 4}, new int[] {1, 3, 5}));
  }

  public static int solution(int n, int[] lost, int[] reserve) {
    int answer = n-lost.length;

    for(int i = 0; i<lost.length; i++){
      for(int j = 0; j<reserve.length; j++) {
        if(lost[i] == reserve[j]){
          answer++;
          lost[i] = - 1;
          reserve[j] = - 3;
        }
      }
    }

    for(int i = 0; i<lost.length; i++) {
      for(int j = 0; j<reserve.length; j++) {
        if((lost[i]-1 == reserve[j] || lost[i] + 1 == reserve[j]) && answer < n) {
          answer++;
          reserve[j] = - 3;
        }
      }
    }
    return answer;
  }

}
