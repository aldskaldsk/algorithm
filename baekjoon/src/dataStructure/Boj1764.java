package dataStructure;

import java.util.Scanner;
import java.util.TreeSet;

//�������� �赵 ���� ����� ��ܰ�, ���� ���� ����� ����� �־��� ��, �赵 ���� ���� ����� ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
//�Է�
//ù° �ٿ� �赵 ���� ����� �� N, ���� ���� ����� �� M�� �־�����. 
//�̾ ��° �ٺ��� N���� �ٿ� ���� �赵 ���� ����� �̸���, N+2° �ٺ��� ���� ���� ����� �̸��� ������� �־�����. 
//�̸��� ���� ���� ���ĺ� �ҹ��ڷθ� �̷������, �� ���̴� 20 �����̴�. N, M�� 500,000 ������ �ڿ����̴�.
//�赵 ���� ����� ��ܿ��� �ߺ��Ǵ� �̸��� ������, ���� ���� ����� ��ܵ� ���������̴�.
public class Boj1764 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.nextLine(); //���๮������
		
//		�������� ���ϰ� �����ؼ� ����ϱ� ���� TreeSet���� ����
		TreeSet<String> setN = new TreeSet<String>();
		TreeSet<String> setM = new TreeSet<String>();
		
		for(int i=0; i<n; i++) {
			setN.add(sc.nextLine());
		}
		for(int i=0; i<m; i++) {
			setM.add(sc.nextLine());
		}
		
		setN.retainAll(setM);
		
		System.out.println(setN.size());
		
		for(String result : setN) {
			System.out.println(result);
		}
		
	}
	
}
