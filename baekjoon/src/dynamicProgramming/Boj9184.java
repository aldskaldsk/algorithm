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
//	���� ���� �߰� ���������ν� ����Ƚ���� ����
    static int[][][] dp = new int[21][21][21];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            // ���� ����
            if (a == -1 && b == -1 && c == -1) {
                break;
            }

            System.out.printf("w(%d, %d, %d) = %d\n", a, b, c, w(a, b, c));
        }
    }

    static int w(int a, int b, int c) {
        // ���� ����
        if (a <= 0 || b <= 0 || c <= 0) {
            return 1;
        }

        // �̹� ���� ���� �ִٸ� ��ȯ
        if (a <= 20 && b <= 20 && c <= 20 && dp[a][b][c] != 0) {
            return dp[a][b][c];
        }

        // a, b, c�� 20�� �ʰ��ϸ� w(20, 20, 20)���� ó��
        if (a > 20 || b > 20 || c > 20) {
            return dp[20][20][20] = w(20, 20, 20);
        }

        // ��� ȣ�� �� ��갪 ����
        dp[a][b][c] = w(a - 1, b, c)
                    + w(a - 1, b - 1, c)
                    + w(a - 1, b, c - 1)
                    - w(a - 1, b - 1, c - 1);

        return dp[a][b][c];
    }
}

