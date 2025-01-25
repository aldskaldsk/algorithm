package dataStructure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//�似Ǫ�� ������ ������ ����.
//1������ N������ N���� ����� ���� �̷�鼭 �ɾ��ְ�, ���� ���� K(�� N)�� �־�����.
//���� ������� K��° ����� �����Ѵ�. �� ����� ���ŵǸ� ���� ������ �̷���� ���� ���� �� ������ ����� ������. 
//�� ������ N���� ����� ��� ���ŵ� ������ ��ӵȴ�. ������ ������� ���ŵǴ� ������ (N, K)-�似Ǫ�� �����̶�� �Ѵ�. 
//���� ��� (7, 3)-�似Ǫ�� ������ <3, 6, 2, 7, 5, 1, 4>�̴�.
//N�� K�� �־����� (N, K)-�似Ǫ�� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

public class Boj1158 {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // N��
        int k = sc.nextInt(); // K��°

        ArrayList<Integer> q = new ArrayList<>();

        // 1������ N������ �߰�
        for (int i = 1; i <= n; i++) {
            q.add(i);
        }

//      ����� ���� ����
        StringBuilder result = new StringBuilder();
        result.append("<");

        int index = 0;
        while (!q.isEmpty()) {
            index = (index + k - 1) % q.size(); // K��° ��� ����
            result.append(q.remove(index)); // ����

            if (!q.isEmpty()) {
                result.append(", ");
            }
        }

        result.append(">\n");
        System.out.print(result);
    }
	

}
