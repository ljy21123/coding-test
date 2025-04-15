import java.util.*;

/*
 * 최근에 삽입한 데이터를 대상으로 뭔가 연산해야 한다면 스택을 떠올린다.
 * Deque<>: 스택구조로 사용하면 Stack 클래스보다 빠르고, 큐 구조로 사용하면 Queue 클래스보다 빠르다.
 * */
class Solution {

    boolean solution(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        char[] a = s.toCharArray();

        for (char c : a) {
            if (c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty() || stack.pop() == c)
                    return false;
            }
        }

        return stack.isEmpty();
    }

}