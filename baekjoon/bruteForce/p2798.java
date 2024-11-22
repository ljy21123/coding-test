
import java.util.*;

// 블랙잭
public class p2798 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 카드의 갯수
        int M = sc.nextInt(); // 목표 점수
        int diff = 0;

        int[] num = new int[N];
        List<Integer> sum = new ArrayList<>();
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            num[i] = sc.nextInt();
        }

        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                for (int k = j + 1; k < N; k++) {
                    int hap = num[i] + num[j] + num[k];
                    if (hap <= M) {
                        sum.add(hap);
                    }
                }
            }
        }

        for (int i = 0; i < sum.size(); i++) {
            diff = M - sum.get(i);
            result.add(diff);
        }

        System.out.println(M - Collections.min(result));

        sc.close();

    }

}
