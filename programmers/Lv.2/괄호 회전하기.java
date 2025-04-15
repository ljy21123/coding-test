import java.util.*;

/*
 * charAt(): String으로 저장된 문자열 중에서 한 글자만 선택해서 char타입으로 변환해준다.
 * containsKey(key): 맵에서 인자로 보낸 키가 있으면 true 없으면 false를 반환한다.
 * containsValue(value): 맵에서 인자로 보낸 값이 있으면 true 없으면 false를 반환한다.
 *
 * for문 쓸 때 앞에 A:를 붙이면 for문에 이름을 붙인다, 이후 continue A;를 하면 A:for문으로 이동한다.
 * */
class Solution {
    public int solution(String s) {
        // 괄호 정보를 저장
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');

        // 원본 문자열 길이 저장
        int n = s.length();

        // 원본 문자열을 2번 이어붙임
        StringBuilder sb = new StringBuilder();
        sb.append(s).append(s);
        String str = sb.toString();

        // 개수(답)를 저장 할 변수
        int x = 0;

        // 문자열을 왼쪽으로 n번 회전
        A:for (int i = 0; i < n; i++) {
            Deque<Character> stack = new ArrayDeque<>();
            // 각 문자열의 i(시작 위치)부터 확인
            for (int j = i; j < i + n; j++) {
                char c = str.charAt(j);
                // 해시맵 안에 해당 키가 없으면 열린 괄호니까 푸시
                if (!map.containsKey(c)) {
                    stack.push(c);
                } else {
                    // 짝이 안맞으면 A for문으로 이동(실패), 맞으면 상쇄하면서 스택을 비움(성공)
                    if (stack.isEmpty() || !stack.pop().equals(map.get(c)))
                        continue A;
                }
            }
            // continue 되지 않으면 올바른 괄호 문자열
            if (stack.isEmpty())
                x++;
        }

        return x;
    }
}