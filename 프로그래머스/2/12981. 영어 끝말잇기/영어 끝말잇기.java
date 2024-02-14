import java.util.HashSet;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};

        HashSet<String> set = new HashSet<>();
        set.add(words[0]);
        for (int i = 1; i < words.length; i++) {
            if ((words[i - 1].charAt(words[i - 1].length() - 1) == words[i].charAt(0)) && !set.contains(words[i])) {
                set.add(words[i]);
            } else {
                int tmp = (i + 1) % n;
                if (tmp == 0) {
                    answer[0] = n;
                } else {
                    answer[0] = tmp;
                }
                answer[1] = (int) Math.ceil((double) (i + 1) / (double) n);
                break;
            }
        }
        return answer;
    }
}