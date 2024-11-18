package Bronze.Bronze_III;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 세 막대
public class p14215 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int max1 = Math.max(Math.max(a, b), c);
        int max2 = max1;

        // 삼각형의 조건: 두 변의 길이의 합이 나머지 한 변의 길이보다 커야 한다
        while (max2 >= (a + b + c - max1))
            max2--;

        System.out.println((a + b + c - max1) + max2);

    }

}
