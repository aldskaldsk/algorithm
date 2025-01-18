package sorting;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Boj10817 {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 세 개의 정수 입력받기
        String[] input = br.readLine().split(" ");
        int[] numbers = new int[3];
        for (int i = 0; i < 3; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }
        
        // 두 번째로 큰 수 찾기
        for (int i = 0; i < 2; i++) { // 두 번만 정렬 (큰 값을 뒤로 보내기)
            for (int j = 0; j < 2 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    // 두 값을 교환
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        
        // 정렬 후 가운데 값 출력 (두 번째로 큰 값)
        System.out.println(numbers[1]);
    }
}
