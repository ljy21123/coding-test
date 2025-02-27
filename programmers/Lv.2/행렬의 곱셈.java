import java.util.*;

/*
 * 일반 배열을 사용하지 않고 ArrayList를 사용해 보았다...
 * 2차원 배열 ArrayList에 대하여 공부가 되었다.
 * 선언 및 변환할 때 각각의 인덱스를 초기화 및 변환하는 과정을 거쳐야한다.
 * */

class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {

        // 곱한 결과를 넣을 2차원 배열
        List<Integer>[] answer = new ArrayList[arr1.length];

        // 각 배열 원소를 ArrayList로 선언
        for (int i = 0; i < arr1.length; i++) {
            answer[i] = new ArrayList<Integer>();
        }

        // 행렬 곱셈
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {

                int temp = 0;

                for (int k = 0; k < arr1[i].length; k++) {
                    temp += arr1[i][k] * arr2[k][j];
                }

                answer[i].add(temp);

            }
        }

        // ArrayList를 각각 int[][]로 변환
        int[][] result = new int[answer.length][];

        for (int i = 0; i < answer.length; i++) {
            result[i] = answer[i].stream().mapToInt(Integer::intValue).toArray();
        }

        return result;

    }
}