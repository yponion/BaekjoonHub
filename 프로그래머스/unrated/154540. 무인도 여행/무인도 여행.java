import java.util.Arrays;

class Solution {
    String[] maps;
    int cnt;
    int[][] result;

    public int[] solution(String[] maps) {

        this.maps = maps;
        cnt = 0;
        result = new int[maps.length][maps[0].length()];

        for (int i = 0; i < maps.length; i++) {
            for (int j = 0; j < maps[i].length(); j++) {
                check(i, j, true);
            }
        }

//        for (int i = 0; i<result.length; i++){
//            for (int j = 0; j<result[0].length; j++){
//                System.out.print(result[i][j]+ " ");
//            }
//            System.out.println();
//        }
        if (cnt == 0) {
            int[] answer = {-1};
            return answer;
        } else {
            int[] answer = new int[cnt];
            for (int i = 0; i < result.length; i++) {
                for (int j = 0; j < result[0].length; j++) {
                    if (result[i][j] != -1) {
                        answer[result[i][j] - 1] += Integer.parseInt(maps[i].charAt(j) + "");
                    }
                }
            }
            Arrays.sort(answer);
            return answer;
        }
    }

    public void check(int i, int j, boolean plus) {
        if (maps[i].charAt(j) == 'X') {
            result[i][j] = -1;
        } else if (result[i][j] == 0) {
            if (plus) {
                cnt++;
            }
            result[i][j] = cnt;
            if (i == 0 && j == 0) { // 좌상단
                check(i, j + 1, false);
                check(i + 1, j, false);
            } else if (i == 0 && j == maps[0].length() - 1) { // 우상단
                check(i, j - 1, false);
                check(i + 1, j, false);
            } else if (i == maps.length - 1 && j == 0) { // 좌하단
                check(i, j + 1, false);
                check(i - 1, j, false);
            } else if (i == maps.length - 1 && j == maps[0].length() - 1) { // 우하단
                check(i, j - 1, false);
                check(i - 1, j, false);
            } else if (i == 0) { // 상단
                check(i, j - 1, false);
                check(i + 1, j, false);
                check(i, j + 1, false);
            } else if (j == 0) { // 좌측
                check(i - 1, j, false);
                check(i, j + 1, false);
                check(i + 1, j, false);
            } else if (i == maps.length - 1) { // 하단
                check(i, j - 1, false);
                check(i - 1, j, false);
                check(i, j + 1, false);
            } else if (j == maps[0].length() - 1) { // 우측
                check(i - 1, j, false);
                check(i, j - 1, false);
                check(i + 1, j, false);
            } else { // 중앙
                check(i, j - 1, false);
                check(i - 1, j, false);
                check(i, j + 1, false);
                check(i + 1, j, false);
            }
        }
    }
}