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
		long start = 0, end = (long) Math.pow(2, 32);
		
		while (start < end) {
			long mid = (start + end) / 2;
			
			// mid^2과 n 비교
			if (mid * mid >= n) {
				end = mid; // mid가 정답이 될 가능성이 있으므로 end를 줄임
			} else {
				start = mid + 1; // mid가 너무 작으므로 start를 올림
			}
		}
		return start; // while문을 나왔을 때 start가 최소 q값이 됨
	}
}
