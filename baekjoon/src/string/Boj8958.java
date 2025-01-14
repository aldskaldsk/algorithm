package string;

import java.util.Scanner;

//"OOXXOXXOOO"�� ���� OX������ ����� �ִ�. O�� ������ ���� ���̰�,
//X�� ������ Ʋ�� ���̴�. ������ ���� ��� �� ������ ������ �� �������� ���ӵ� O�� ������ �ȴ�. ���� ���, 10�� ������ ������ 3�� �ȴ�.
//"OOXXOXXOOO"�� ������ 1+2+0+0+1+0+0+1+2+3 = 10���̴�.
//OX������ ����� �־����� ��, ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

public class Boj8958 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine(); //  ������ ���� �Է����κ��� \n ����
		
		String[] arr = new String[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextLine();
		}
		
		for(int i=0; i<n; i++) {
			System.out.println(getScore(arr[i]));
		}
		
		
	}

	public static int getScore(String input) {
		int sum = 0;
		int combo = 0;
		
		for(int i=0; i<input.length(); i++) {
			if(input.charAt(i)=='O') {
				combo++;
				sum += combo;
			}
			else {
				combo = 0;
				sum += combo;
			}
		}
		
		return sum;
	}
}
