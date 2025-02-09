package dataStructure;

import java.util.Scanner;

//정수가 주어지면, 그 수의 정수 제곱근을 구하는 프로그램을 작성하시오.
//첫째 줄에 정수 n이 주어진다. (0 ≤ n < 2의 63승)
//첫째 줄에 q의2승 ≥ n인 가장 작은 음이 아닌 정수 q를 출력한다.
public class Boj2417 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		
		System.out.println(binarySearch(n));
	}

	private static long binarySearch(long n) {
		long q = (long) Math.sqrt(n);
//		q의2승 ≥ n이므로 q의2승이<n 의 경우 1을 더해줌
		if(q*q < n) return q+1;
		return q;
	}
}
