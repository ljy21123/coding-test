package Bronze.Bronze_III;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 배수와 약수
public class p5086 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String pointer = "";

        // 인텔리제이에서는 프로그램을 종료할때 개행이 입력되지만,
        // 백준에서는 EOF가 입력된다.
        //
        // br.readLine()는 EOF를 입력받으면 null을 반환하기 때문에
        // 백준에서는 NullPointer 에러가 발생한다.
        //
        // 따라서 null을 반환 받았을때 루프문에 접근하지 못하게하여 에러를 방지한다.

        while ((pointer = br.readLine()) != null) {

            st = new StringTokenizer(pointer, " ");

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            if (A == 0 && B == 0) {
                break;
            } else if (B % A == 0) {
                System.out.println("factor");
            } else if (A % B == 0) {
                System.out.println("multiple");
            } else {
                System.out.println("neither");
            }
        }

    }

}
