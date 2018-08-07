import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

/* 2018-08-07 */

public class algo1181 {
    public static void main(String [] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(reader.readLine());

        //HashSet은 중복을 허용하지 않음!
        //따라서 HashSet을 사용하면 같은 단어가 여러 번 입력 된 경우 한번만 출력하는 것이 가능하다.
        HashSet<String> hashSet = new HashSet<>();

        for(int i = 0; i<N; i++){
            hashSet.add(reader.readLine());
        }

        String[] arr = new String[hashSet.size()];

        //HashSet을 배열로 바꾸기
        hashSet.toArray(arr);

        //알파벳 순으로 정렬
        Arrays.sort(arr);

        //길이를 비교하여
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        });

        for(String output : arr){
            writer.write(output);
            writer.newLine();
        }

        writer.flush();


    }
}
