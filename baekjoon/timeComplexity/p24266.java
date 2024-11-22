
import java.util.Scanner;

// 알고리즘 수업 - 알고리즘의 수행 시간 5
public class p24266 {

    public static void main(String[] args) {

        // O(N^3)에 대한 문제이다.
        // 시간복잡도, 빅오표기법에 대해 이해해야한다.
        // https://blog.chulgil.me/algorithm/

        // int 기준 n^3은 문제의 조건인 50만 범위를 벗어난다.

        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        System.out.println(n*n*n);
        System.out.println(3);

        sc.close();

    }

}
