package dataStructure;

import java.util.Scanner;

//������ �־�����, �� ���� ���� �������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
//ù° �ٿ� ���� n�� �־�����. (0 �� n < 2�� 63��)
//ù° �ٿ� q��2�� �� n�� ���� ���� ���� �ƴ� ���� q�� ����Ѵ�.
public class Boj2417 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		
		System.out.println(binarySearch(n));
	}

	private static long binarySearch(long n) {
		long q = (long) Math.sqrt(n);
//		q��2�� �� n�̹Ƿ� q��2����<n �� ��� 1�� ������
		if(q*q < n) return q+1;
		return q;
	}
}
