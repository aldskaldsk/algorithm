package sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj24060 {
    static int saveCount = 0; // 저장 횟수 추적
    static int result = -1;   // K번째 저장되는 수를 저장

    private static void mergeSort(int[] arr, int[] tmp, int start, int end, int K) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(arr, tmp, start, mid, K); // 왼쪽 부분 배열 정렬
            mergeSort(arr, tmp, mid + 1, end, K); // 오른쪽 부분 배열 정렬
            merge(arr, tmp, start, mid, end, K); // 병합
        }
    }

    private static void merge(int[] arr, int[] tmp, int start, int mid, int end, int K) {
        for (int i = start; i <= end; i++) {
            tmp[i] = arr[i]; // 배열 복사
        }
        int part1 = start; // 왼쪽 배열의 첫 인덱스
        int part2 = mid + 1; // 오른쪽 배열의 첫 인덱스
        int index = start;

        while (part1 <= mid && part2 <= end) {
            if (tmp[part1] <= tmp[part2]) {
                arr[index] = tmp[part1++];
            } else {
                arr[index] = tmp[part2++];
            }
            saveCount++; // 저장 횟수 증가
            if (saveCount == K) {
                result = arr[index]; // K번째 저장되는 값을 저장
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

        int N = Integer.parseInt(st.nextToken()); // 배열 A의 크기
        int K = Integer.parseInt(st.nextToken()); // 저장 횟수 K

        int[] arr = new int[N];
        int[] tmp = new int[N]; // 병합에 사용할 임시 배열

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        mergeSort(arr, tmp, 0, N - 1, K);

        System.out.println(result); // K번째 저장된 값 출력 (-1이면 저장 횟수 부족)
    }
}
