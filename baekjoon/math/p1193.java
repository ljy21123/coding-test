
import java.util.Scanner;

// 분수찾기
public class p1193 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = 0; // 분자
        int b = 0; // 분모
        int line = 1; // 라인 번호
        int X = scanner.nextInt(); // 입력값 (X번째 분수)

        // 1/1                   line 1
        // 1/2 2/1               line 2
        // 3/1 2/2 1/3           line 3
        // 1/4 2/3 3/2 4/1       line 4
        // 5/1 4/2 3/3 2/4 1/5   line 5

        // 라인, 위치 찾기
        while (line < X) {
            X = X - line;
            line++;
        }

        // 짝수 라인이면
        if (line % 2 == 0) {
            a = X;
            b = line - X + 1;
        }
        // 홀수 라인이면
        else {
            a = line - X + 1;
            b = X;
        }

        System.out.println(a + "/" + b);

    }

}

