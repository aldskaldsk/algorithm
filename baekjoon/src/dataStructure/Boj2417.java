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
		long start = 0, end = (long) Math.pow(2, 32);
		
		while (start < end) {
			long mid = (start + end) / 2;
			
			// mid^2�� n ��
			if (mid * mid >= n) {
				end = mid; // mid�� ������ �� ���ɼ��� �����Ƿ� end�� ����
			} else {
				start = mid + 1; // mid�� �ʹ� �����Ƿ� start�� �ø�
			}
		}
		return start; // while���� ������ �� start�� �ּ� q���� ��
	}
}
