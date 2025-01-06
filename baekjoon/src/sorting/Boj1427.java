package sorting;

import java.util.Scanner;

public class Boj1427 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // �Է� ���� ���� ���ڿ��� ����
        String input = sc.nextLine();
        
        // ���ڿ��� char �迭�� ��ȯ
        char[] numbers = input.toCharArray();

        // ���� ���� ������� �������� ����
        for (int i = 1; i < numbers.length; i++) {
            char temp = numbers[i]; // ���� ���� temp�� ����
            int j = i - 1;

            // ���ذ����� ū ���� ���������� �о
            while (j >= 0 && numbers[j] < temp) {
                numbers[j + 1] = numbers[j];
                j--;
            }

            // ���ذ��� ������ ��ġ�� ����
            numbers[j + 1] = temp;
        }

        // ���ĵ� �迭�� ���ڿ��� ��ȯ�Ͽ� ���
        System.out.println(new String(numbers));
        
        sc.close();
    }
}
