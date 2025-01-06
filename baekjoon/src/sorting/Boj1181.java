package sorting;

import java.util.ArrayList;
import java.util.Scanner;

public class Boj1181 {
//	����
//	���ĺ� �ҹ��ڷ� �̷���� N���� �ܾ ������ �Ʒ��� ���� ���ǿ� ���� �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//	���̰� ª�� �ͺ���
//	���̰� ������ ���� ������
//	��, �ߺ��� �ܾ�� �ϳ��� ����� �����ؾ� �Ѵ�.
//	�Է�
//	ù° �ٿ� �ܾ��� ���� N�� �־�����. 
//	(1 �� N �� 20,000) ��° �ٺ��� N���� �ٿ� ���� ���ĺ� �ҹ��ڷ� �̷���� �ܾ �� �ٿ� �ϳ��� �־�����. 
//	�־����� ���ڿ��� ���̴� 50�� ���� �ʴ´�.
//	���
//	���ǿ� ���� �����Ͽ� �ܾ���� ����Ѵ�.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		ArrayList<String> list = new ArrayList<>();
		
		for(int i=0; i<n; i++){
			String word = sc.nextLine();
			if(!list.contains(word)) {
				list.add(word);				
			}
		}
	
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - 1 - i; j++) {
                String current = list.get(j);
                String next = list.get(j + 1);

                // ���ǿ� ���� ���� (���� �켱, ���̰� ������ ������)
                if (current.length() > next.length() ||
                        (current.length() == next.length() && current.compareTo(next) > 0)) {
                    // ��ȯ
                    list.set(j, next);
                    list.set(j + 1, current);
                }
            }
        }
		
		for(String word : list) {
			System.out.println(word);
		}
		
	}
}
