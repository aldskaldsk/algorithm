package dynamicProgramming;

import java.util.Scanner;

//계단

public class Boj2579 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 계단 개수 입력
        int n = scanner.nextInt();

        // 계단 점수 배열 생성
        int[] stairs = new int[n + 1];
        
        for (int i = 1; i <= n; i++) {
            stairs[i] = scanner.nextInt();
        }

        // dp 배열 생성
        int[] dp = new int[n + 1];

        // 초기 값 설정
        if (n == 1) {
            System.out.println(stairs[1]);
            return;
        }
        
        dp[1] = stairs[1];
        dp[2] = stairs[1] + stairs[2];

//        i번째 계단에 도달할 때까지의 두 가지 방법중 누적 값이 더 큰 방법
        for (int i = 3; i <= n; i++) {
            dp[i] = Math.max(dp[i - 2], dp[i - 3] + stairs[i - 1]) + stairs[i];
        }

        // 결과 출력
        System.out.println(dp[n]);
    }
		
}
