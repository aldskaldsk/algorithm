package sorting;

import java.util.Scanner;

public class Boj2587 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] ary = new int[5];
        int sum = 0;

        // 배열 입력 및 합 계산
        for (int i = 0; i < 5; i++) {
            ary[i] = sc.nextInt();
            sum += ary[i];
        }

        // 선택 정렬
        for (int i = 0; i < ary.length - 1; i++) {
            int minIndex = i; // 현재 최소값의 인덱스
            for (int j = i + 1; j < ary.length; j++) {
                if (ary[j] < ary[minIndex]) {
                    minIndex = j; // 더 작은 값을 찾으면 인덱스 갱신
                }
            }
            // 현재 위치와 최소값 위치를 교환
            int temp = ary[i];
            ary[i] = ary[minIndex];
            ary[minIndex] = temp;
        }

        // 평균 출력
        System.out.println(sum / 5);

        // 중앙값 출력
        System.out.println(ary[2]); // 정렬 후 5개의 중앙값은 인덱스 2
    }
}
