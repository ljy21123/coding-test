
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 수학은 체육과목 입니다
public class p15894 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력의 최댓값이 10^9 이기 때문에 int는 범위를 벗어난다.
        long n = Long.parseLong(br.readLine());

        System.out.println(n * 4);

    }

}
