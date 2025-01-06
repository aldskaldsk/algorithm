package sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj24060 {
    static int saveCount = 0; // ���� Ƚ�� ����
    static int result = -1;   // K��° ����Ǵ� ���� ����

    private static void mergeSort(int[] arr, int[] tmp, int start, int end, int K) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(arr, tmp, start, mid, K); // ���� �κ� �迭 ����
            mergeSort(arr, tmp, mid + 1, end, K); // ������ �κ� �迭 ����
            merge(arr, tmp, start, mid, end, K); // ����
        }
    }

    private static void merge(int[] arr, int[] tmp, int start, int mid, int end, int K) {
        for (int i = start; i <= end; i++) {
            tmp[i] = arr[i]; // �迭 ����
        }
        int part1 = start; // ���� �迭�� ù �ε���
        int part2 = mid + 1; // ������ �迭�� ù �ε���
        int index = start;

        while (part1 <= mid && part2 <= end) {
            if (tmp[part1] <= tmp[part2]) {
                arr[index] = tmp[part1++];
            } else {
                arr[index] = tmp[part2++];
            }
            saveCount++; // ���� Ƚ�� ����
            if (saveCount == K) {
                result = arr[index]; // K��° ����Ǵ� ���� ����
            }
            index++;
        }

        while (part1 <= mid) {
            arr[index++] = tmp[part1++];
            saveCount++;
            if (saveCount == K) {
                result = arr[index - 1];
            }
        }

        while (part2 <= end) {
            arr[index++] = tmp[part2++];
            saveCount++;
            if (saveCount == K) {
                result = arr[index - 1];
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // �迭 A�� ũ��
        int K = Integer.parseInt(st.nextToken()); // ���� Ƚ�� K

        int[] arr = new int[N];
        int[] tmp = new int[N]; // ���տ� ����� �ӽ� �迭

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        mergeSort(arr, tmp, 0, N - 1, K);

        System.out.println(result); // K��° ����� �� ��� (-1�̸� ���� Ƚ�� ����)
    }
}
