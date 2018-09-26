import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 2018-09-26 */

public class Kakao_Q1 {
    public static void main(String [] args) throws Exception {

        String[] record = new String[]{"Enter uid1234 Muzi", "Enter uid4567 Prodo",
                "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"};

        Map<String, String> relate = new HashMap<String, String>();
        List<String> answer = new ArrayList<>();
        //String[] events = new String[answer.size()];
        String[] input;

        for (int i = 0; i < record.length; i++) {
            input = record[i].split(" ");
            if (input[0].equals("Enter") || input[0].equals("Change")) {
                //Map을 이용하여 갱신
                relate.put(input[1], input[2]);
            }
        }

        for (int i = 0; i < record.length; i++) {
            input = record[i].split(" ");
                if (input[0].equals("Enter")) {
                    answer.add(relate.get(input[1]) + "님이 들어왔습니다.");
                } else if (input[0].equals("Leave")) {
                    answer.add(relate.get(input[1]) + "님이 나갔습니다.");
                }

        }

        for(String s : answer){
            System.out.println(s);
        }

        //return answer.toArray(events);

    }
}