package dataStructure;

import java.util.Scanner;

//문제
//자연수 A를 B번 곱한 수를 알고 싶다. 단 구하려는 수가 매우 커질 수 있으므로 이를 C로 나눈 나머지를 구하는 프로그램을 작성하시오.
//입력
//첫째 줄에 A, B, C가 빈 칸을 사이에 두고 순서대로 주어진다. A, B, C는 모두 2,147,483,647 이하의 자연수이다.

public class Boj1629 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		System.out.println(divideAndConquer(a, b, c));
	}

	public static long divideAndConquer(long a, long b, long c) {
		long result = 1;
        long base = a % c; // 초기값 설정 

        while (b > 0) {
            if (b % 2 == 1) { // 홀수이면 result에 base를 곱함
                result = (result * base) % c;
            }
            base = (base * base) % c; // base를 제곱
            b /= 2; // b를 반으로 줄임
        }

        return result;
	}
}
