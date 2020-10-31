package codingtest;

public class Kakao_Q1 {
    public static void main(String [] args) throws Exception {
        System.out.print(solution(2));
    }
    public static int solution(int num) {
        int answer = 0;
        for(int i = 1; i<=num; i++){
            if(String.valueOf(i).contains("3") || String.valueOf(i).contains("6") || String.valueOf(i).contains("9")){
                answer++;
            }
        }
        return answer;
    }
}
