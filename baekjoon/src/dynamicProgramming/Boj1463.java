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
		
		// DP 배열 선언
        int[] dp = new int[n + 1];
        
        // 초기값 설정
        dp[1] = 0; // 1은 이미 1이므로 연산 횟수 0

//        dp[i] 까지 도달하는 최소한의 연산 숫자를 갱신 
        
        // Bottom-up 방식으로 DP 테이블 채우기
        for (int i = 2; i <= n; i++) {
            // 기본적으로 i에서 1을 뺀 경우
            dp[i] = dp[i - 1] + 1;

            // i가 2로 나누어 떨어지는 경우
            if (i % 2 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            }

            // i가 3으로 나누어 떨어지는 경우
            if (i % 3 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 3] + 1);
            }
        }

        // 결과 출력
        System.out.println(dp[n]);
	}
}
