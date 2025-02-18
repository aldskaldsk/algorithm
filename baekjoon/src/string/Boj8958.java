package string;

import java.util.Scanner;

//"OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. O는 문제를 맞은 것이고,
//X는 문제를 틀린 것이다. 문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다. 예를 들어, 10번 문제의 점수는 3이 된다.
//"OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.
//OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.

public class Boj8958 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine(); //  위에서 받은 입력으로부터 \n 제거
		
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
