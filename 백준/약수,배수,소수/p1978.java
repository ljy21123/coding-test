package Bronze.Bronze_II;

import java.util.Scanner;

// 소수 찾기
public class p1978 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;

        for (int j = 0; j < N; j++) {

            boolean minority = true;
            int num = sc.nextInt();

            if (num == 1) {
                continue;
            } else if (num == 2) {
                minority = true;
            } else {
                for (int i = 2; i < num; i++) {
                    // 2부터 N-1 까지 나눠지는 숫자가 있으면 소수가 아님
                    if (num % i == 0) {
                        minority = false;
                        break;
                    }
                }
            }

            if (minority == true)
                count++;
        }

        System.out.println(count);

    }
}