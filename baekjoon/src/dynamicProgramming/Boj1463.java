package dynamicProgramming;

import java.io.IOException;
import java.util.Scanner;

//정수 X에 사용할 수 있는 연산은 다음과 같이 세 가지 이다.
//X가 3으로 나누어 떨어지면, 3으로 나눈다.
//X가 2로 나누어 떨어지면, 2로 나눈다.
//1을 뺀다.
//정수 N이 주어졌을 때, 위와 같은 연산 세 개를 적절히 사용해서 1을 만들려고 한다. 연산을 사용하는 횟수의 최솟값을 출력하시오.

public class Boj1463 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // DP 배열 생성
        int[] dp = new int[n + 1];
        
        // DP 초기값
        dp[1] = 0; // 1은 0번의 연산으로 1이 된다.
        
        for (int i = 2; i <= n; i++) {
            // 기본적으로 1을 빼는 연산
            dp[i] = dp[i - 1] + 1;
            
            // 2로 나누어 떨어질 때
            if (i % 2 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            }
            
            // 3으로 나누어 떨어질 때
            if (i % 3 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 3] + 1);
            }
        }
        
        // 결과 출력
        System.out.println(dp[n]);
	}
}
