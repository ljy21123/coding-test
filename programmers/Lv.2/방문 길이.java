import java.util.*;

/*
 * 구현 문제에 익숙하지 않은 상태라 어려움이 있었다.
 *
 * 중복을 포함하지 않는다는 문장이 나오면 HashSet, HashMap을 떠올린다.
 * 기능별로 함수를 구현하는게 익숙하지 않으면 일단 전체 동작을 구현해보고 이후 함수로 나누는 연습 하기.
 * 문자열끼리 +로 이을 수 있다.
 *
 * length: 문자열 길이, length(): 배열 길이 헷갈리지 않기.
 * */
class Solution {
    // 좌표 평면을 벗어나는지 확인하는 메서드
    private static boolean isValidMove(int nextX, int nextY) {
        return -5 <= nextX && nextX <= 5 && -5 <= nextY && nextY <= 5;
    }

    // 좌표 이동을 위한 HashMap 생성
    private static final HashMap<Character, int[]> location = new HashMap<>();

    private static void initLocation() {
        location.put('U', new int[]{0, 1});
        location.put('D', new int[]{0, -1});
        location.put('L', new int[]{-1, 0});
        location.put('R', new int[]{1, 0});
    }

    public int solution(String dirs) {
        initLocation();
        int x = 0;
        int y = 0;

        // 겹치는 좌표를 1개로 처리하기 위해 HashSet 사용 (String)
        HashSet<String> coordinates = new HashSet<>();

        // 주어진 명령어대로 이동하면서 좌표 저장
        for (int i = 0; i < dirs.length(); i++) {
            int[] offset = location.get(dirs.charAt(i));    // charAt(i): i번째에 해당하는 문자 반환
            int nextX = x + offset[0];
            int nextY = y + offset[1];

            // 좌표평면을 벗어나면 무효처리
            if (!isValidMove(nextX, nextY))
                continue;

            // A에서 B로 간 경우 B에서 A도 같은 길이니 추가해야 함
            coordinates.add(x + " " + y + " > " + nextX + " " + nextY);
            coordinates.add(nextX + " " + nextY + " > " + x + " " + y);

            // 좌표 업데이트
            x = nextX;
            y = nextY;
        }

        // 이동 시 반대로 간 경우도 추가 했으니 나누기 2
        return coordinates.size() / 2;
    }
}