import java.util.*;

/*
 * 스테이지 번호와 실패율을 짝으로 저장하는 방법, HashMap에 대해 알게되었다.
 * HashMap을 사용하는건 간단하였지만 return할 때 여러 조건이 붙어 복잡했다.
 *
 * .entrySet()
 * > 해당 HashMap의 모든 쌍(엔트리)을 가져온다.
 *
 * .sorted((o1, o2) -> Double.compare(o2.getValue(), o1.getValue()))
 * > 스트림에 있는 엔트리들을 value 값을 기준으로 내림차순으로 정렬한다.
 *
 * .mapToInt(HashMap.Entry::getKey)
 * > 각 엔트리의 key만 추출하여 IntStream으로 변환한다.
 */

class Solution {
    public int[] solution(int N, int[] stages) {

        HashMap<Integer, Double> answer = new HashMap<>();

        // 스테이지 수만큼 반복
        for (int i = 1; i < N + 1; i++) {

            double player = 0;
            double fail = 0;
            double result = 0;

            // 스테이지에 도달한 플레이어 수
            for (int j = 0; j < stages.length; j++) {
                if (i <= stages[j]) {
                    player++;

                    // 스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수
                    if (i == stages[j]) {
                        fail++;
                    }
                }
            }

            // 스테이지의 실패율
            if (player != 0) {
                result = fail/player;
            } else {
                result = 0;
            }

            answer.put(i, result);

        }

        // value를 기준으로 내림차순 정렬 후 key만 배열에 담아 반환
        return answer.entrySet().stream().sorted((o1, o2) -> Double.compare(o2.getValue(), o1.getValue()))
                .mapToInt(HashMap.Entry::getKey).toArray();

    }
}