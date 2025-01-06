package backTracking;

import java.util.Scanner;

public class Boj15649 {

    static int n; // 1부터 n까지의 숫자
    static int m; // 고를 숫자의 개수
    static int[] sequence; // 현재 선택된 숫자들을 저장할 배열
    static boolean[] visited; // 숫자의 방문 여부를 체크하는 배열

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // n과 m 입력 받기
        n = sc.nextInt();
        m = sc.nextInt();

        // 배열 초기화
        sequence = new int[m];
        visited = new boolean[n + 1]; // 1부터 n까지 사용하므로 n+1 크기 할당

        // 백트래킹 시작
        backtrack(0);

        sc.close();
    }

    // 백트래킹 함수
    public static void backtrack(int depth) {
        // 수열의 길이가 m이면 출력
        if (depth == m) {
            printSequence();
            return;
        }

        // 1부터 n까지 숫자를 확인
        for (int i = 1; i <= n; i++) {
            // 이미 사용한 숫자는 건너뛴다
            if (!visited[i]) {
                // 숫자 선택 및 방문 처리
                sequence[depth] = i;
                visited[i] = true;

                // 다음 단계로 이동
                backtrack(depth + 1);

                // 백트래킹: 선택 취소 및 방문 상태 초기화
                visited[i] = false;
            }
        }
    }

    // 현재 수열을 출력하는 함수
    public static void printSequence() {
        for (int i = 0; i < m; i++) {
            System.out.print(sequence[i] + " ");
        }
        System.out.println();
    }
}
