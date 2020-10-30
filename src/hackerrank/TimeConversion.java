package hackerrank;

public class TimeConversion {

  public static void main(String[] args) {
    System.out.println(solution("12:45:54PM"));
  }

  public static String solution(String s) {
    String f = s.substring(8, 10);
    int hour = Integer.parseInt(s.substring(0, 2));
    String answer = "";
    if(f.equals("PM")) {
      if(hour == 12) {
        answer = s.substring(0, 8);
      } else {
        hour += 12;
        answer = String.valueOf(hour) + s.substring(2, 8);
      }
    } else {
      hour %= 12;
      answer = "0" + String.valueOf(hour) + s.substring(2, 8);
    }
    return answer;
  }


}
