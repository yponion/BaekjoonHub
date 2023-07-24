import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        int cnt = 0;
        Map<String, String> id = new HashMap<String, String>();
        for(int i = 0; i<record.length; i++){
            String tmpStr[] = record[i].split(" ");
            if(tmpStr[0].equals("Enter")){
                id.put(tmpStr[1], tmpStr[2]);
                cnt++;
            }else if(tmpStr[0].equals("Leave")){
                cnt++;
            }else if(tmpStr[0].equals("Change")){
                id.put(tmpStr[1], tmpStr[2]);
            }else{
                System.out.println("error");
            }
        }
        String[] answer = new String[cnt];
        int index = 0;
        for(int i = 0; i<record.length; i++){
            String tmpStr[] = record[i].split(" ");
            if(tmpStr[0].equals("Enter")){
                answer[index++] = id.get(tmpStr[1])+"님이 들어왔습니다.";
            }else if(tmpStr[0].equals("Leave")){
                answer[index++] = id.get(tmpStr[1])+"님이 나갔습니다.";
            }else if(tmpStr[0].equals("Change")){

            }else{
                System.out.println("error");
            }
        }
        return answer;
    }
}