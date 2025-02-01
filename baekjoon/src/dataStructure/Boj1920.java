package dataStructure;

import java.util.ArrayList;
import java.util.Scanner;

//N개의 정수 A[1], A[2], …, A[N]이 주어져 있을 때, 이 안에 X라는 정수가 존재하는지 알아내는 프로그램을 작성하시오.
//입력
//첫째 줄에 자연수 N(1 ≤ N ≤ 100,000)이 주어진다. 
//다음 줄에는 N개의 정수 A[1], A[2], …, A[N]이 주어진다. 다음 줄에는 M(1 ≤ M ≤ 100,000)이 주어진다. 
//다음 줄에는 M개의 수들이 주어지는데, 이 수들이 A안에 존재하는지 알아내면 된다. 모든 정수의 범위는 -231 보다 크거나 같고 231보다 작다.
//출력
//M개의 줄에 답을 출력한다. 존재하면 1을, 존재하지 않으면 0을 출력한다.
public class Boj1920 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		ArrayList<Integer> listM = new ArrayList<Integer>();
		
//		입력 도중 오류제거를 위한 입력을 읽는 처리
		for(int i=0; i<n; i++) {
			sc.next();
		}
		
		int m = sc.nextInt();
		
		for(int i=0; i<m; i++) {
			listM.add(Integer.parseInt(sc.next()));
		}
		
//		n입력을 받은 1~n 까지의 숫자 배열 중 해당하는 지를 검사하므로 그 중 속하는 지를 검사
//		->> 오답
		for(int i=0; i<m; i++) {
			if(listM.get(i)<1 || listM.get(i)>n)System.out.println(0);
			else System.out.println(1);
		}
	}

}
