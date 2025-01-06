package dynamicProgramming;

import java.util.Scanner;

//���

public class Boj2579 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ��� ���� �Է�
        int n = scanner.nextInt();

        // ��� ���� �迭 ����
        int[] stairs = new int[n + 1];
        
        for (int i = 1; i <= n; i++) {
            stairs[i] = scanner.nextInt();
        }

        // dp �迭 ����
        int[] dp = new int[n + 1];

        // �ʱ� �� ����
        if (n == 1) {
            System.out.println(stairs[1]);
            return;
        }
        
        dp[1] = stairs[1];
        dp[2] = stairs[1] + stairs[2];

//        i��° ��ܿ� ������ �������� �� ���� ����� ���� ���� �� ū ���
        for (int i = 3; i <= n; i++) {
            dp[i] = Math.max(dp[i - 2], dp[i - 3] + stairs[i - 1]) + stairs[i];
        }

        // ��� ���
        System.out.println(dp[n]);
    }
		
}
