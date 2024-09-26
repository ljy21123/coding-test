package Bronze.Bronze_I;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

// 약수들의 합
public class p9506 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {

            StringTokenizer st = new StringTokenizer(br.readLine(), "");
            int n = Integer.parseInt(st.nextToken());

            // -1을 입력하면 종료
            if (n == -1) {
                break;
            } else {

                ArrayList<Integer> arr = new ArrayList<>();
                int sum = 0;

                System.out.print(n);

                // 완전수 판별
                for (int i = 1; i < n; i++) {
                    if (n % i == 0) {
                        arr.add(i);
                        sum += i;
                    }
                }

                // 완전수일 때
                if (sum == n) {

                    System.out.print(" = ");

                    for (int i = 0; i < arr.size(); i++) {
                        System.out.print(arr.get(i));

                        if (i != arr.size() - 1) {
                            System.out.print(" + ");
                        }
                    }

                    System.out.println();

                } else {
                    // 아닐 때
                    System.out.println(" is NOT perfect.");
                }

            }

        }

    }

}
