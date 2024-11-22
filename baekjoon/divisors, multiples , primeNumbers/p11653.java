
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import static java.lang.Math.sqrt;

// 소인수분해
public class p11653 {

    private void primeFactorization(int n) {

        for (int i = 2; i <= sqrt(n); i++) {
            while (n % i == 0) {
                System.out.println(i);
                n /= i;
            }
        }

        if (n != 1) {
            System.out.println(n);
        }


    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());

        p11653 ex = new p11653();
        ex.primeFactorization(n);

    }

}
