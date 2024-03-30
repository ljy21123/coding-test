package Bronze.Bronze_II;

import java.util.Scanner;

// 알고리즘 수업 - 알고리즘의 수행 시간 6
public class p24267 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        // 배열 A 에서 가능한 모든 세 요소의 조합의 곱 횟수 = nC3
        long result = (n*(n-1)*(n-2))/6;

        System.out.println(result);
        System.out.println(3);

        sc.close();

    }

}
