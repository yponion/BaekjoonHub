import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        process();
    }

    public static void process() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] nm;
        int[] sequence;
        int cnt = 0;
        int tmp;
        try {
            nm = strToIntAry(br.readLine());
            sequence = strToIntAry(br.readLine());
            br.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // 덱 생성및 데이터 삽입
        Deque<Integer> deque = new LinkedList<>();
        for (int i = 0; i < nm[0]; i++) {
            deque.add(i + 1);
        }

        // 이동의 최솟값 찾기
        boolean existFront;
        Iterator<Integer> iterator;
        for (int i = 0; i < nm[1]; i++) { // 원소들을 순서대로 뽑아냄
            existFront = false;
            iterator = deque.iterator();
            for (int j = 0; j < Math.ceil(deque.size() / 2.0); j++) { // 뽑아내려고 하는 원소가 덱 앞부분 절반에 위치하는지 확인
                if (iterator.next() == sequence[i]) { // Iterator를 이용한 순회
                    for (int k = 0; k < j; k++) {
                        deque.addLast(deque.removeFirst());
                        cnt++;
                    }

                    // 뽑아낸 값 확인 test code
//                    System.out.println(deque.removeFirst());

                    deque.removeFirst();
                    existFront = true;
                    break;
                }
            }

            if (!existFront) { // 덱의 후미의 값을 머리에 넣으며 뽑아낼 값 찾기
                for (int k = 0; k < deque.size() / 2; k++) {
                    tmp = deque.removeLast();
                    cnt++;
                    if (tmp == sequence[i]) {

                        // 뽑아낸 값 확인 test code
//                        System.out.println(tmp);
                        break;
                    } else {
                        deque.addFirst(tmp);
                    }
                }
            }
        }
        
        // 최종 덱 확인 test code
//        System.out.println(deque);

        // 출력
        System.out.println(cnt);
        // ----- 출력
    }

    // String -> int[]
    public static int[] strToIntAry(String str) {
        String[] strAry = str.split(" ");
        int[] intAry = new int[strAry.length];
        for (int i = 0; i < strAry.length; i++) {
            intAry[i] = Integer.parseInt(strAry[i]);
        }
        return intAry;
    }
}