package dynamicProgramming;

import java.io.IOException;
import java.util.Scanner;

//���� X�� ����� �� �ִ� ������ ������ ���� �� ���� �̴�.
//X�� 3���� ������ ��������, 3���� ������.
//X�� 2�� ������ ��������, 2�� ������.
//1�� ����.
//���� N�� �־����� ��, ���� ���� ���� �� ���� ������ ����ؼ� 1�� ������� �Ѵ�. ������ ����ϴ� Ƚ���� �ּڰ��� ����Ͻÿ�.

public class Boj1463 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // DP �迭 ����
        int[] dp = new int[n + 1];
        
        // DP �ʱⰪ
        dp[1] = 0; // 1�� 0���� �������� 1�� �ȴ�.
        
        for (int i = 2; i <= n; i++) {
            // �⺻������ 1�� ���� ����
            dp[i] = dp[i - 1] + 1;
            
            // 2�� ������ ������ ��
            if (i % 2 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            }
            
            // 3���� ������ ������ ��
            if (i % 3 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 3] + 1);
            }
        }
        
        // ��� ���
        System.out.println(dp[n]);
	}
}
