package sorting;

import java.util.Scanner;

public class Boj2750 {
//	문제
//	N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
//	입력
//	첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000)이 주어진다. 둘째 줄부터 N개의 줄에는 수가 주어진다. 이 수는 절댓값이 1,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.
//	출력
//	첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		숫자의 개수
		int n = sc.nextInt();
		int[] array = new int[n];
		
//		입력
		for(int i=0; i<n; i++) {
			array[i] = sc.nextInt();
		}
		
//		정렬
		for(int j=0; j<n-1; j++) {
		for(int i=0; i<n-1; i++) {
			if(array[i] > array[i+1]){
				int a = array[i];
				array[i] = array[i+1];
				array[i+1] = a;
			}
		}
		}
		
//		출력
		for(int i=0; i<n; i++) {
			System.out.println(array[i]);
		}
		
	}
	
}
