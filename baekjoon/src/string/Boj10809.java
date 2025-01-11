package string;

import java.util.Scanner;
//알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 
//포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.

public class Boj10809 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		알파벳 개수 = 26
		int[] alphabet = new int[26];
//		초기값 세팅
		for(int i=0; i<alphabet.length; i++) {
			alphabet[i] = -1;
		}
		
		String input = sc.nextLine();
		char[] arr = input.toCharArray();
		
		for(int i=0; i<arr.length; i++) {
//			소문자 a의 아스키코드는 97이므로 입력 단어의 철자에서 97을 빼서 사용
			int n = arr[i]-97;
//			첫 번째 위치를 저장해야 하므로 초기값이 아니라면 패스
			if(alphabet[n]==-1)
//			입력단어 철자의 인덱스 값을 알파벳 배열에 저장
			alphabet[n] = i;
		}
		
		for(int n:alphabet) {
			System.out.print(n+" ");
		}
	}
}
