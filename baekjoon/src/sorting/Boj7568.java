package sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Boj7568 {
//	�츮�� ����� ��ġ�� Ű�� ������, �� �� ���� ������ ǥ���Ͽ� �� ����� �Űܺ����� �Ѵ�. 
//	� ����� �����԰� x kg�̰� Ű�� y cm��� �� ����� ��ġ�� (x, y)�� ǥ�õȴ�. 
//	�� ��� A �� B�� ��ġ�� ���� (x, y), (p, q)��� �� �� x > p �׸��� y > q �̶�� �츮�� A�� ��ġ�� B�� ��ġ���� "�� ũ��"�� ���Ѵ�. 
//	���� ��� � A, B �� ����� ��ġ�� ���� (56, 177), (45, 165) ��� �Ѵٸ� A�� ��ġ�� B���� ū ���� �ȴ�. 
//	�׷��� ���� �ٸ� ��ġ���� ũ�⸦ ���� �� ���� ��쵵 �ִ�. ���� ��� �� ��� C�� D�� ��ġ�� ���� (45, 181), (55, 173)�̶�� �����Դ� D�� C���� �� ���̰�, Ű�� C�� �� ũ�Ƿ�, "��ġ"�θ� �� �� C�� D�� ������ ���溸�� �� ũ�ٰ� ���� �� ����.
//	N���� ���ܿ��� �� ����� ��ġ ����� �ڽź��� �� "ū ��ġ"�� ����� ���� ��������. 
//	���� �ڽź��� �� ū ��ġ�� ����� k���̶�� �� ����� ��ġ ����� k+1�� �ȴ�. 
//	�̷��� ����� �����ϸ� ���� ��ġ ����� ���� ����� ���� �� �����ϴ�. �Ʒ��� 5������ �̷���� ���ܿ��� �� ����� ��ġ�� �� ����� ǥ�õ� ǥ�̴�.
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.nextLine());
		sc.nextLine();
		int[][] numbers = new int[n][2];
//		Map<String, Integer> orders = new HashMap<>();
		ArrayList<Integer> orders = new ArrayList<>();
		
		
//		�Է� ������� ����
		for(int i=0; i<n; i++) {
			String input = br.readLine();
			String[] temp = new String[2];
			temp = input.split(" ");
			numbers[i][0] = Integer.parseInt(temp[0]); //0,0 -> 1,0 ...
			numbers[i][1] = Integer.parseInt(temp[1]); //0,1 -> 1,1 ...
			orders.add(i+1); //�⺻ ����
			System.out.println(i);
		}
		
//		 orders -> 12345
//		 numbers -> 01234
		for(int j=0; j<n; j++) {
			for(int k=1; k<n; k++) {
//				Ű�� ������ �� ���� ���
				if(numbers[j][0] < numbers[k][0] && numbers[j][1] < numbers[k][1] ) {
					orders.set(j, orders.get(k));
					orders.set(k, orders.get(j));
				}	
//				Ű�� ���� ���
				if(numbers[j][0] < numbers[k][0] && numbers[j][1] >= numbers[k][1]) {
					orders.set(j, orders.get(k));
				}
//				�����Ը� ���� ���
				if(numbers[j][0] >= numbers[k][0] && numbers[j][1] < numbers[k][1]) {
					orders.set(j, orders.get(k));
				}
//				�Ѵ� ū ���
				else {
					//����
				}
			}
		}
		
		for(int result : orders) {
			System.out.println(result);
		}
		
	}
}
