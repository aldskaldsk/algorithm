package sorting;

import java.util.Scanner;

public class Boj2750 {
//	����
//	N���� ���� �־����� ��, �̸� ������������ �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//	�Է�
//	ù° �ٿ� ���� ���� N(1 �� N �� 1,000)�� �־�����. ��° �ٺ��� N���� �ٿ��� ���� �־�����. �� ���� ������ 1,000���� �۰ų� ���� �����̴�. ���� �ߺ����� �ʴ´�.
//	���
//	ù° �ٺ��� N���� �ٿ� ������������ ������ ����� �� �ٿ� �ϳ��� ����Ѵ�.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		������ ����
		int n = sc.nextInt();
		int[] array = new int[n];
		
//		�Է�
		for(int i=0; i<n; i++) {
			array[i] = sc.nextInt();
		}
		
//		����
		for(int j=0; j<n-1; j++) {
		for(int i=0; i<n-1; i++) {
			if(array[i] > array[i+1]){
				int a = array[i];
				array[i] = array[i+1];
				array[i+1] = a;
			}
		}
		}
		
//		���
		for(int i=0; i<n; i++) {
			System.out.println(array[i]);
		}
		
	}
	
}
