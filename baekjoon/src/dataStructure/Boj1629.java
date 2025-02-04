package dataStructure;

import java.util.Scanner;

//����
//�ڿ��� A�� B�� ���� ���� �˰� �ʹ�. �� ���Ϸ��� ���� �ſ� Ŀ�� �� �����Ƿ� �̸� C�� ���� �������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
//�Է�
//ù° �ٿ� A, B, C�� �� ĭ�� ���̿� �ΰ� ������� �־�����. A, B, C�� ��� 2,147,483,647 ������ �ڿ����̴�.

public class Boj1629 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		System.out.println(divideAndConquer(a, b, c));
	}

	public static long divideAndConquer(long a, long b, long c) {
		long result = 1;
        long base = a % c; // �ʱⰪ ���� 

        while (b > 0) {
            if (b % 2 == 1) { // Ȧ���̸� result�� base�� ����
                result = (result * base) % c;
            }
            base = (base * base) % c; // base�� ����
            b /= 2; // b�� ������ ����
        }

        return result;
	}
}
