package sorting;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

//����
//���ĺ� �ҹ��ڷ� �̷���� N���� �ܾ ������ �Ʒ��� ���� ���ǿ� ���� �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//���̰� ª�� �ͺ���
//���̰� ������ ���� ������
//��, �ߺ��� �ܾ�� �ϳ��� ����� �����ؾ� �Ѵ�.
//�Է�
//ù° �ٿ� �ܾ��� ���� N�� �־�����. 
//(1 �� N �� 20,000) ��° �ٺ��� N���� �ٿ� ���� ���ĺ� �ҹ��ڷ� �̷���� �ܾ �� �ٿ� �ϳ��� �־�����. 
//�־����� ���ڿ��� ���̴� 50�� ���� �ʴ´�.
//���
//���ǿ� ���� �����Ͽ� �ܾ���� ����Ѵ�.

public class Boj1181 {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        // Set�� ����Ͽ� �ߺ� ����
        Set<String> wordsSet = new HashSet<>();
        for (int i = 0; i < n; i++) {
            wordsSet.add(sc.nextLine());
        }

        // �ߺ� ���ŵ� �ܾ���� ����Ʈ�� ��ȯ
        List<String> wordsList = new ArrayList<>(wordsSet);
       
        // ����: ���� ���� -> ���̰� ������ ������
        wordsList.sort((a, b) -> {
            if (a.length() == b.length()) {
                return a.compareTo(b);
            }
//            ���� ���ذ� ��ȯ
            return a.length() - b.length();
        });

        // ��� ���
        for (String word : wordsList) {
            System.out.println(word);
        }
    }
}

