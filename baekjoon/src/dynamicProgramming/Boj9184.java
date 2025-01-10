package dynamicProgramming;

import java.util.Scanner;

//if a <= 0 or b <= 0 or c <= 0, then w(a, b, c) returns:
//    1
//
//if a > 20 or b > 20 or c > 20, then w(a, b, c) returns:
//    w(20, 20, 20)
//
//if a < b and b < c, then w(a, b, c) returns:
//    w(a, b, c-1) + w(a, b-1, c-1) - w(a, b-1, c)
//
//otherwise it returns:
//    w(a-1, b, c) + w(a-1, b-1, c) + w(a-1, b, c-1) - w(a-1, b-1, c-1)

public class Boj9184 {
//	계산된 값을 중간 저장함으로써 연산횟수를 줄임
    static int[][][] dp = new int[21][21][21];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            // 종료 조건
            if (a == -1 && b == -1 && c == -1) {
                break;
            }

            System.out.printf("w(%d, %d, %d) = %d\n", a, b, c, w(a, b, c));
        }
    }

    static int w(int a, int b, int c) {
        // 기저 조건
        if (a <= 0 || b <= 0 || c <= 0) {
            return 1;
        }

        // 이미 계산된 값이 있다면 반환
        if (a <= 20 && b <= 20 && c <= 20 && dp[a][b][c] != 0) {
            return dp[a][b][c];
        }

        // a, b, c가 20을 초과하면 w(20, 20, 20)으로 처리
        if (a > 20 || b > 20 || c > 20) {
            return dp[20][20][20] = w(20, 20, 20);
        }

        // 재귀 호출 및 계산값 저장
        dp[a][b][c] = w(a - 1, b, c)
                    + w(a - 1, b - 1, c)
                    + w(a - 1, b, c - 1)
                    - w(a - 1, b - 1, c - 1);

        return dp[a][b][c];
    }
}

