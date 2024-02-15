import java.util.Arrays;

class Solution {
    public int solution(String[] friends, String[] gifts) {

        // 주고 받은 선물 표 생성
        int gift[][] = new int[friends.length][friends.length];
        String giftSplit[];
        int x = 0;
        int y = 0;
        for (int i = 0; i < gifts.length; i++) {
            giftSplit = gifts[i].split(" ");
            for (int j = 0; j < friends.length; j++) {
                if (giftSplit[0].equals(friends[j])) {
                    x = j;
                    break;
                }
            }
            for (int j = 0; j < friends.length; j++) {
                if (giftSplit[1].equals(friends[j])) {
                    y = j;
                    break;
                }
            }
            gift[x][y]++;
        }

//        // 주고 받은 선물 표 확인 test code
//        System.out.println("주고 받은 선물 표");
//        for (int i = 0; i < gift.length; i++) {
//            for (int j = 0; j < gift[0].length; j++) {
//                System.out.print(gift[i][j] + " ");
//            }
//            System.out.println();
//        }
//        System.out.println();
//        //---------- test code

        // 선물 지수 계산
        int giftValue[] = new int[friends.length];
        int give, receive;
        for (int i = 0; i < giftValue.length; i++) {
            give = 0;
            receive = 0;
            for (int j = 0; j < gift.length; j++) {
                give += gift[i][j];
                receive += gift[j][i];
            }
            giftValue[i] = give - receive;
        }

//        // 선물 지수 배열 확인 test code
//        System.out.println("선물 지수");
//        for (int i : giftValue)
//            System.out.print(i + " ");
//        System.out.println();
//        System.out.println();
//        //---------- test code

        // 선물 받은 개수 계산 배열
        int[] receiveGiftCount = new int[friends.length];
        for (int i = 0; i < friends.length; i++) {
            for (int j = i; j < friends.length; j++) {
                if (i != j) {
                    if (gift[i][j] < gift[j][i]) {
                        receiveGiftCount[j]++;
                    } else if (gift[i][j] > gift[j][i]) {
                        receiveGiftCount[i]++;
                    } else {
                        if (giftValue[i] > giftValue[j]) {
                            receiveGiftCount[i]++;
                        } else if (giftValue[i] < giftValue[j]) {
                            receiveGiftCount[j]++;
                        }
                    }
                }
            }
        }

//        // 선물 받은 개수 확인 test code
//        System.out.println("선물 받은 개수");
//        for (int i = 0; i < receiveGiftCount.length; i++) {
//            System.out.print(receiveGiftCount[i] + " ");
//        }
//        System.out.println();
//        System.out.println();
//        // --------- test code

        Arrays.sort(receiveGiftCount);
        return receiveGiftCount[receiveGiftCount.length - 1];
    }
}