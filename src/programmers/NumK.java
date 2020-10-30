package programmers;

import java.util.Arrays;

public class NumK {
    public static void main(String[] args) {

    }
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i = 0; i<commands.length; i++) {
            // Arrays.copyOfRange <- 배열 인덱스 만큼 새로운 배열에 복사
            int[] newArr = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(newArr);
            answer[i] = newArr[commands[i][2]-1];
        }
        return answer;
    }
}
