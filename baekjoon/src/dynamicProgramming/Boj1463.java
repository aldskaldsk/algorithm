package dynamicProgramming;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Boj1463 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
//		int i = 0;
//		int cnt = 0;
//		ArrayList<Integer> list = new ArrayList();
//		list.add(n);
//		
//		while(!list.contains(1)) {
//			if(list.get(i)%3 == 0) {
//				list.add(list.get(i)/3);
//				list.add(list.get(i)-1);
//				if(cnt>0)
//				cnt--;
//			}
//			else if(list.get(i)%2 ==0) {
//				list.add(list.get(i)/2);
//				list.add(list.get(i)-1);
//				if(cnt>0)
//				cnt--;
//			}
//			else {
//				list.add(list.get(i)-1);				
//			}
//			i++;
//			cnt++;
//		}
//		System.out.println(list);
//		System.out.println(cnt);
		
		// DP �迭 ����
        int[] dp = new int[n + 1];
        
        // �ʱⰪ ����
        dp[1] = 0; // 1�� �̹� 1�̹Ƿ� ���� Ƚ�� 0

//        dp[i] ���� �����ϴ� �ּ����� ���� ���ڸ� ���� 
        
        // Bottom-up ������� DP ���̺� ä���
        for (int i = 2; i <= n; i++) {
            // �⺻������ i���� 1�� �� ���
            dp[i] = dp[i - 1] + 1;

            // i�� 2�� ������ �������� ���
            if (i % 2 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            }

            // i�� 3���� ������ �������� ���
            if (i % 3 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 3] + 1);
            }
        }

        // ��� ���
        System.out.println(dp[n]);
	}
}
