package programmers;

public class JadenCase {

  public static void main(String[] args) {
    System.out.println(solution("3people unFollowed me"));
    System.out.println(solution("for the last week"));
  }

  public static String solution (String s) {
    // 그냥 문자열 다 보는 식으로,,
    // 문장 첫 글자는 무조건 대문자
    String answer = s.substring(0, 1).toUpperCase();

    for(int i = 1; i < s.length(); i++) {
      String now = s.charAt(i) + "";
      if (now.equals(" ")) { // 공백이면 그대로 공백
        answer += " ";
      } else if (s.charAt(i - 1) == ' ') { // 이전 문자가 공백이면 대문자로 바꾸기
        answer += now.toUpperCase();
      } else { // 아니면 다 소문자
        answer += now.toLowerCase();
      }
    }

    return answer;
  }

}
