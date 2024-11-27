import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {

        // 자동으로 중복값 제거, 정렬을 위한 트리셋
        TreeSet<Integer> answer = new TreeSet<>();

        // 서로 다른 인덱스에서 두개의 수 뽑기
        for (int i = 0; i < numbers.length - 1; i++) {      // 배열 끝까지 가면 안되서 length - 1
            for (int j = i + 1; j < numbers.length; j++) {  // i 보다 1 커야 해서 i + 1
                answer.add(numbers[i] + numbers[j]);
            }
        }

        // int[]로 변환 후 반환
        return answer.stream().mapToInt(Integer::intValue).toArray();

    }
}