package string;

import java.util.Scanner;
//���ĺ� �ҹ��ڷθ� �̷���� �ܾ� S�� �־�����. ������ ���ĺ��� ���ؼ�, �ܾ ���ԵǾ� �ִ� ��쿡�� ó�� �����ϴ� ��ġ��, 
//���ԵǾ� ���� ���� ��쿡�� -1�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

public class Boj10809 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		���ĺ� ���� = 26
		int[] alphabet = new int[26];
//		�ʱⰪ ����
		for(int i=0; i<alphabet.length; i++) {
			alphabet[i] = -1;
		}
		
		String input = sc.nextLine();
		char[] arr = input.toCharArray();
		
		for(int i=0; i<arr.length; i++) {
//			�ҹ��� a�� �ƽ�Ű�ڵ�� 97�̹Ƿ� �Է� �ܾ��� ö�ڿ��� 97�� ���� ���
			int n = arr[i]-97;
//			ù ��° ��ġ�� �����ؾ� �ϹǷ� �ʱⰪ�� �ƴ϶�� �н�
			if(alphabet[n]==-1)
//			�Է´ܾ� ö���� �ε��� ���� ���ĺ� �迭�� ����
			alphabet[n] = i;
		}
		
		for(int n:alphabet) {
			System.out.print(n+" ");
		}
	}
}
