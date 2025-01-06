package sorting;

import java.util.Scanner;

public class Boj1427 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력 받은 수를 문자열로 받음
        String input = sc.nextLine();
        
        // 문자열을 char 배열로 변환
        char[] numbers = input.toCharArray();

        // 삽입 정렬 방식으로 내림차순 정렬
        for (int i = 1; i < numbers.length; i++) {
            char temp = numbers[i]; // 현재 값을 temp에 저장
            int j = i - 1;

            // 기준값보다 큰 값을 오른쪽으로 밀어냄
            while (j >= 0 && numbers[j] < temp) {
                numbers[j + 1] = numbers[j];
                j--;
            }

            // 기준값을 적절한 위치에 삽입
            numbers[j + 1] = temp;
        }

        // 정렬된 배열을 문자열로 변환하여 출력
        System.out.println(new String(numbers));
        
        sc.close();
    }
}
