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
        
        // �� ���� ���� �Է¹ޱ�
        String[] input = br.readLine().split(" ");
        int[] numbers = new int[3];
        for (int i = 0; i < 3; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }
        
        // �� ��°�� ū �� ã��
        for (int i = 0; i < 2; i++) { // �� ���� ���� (ū ���� �ڷ� ������)
            for (int j = 0; j < 2 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    // �� ���� ��ȯ
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        
        // ���� �� ��� �� ��� (�� ��°�� ū ��)
        System.out.println(numbers[1]);
    }
}
