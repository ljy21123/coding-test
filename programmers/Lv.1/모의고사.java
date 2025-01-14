import java.util.*;

class Solution {
    public int[] solution(int[] answers) {  // 정답이 순서대로 들은 배열 answers

        int[][] pattern = {{1,2,3,4,5},
                {2,1,2,3,2,4,2,5},
                {3,3,1,1,2,2,4,4,5,5}};

        // 수포자들의 점수를 저장할 배열
        int[] scores = new int[3];

        for (int i = 0; i < answers.length; i++) {
            for (int j = 0; j < pattern.length; j++) {

                // % pattern[j].length: 수포자의 패턴이 answers 보다 짧으면 처음부터 다시 비교
                if (answers[i] == pattern[j][i % pattern[j].length]) {
                    scores[j]++;
                }

            }
        }

        // scores 배열에서 최대값을 뽑아 반환
        int maxScore = Arrays.stream(scores).max().getAsInt();

        // 최고 점수를 받은 수포자의 번호를 저장할 리스트
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == maxScore) {
                answer.add(i + 1);
            }
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();

    }
}