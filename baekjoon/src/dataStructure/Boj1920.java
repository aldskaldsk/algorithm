package dataStructure;

import java.util.ArrayList;
import java.util.Scanner;

//N���� ���� A[1], A[2], ��, A[N]�� �־��� ���� ��, �� �ȿ� X��� ������ �����ϴ��� �˾Ƴ��� ���α׷��� �ۼ��Ͻÿ�.
//�Է�
//ù° �ٿ� �ڿ��� N(1 �� N �� 100,000)�� �־�����. 
//���� �ٿ��� N���� ���� A[1], A[2], ��, A[N]�� �־�����. ���� �ٿ��� M(1 �� M �� 100,000)�� �־�����. 
//���� �ٿ��� M���� ������ �־����µ�, �� ������ A�ȿ� �����ϴ��� �˾Ƴ��� �ȴ�. ��� ������ ������ -231 ���� ũ�ų� ���� 231���� �۴�.
//���
//M���� �ٿ� ���� ����Ѵ�. �����ϸ� 1��, �������� ������ 0�� ����Ѵ�.
public class Boj1920 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		ArrayList<Integer> listM = new ArrayList<Integer>();
		
//		�Է� ���� �������Ÿ� ���� �Է��� �д� ó��
		for(int i=0; i<n; i++) {
			sc.next();
		}
		
		int m = sc.nextInt();
		
		for(int i=0; i<m; i++) {
			listM.add(Integer.parseInt(sc.next()));
		}
		
//		n�Է��� ���� 1~n ������ ���� �迭 �� �ش��ϴ� ���� �˻��ϹǷ� �� �� ���ϴ� ���� �˻�
//		->> ����
		for(int i=0; i<m; i++) {
			if(listM.get(i)<1 || listM.get(i)>n)System.out.println(0);
			else System.out.println(1);
		}
	}

}
