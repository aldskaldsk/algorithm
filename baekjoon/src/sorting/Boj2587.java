package sorting;

import java.util.Scanner;

public class Boj2587 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] ary = new int[5];
        int sum = 0;

        // �迭 �Է� �� �� ���
        for (int i = 0; i < 5; i++) {
            ary[i] = sc.nextInt();
            sum += ary[i];
        }

        // ���� ����
        for (int i = 0; i < ary.length - 1; i++) {
            int minIndex = i; // ���� �ּҰ��� �ε���
            for (int j = i + 1; j < ary.length; j++) {
                if (ary[j] < ary[minIndex]) {
                    minIndex = j; // �� ���� ���� ã���� �ε��� ����
                }
            }
            // ���� ��ġ�� �ּҰ� ��ġ�� ��ȯ
            int temp = ary[i];
            ary[i] = ary[minIndex];
            ary[minIndex] = temp;
        }

        // ��� ���
        System.out.println(sum / 5);

        // �߾Ӱ� ���
        System.out.println(ary[2]); // ���� �� 5���� �߾Ӱ��� �ε��� 2
    }
}
