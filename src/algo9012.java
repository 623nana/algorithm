
/* 2018-09-04 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class algo9012 {
    public static void main(String [] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        boolean check;

        if( n == 0 ) System.out.println("NO");

        while(n--> 0){
            check = true;
            String input = reader.readLine();

            Stack<Character> stack = new Stack<Character>();

            for(int i = 0; i<input.length(); i++){
                if(input.charAt(i) == '(')
                    stack.push(input.charAt(i));
                else if(input.charAt(i) == ')'){
                    if(!stack.isEmpty())
                        stack.pop();
                    else{
                        check = false;
                        break;
                    }
                }
            }

            if(!stack.isEmpty()) check = false;
            System.out.println(check ? "YES" : "NO");

        }
        reader.close();
    }
}
