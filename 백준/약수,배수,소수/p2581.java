package Bronze.Bronze_II;
import java.util.Scanner;

// 소수
public class p2581 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int sum = 0;
        boolean first = false;
        int min = 0;

        for (int j = A; j <= B; j++) {

            boolean minority = true;

            if (j == 1) {
                continue;
            } else if (j == 2) {
                minority = true;
            } else {
                for (int i = 2; i < j; i++) {
                    // 2부터 N-1 까지 나눠지는 숫자가 있으면 소수가 아님
                    if (j % i == 0) {
                        minority = false;
                        break;
                    }
                }
            }

            if (minority == true) {
                sum += j;
                if (first == false) {
                    first = true;
                    min = j;
                }
            }
        }

        if (sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }

    }
}