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

	public static int divideAndConquer(int a, int b, int c) {
		if(b==0) return 1%c;
		
//		a�� b���� a�� b/2 * a�� b/2�� �����ؼ� ��� ??
		
		
		return 0;
	}
}
