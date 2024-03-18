package Bronze.Bronze_III;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 대지
public class p9063 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());

        int x1 = -10000;  // xy 최댓값
        int y1 = -10000;
        int x2 = 10000;  // xy 최솟값
        int y2 = 10000;
        int area = 0;  // 넓이

        for (int i = 0; i < N; i++) {

            st = new StringTokenizer(br.readLine(), " ");
            int[] xy = new int[2];
            xy[0] = Integer.parseInt(st.nextToken());
            xy[1] = Integer.parseInt(st.nextToken());

            // xy 최댓값 구하기
            if (x1 < xy[0]) {
                x1 = xy[0];
            }

            if (y1 < xy[1]) {
                y1 = xy[1];
            }

            // xy 최솟값 구하기
            if (x2 > xy[0]) {
                x2 = xy[0];
            }

            if (y2 > xy[1]) {
                y2 = xy[1];
            }

        }

        area = (x1 - x2) * (y1 - y2);
        System.out.println(area);

        br.close();

    }

}
