package Bronze.Bronze_III;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 삼각형과 세 변
public class p5073 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        while (true) {

            st = new StringTokenizer(br.readLine(), " ");
            int[] n = new int[3];
            n[0] = Integer.parseInt(st.nextToken());
            n[1] = Integer.parseInt(st.nextToken());
            n[2] = Integer.parseInt(st.nextToken());

            int max = Math.max(Math.max(n[0],n[1]),n[2]);

            if (n[0] == 0 || n[1] == 0 || n[2] == 0) {
                break;
            } else {

                if (max >= (n[0] + n[1] + n[2]) - max)
                    System.out.println("Invalid");
                else if (n[0] == n[1] && n[0] == n[2] && n[1] == n[2])
                    System.out.println("Equilateral");
                else if (n[0] == n[1] || n[0] == n[2] || n[1] == n[2])
                    System.out.println("Isosceles");
                else if (n[0] != n[1] && n[0] != n[2] && n[1] != n[2])
                    System.out.println("Scalene");


            }

        }

    }

}
