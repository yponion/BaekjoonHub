import java.util.Stack;
class Solution {
    public boolean solution(String s) {
        boolean answer = true;

        Stack stack =  new Stack();

        for (int  i = 0; i<s.length(); i++){
            if (s.charAt(i) == '('){
                stack.push('(');
            }else {
                if (stack.isEmpty()){
                    answer = false;
                    break;
                }else {
                    stack.pop();
                }
            }
        }
        if (!stack.isEmpty()){
            answer = false;
        }

        return answer;
    }
}