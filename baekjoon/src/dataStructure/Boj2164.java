package dataStructure;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//
//N���� ī�尡 �ִ�. ������ ī��� ���ʷ� 1���� N������ ��ȣ�� �پ� ������, 
//1�� ī�尡 ���� ����, N�� ī�尡 ���� �Ʒ��� ���·� ������� ī�尡 ���� �ִ�.
//���� ������ ���� ������ ī�尡 �� �� ���� ������ �ݺ��ϰ� �ȴ�. 
//�켱, ���� ���� �ִ� ī�带 �ٴڿ� ������. �� ����, ���� ���� �ִ� ī�带 ���� �Ʒ��� �ִ� ī�� ������ �ű��.
//���� ��� N=4�� ��츦 ������ ����. 
//ī��� ���� ���������� 1234 �� ������ �����ִ�. 1�� ������ 234�� ���´�. 
//���⼭ 2�� ���� �Ʒ��� �ű�� 342�� �ȴ�. 3�� ������ 42�� �ǰ�, 4�� ������ �ű�� 24�� �ȴ�. 
//���������� 2�� ������ ����, ���� ī��� 4�� �ȴ�.
//N�� �־����� ��, ���� �������� ���� �Ǵ� ī�带 ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

public class Boj2164 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Queue<Integer> q = new LinkedList<>();
		
		for(int i=1; i<=n; i++) {
			q.add(i);
		}
		
//		ī�带 �����ų� ī�带 �� �ڷ� ������ ������ ������ �����ϰ� �ϱ� ���� �ε���
		int index = 1;
		
		while(q.size()>1) {
//			ù ���࿡���� ī�� ����
			if(index%2 != 0)
			q.remove();
			
			else {
//				���� ���࿡���� ī�带 �� �ڷ� �̵�
				Integer temp = q.poll();
				q.add(temp);
			}
			index++;
		}
		
		System.out.println(q.peek());
	}
}
