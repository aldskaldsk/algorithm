package backTracking;

import java.util.Scanner;

public class Boj15649 {

    static int n; // 1���� n������ ����
    static int m; // �� ������ ����
    static int[] sequence; // ���� ���õ� ���ڵ��� ������ �迭
    static boolean[] visited; // ������ �湮 ���θ� üũ�ϴ� �迭

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // n�� m �Է� �ޱ�
        n = sc.nextInt();
        m = sc.nextInt();

        // �迭 �ʱ�ȭ
        sequence = new int[m];
        visited = new boolean[n + 1]; // 1���� n���� ����ϹǷ� n+1 ũ�� �Ҵ�

        // ��Ʈ��ŷ ����
        backtrack(0);

        sc.close();
    }

    // ��Ʈ��ŷ �Լ�
    public static void backtrack(int depth) {
        // ������ ���̰� m�̸� ���
        if (depth == m) {
            printSequence();
            return;
        }

        // 1���� n���� ���ڸ� Ȯ��
        for (int i = 1; i <= n; i++) {
            // �̹� ����� ���ڴ� �ǳʶڴ�
            if (!visited[i]) {
                // ���� ���� �� �湮 ó��
                sequence[depth] = i;
                visited[i] = true;

                // ���� �ܰ�� �̵�
                backtrack(depth + 1);

                // ��Ʈ��ŷ: ���� ��� �� �湮 ���� �ʱ�ȭ
                visited[i] = false;
            }
        }
    }

    // ���� ������ ����ϴ� �Լ�
    public static void printSequence() {
        for (int i = 0; i < m; i++) {
            System.out.print(sequence[i] + " ");
        }
        System.out.println();
    }
}
